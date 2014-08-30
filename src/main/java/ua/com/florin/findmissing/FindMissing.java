package main.java.ua.com.florin.findmissing;

/**
 * Created by florin on 06.08.2014.
 */
public class FindMissing {

    /**
     * Finds the missing number in the array of consecutive numbers
     *
     * @param a an array with consecutive numbers with one missing
     * @return the missing number
     */
    public static int findMissing(int[] a) {

        // sum of all elements in the array
        int fullSum = 0;
        // number of elements in the array, supposing that one is missing
        int fullLen = a.length + 1;

        // calculating the sum of the array's elements
        for (int i = 1; i <= fullLen; i++) {
            fullSum += i;
        }

        // sum of the actual elements in the array
        int partSum = 0;
        // actual length of the array
        int partLen = a.length;

        // calculating the sum of actual array's elements
        for (int elem : a) {
            partSum += elem;
        }

        // the missing element will be equal to the difference between two calculated sums
        return fullSum - partSum;
    }
}
