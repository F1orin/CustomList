package main.java.ua.com.florin.algorithm;

/**
 * Contains static methods with custom realizations of different sorting algorithms for sorting an array
 * <p/>
 * Created by florin on 06.08.2014.
 */
public class Sorter {

    /**
     *
     * @param a target array
     */
    public static void sortByInsertion(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                swap(a, j, j - 1);
            }
        }
    }

    /**
     *
     * @param a target array
     */
    public static void sortBySelection(int[] a) {
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    swap(a, i, j);
                }
            }
        }
    }

    /**
     *
     * @param a target array
     */
    public static void sortByBubble(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    /**
     *
     * @param a target array
     * @param low
     * @param high
     */
    public static void sortByQuick(int[] a, int low, int high) {
        int i = low;
        int j = high;
        int pivot = a[a.length / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            sortByQuick(a, low, j);
        }
        if (i < high) {
            sortByQuick(a, i, high);
        }
    }

    /**
     * Swaps the elements in the given array
     *
     * @param a target array
     * @param i first element to be swapped
     * @param j second element to be swapped
     */
    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
