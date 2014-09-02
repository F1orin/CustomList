package main.java.ua.com.florin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/**
 * Created by florin on 02.09.2014.
 */
public class CSVParser {
    public static void main(String[] args) {
        String data = "ip,name,desc\n" +
                "10.49.1.4,server1,Main Server\n" +
                "10.52.5.1,server2,Backup Server\n";
        CSVSearch csvByName = new YourCSVSearch(data, "name");
        String s1 = csvByName.find("server2").getField("ip"); // must return "10.52.5.1"
        System.out.println(s1);
        String s2 = String.valueOf(csvByName.find("server9")); // must return null
        System.out.println(s2);
    }
}

interface CSVSearch {
    CSVRecord find(String key);
}

interface CSVRecord {
    String getField(String name);
}

class YourCSVSearch implements CSVSearch {
    Record[] table;
    int subSearchCol;

    public YourCSVSearch(String data, String field) {
        parse(data);
        subSearchCol = colByName(field);
    }

    public CSVRecord find(String key) {
        if(subSearchCol < 0) return null;
        for (Record r : table) {
            if (r.record[subSearchCol].equals(key)) {
                return r;
            }
        }
        return null;
    }

    private void parse(String data) {
        ArrayList<Record> records =  new ArrayList<Record>();
        BufferedReader br = new BufferedReader(
                new StringReader(data));
        try {
            String line;
            while((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                records.add(new Record(tokens));
            }
            table = records.toArray(new Record[records.size()]);
            br.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally	{
            try {
                br.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private int colByName(String name) {
        for (int i = 0; i < table[0].record.length; i++) {
            if(table[0].record[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private class Record implements CSVRecord {
        String[] record;

        public Record(String[] row){
            record = row;
        }

        public String getField(String name) {
            int col = YourCSVSearch.this.colByName(name);
            if(col < 0) {
                throw new IllegalArgumentException("No such column \"" + name + "\"");
            } else {
                return record[col];
            }
        }
    }
}