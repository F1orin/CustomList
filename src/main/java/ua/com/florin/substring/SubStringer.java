package main.java.ua.com.florin.substring;

/**
 * Contains custom realizations of substring methods for the sake of practice
 * <p/>
 * Created by florin on 20.07.2014.
 */
public class SubStringer {

    /**
     * Returns the substring beginning from the given start position inclusively
     *
     * @param string   target string for getting the substring
     * @param startPos start position from which to get the substring (inclusively)
     * @return substring from startPos inclusively
     */
    public static String mySubString(String string, int startPos) {

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

    /**
     * Returns the substring beginning from the given start position inclusively and endPosition exclusively
     *
     * @param string   target string for getting the substring
     * @param startPos start position from which to get the substring (inclusively)
     * @param endPos   end position to which to get the substring (exclusively)
     * @return substring from startPos inclusively and endPos exclusively
     */
    public static String mySubString(String string, int startPos, int endPos) {
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
