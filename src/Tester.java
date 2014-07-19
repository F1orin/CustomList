/**
 * Created by florin on 7/17/14.
 */
public class Tester {

    public static void main(String[] args) {
        String testString = "Test";
        System.out.println("Original 2:" + testString.substring(2));
        System.out.println("Original 4:" + testString.substring(4));
//        System.out.println("Original 5:" + testString.substring(5));
        System.out.println("Custom 2:" + mySubString(testString, 2));
        System.out.println("Custom 4:" + mySubString(testString, 4));
//        System.out.println("Custom 5:" + mySubString(testString, 5));
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
        return null;
    }

}
