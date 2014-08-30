package main.java.ua.com.florin;

import main.java.ua.com.florin.customlist.CustomList;
import main.java.ua.com.florin.substring.SubStringer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by florin on 19.07.2014.
 */
public class Runner {

    public static void main(String[] args) {
        List<String> stringList = new LinkedList<String>();
        for (int i = 0; i < 10; i++) {
            stringList.add("test " + i);
        }
        System.out.println(stringList);

        stringList.subList(0, 5).clear();
        System.out.println(stringList);
    }

}
