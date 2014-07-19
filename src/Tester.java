/**
 * Created by florin on 19.07.2014.
 */
public class Tester {

    public static void main(String[] args) {
        String testString = "Test";

        try {
            System.out.println("Original 2:" + testString.substring(2));
            System.out.println("Original 4:" + testString.substring(4));
            System.out.println("Original 5:" + testString.substring(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

        try {
            System.out.println("Original 2-4:" + testString.substring(2, 4));
            System.out.println("Original 4-4:" + testString.substring(4, 4));
            System.out.println("Original 3-2:" + testString.substring(3, 2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

        try {
            System.out.println("Custom 2:" + mySubString(testString, 2));
            System.out.println("Custom 4:" + mySubString(testString, 4));
            System.out.println("Custom 5:" + mySubString(testString, 5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

        try {
            System.out.println("Custom 2-4:" + mySubString(testString, 2, 4));
            System.out.println("Custom 4-4:" + mySubString(testString, 4, 4));
            System.out.println("Custom 3-2:" + mySubString(testString, 3, 2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

        System.out.println("---------------------------------");

        CustomList customList = new CustomList();
        System.out.println("isEmpty: " + customList.isEmpty());
        System.out.println("added: " + customList.add("test_1"));
        System.out.println("added: " + customList.add("test_2"));
        System.out.println("isEmpty: " + customList.isEmpty());
        System.out.println("size: " + customList.size());
        System.out.println("remove: " + customList.remove(0));
        System.out.println("size: " + customList.size());

    }

    private static String mySubString(String string, int startPos) {
        // create char array from target string
        char[] stringArray = string.toCharArray();

        // throw exception if starPos is bigger than string's length
        if (startPos > stringArray.length) {
            throw new IndexOutOfBoundsException();
        }

        // return empty string if startPos equals string's length
        if (startPos == stringArray.length) {
            return "";
        }

        // calculate the length of substring and initialize char array for substring
        int subStringLength = stringArray.length - startPos;
        char[] subStringArray = new char[subStringLength];

        // copy chars from target string char array to substring char array
        // beginning from startPos (inclusively) to the end of target string
        for (int i = startPos; i < stringArray.length; i++) {
            subStringArray[i - startPos] = stringArray[i];
        }

        return new String(subStringArray);
    }

    private static String mySubString(String string, int startPos, int endPos) {
        // create char array from target string
        char[] stringArray = string.toCharArray();

        // throw exception if startPos or endPos is bigger that string's length
        // or endPos is before startPos
        if (startPos > stringArray.length || endPos > stringArray.length || endPos < startPos) {
            throw new IndexOutOfBoundsException();
        }

        // calculate the length of substring and initialize char array for substring
        int subStringLength = endPos - startPos;
        char[] subStringArray = new char[subStringLength];

        // copy chars from target string char array to substring char array
        // beginning from startPos (inclusively) to the endPos (exclusively)
        for (int i = startPos; i < endPos; i++) {
            subStringArray[i - startPos] = stringArray[i];
        }

        return new String(subStringArray);
    }

}
