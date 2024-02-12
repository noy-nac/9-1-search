import java.util.*;

public class Main {

    /** @pre     at least one element is in array
     *  @post    elements in array are **unmodified** by this method
     *  @return the index of target in array, if present, and -1 otherwise
     *          if target appears in array more than once, return any index of target in array
     **/
    public static int linearSearch(int[] array, int target) {
        // TODO implement linear search

        return -1;
    }

    /** @pre    elements in array are monotonically increasing;
     *          at least one element is in array
     *  @post   elements in array are **unmodified** by this method
     *  @return the index of target in array, if present, and -1 otherwise
     *          if target appears in array more than once, return any index of target in array
     **/
    public static int binarySearch(int[] array, int target) {
        // TODO implement binary search using a loop

        return -1;
    }

    /** @pre    elements in array are monotonically increasing; 
     *          at least one element is in array;
     *          0 <= start, end < array.length
     *  @post   elements in array are **unmodified** by this method
     *  @return the index of target in array, if present, and -1 otherwise
     *          if target appears in array more than once, return any index of target in array
     **/
    public static int recursiveBinarySearch(int[] array, int target, int start, int end) {
        // TODO implement binary search using recursion

        return -1;
    }
    

    public static void printFail(String type, int[] arr, int target, int expected, int actual) {
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("\tUsing " + type + ":");
        System.out.println("\tSearch for " + target + " returned index " + actual + ", expected " + expected);
    }

    // runs a few tests
    // there's a much better way to run tests than this btw
    public static void main(String[] args) {
        int[] arr1 = new int[]{10};
        int[] arr2 = new int[]{10, 20, 30, 40};
        int[] arr3 = new int[]{10, 20, 30, 40, 50};

        // linear search
        int idx = linearSearch(arr1, 10);
        if(idx != 0) {
            printFail("linearSearch", arr1, 10, 0, idx);
        }
        idx = linearSearch(arr2, 40);
        if(idx != 3) {
            printFail("linearSearch", arr2, 40, 3, idx);
        }
        idx = linearSearch(arr2, 20);
        if(idx != 1) {
            printFail("linearSearch", arr2, 20, 1, idx);
        }

        idx = linearSearch(arr3, 50);
        if(idx != 4) {
            printFail("linearSearch", arr3, 50, 4, idx);
        }

        idx = linearSearch(arr1, 100);
        if(idx != -1) {
            printFail("linearSearch", arr1, 100, -1, idx);
        }
        idx = linearSearch(arr2, 100);
        if(idx != -1) {
            printFail("linearSearch", arr2, 100, -1, idx);
        }
        idx = linearSearch(arr3, 100);
        if(idx != -1) {
            printFail("linearSearch", arr3, 100, -1, idx);
        }

        // binary search
        idx = binarySearch(arr1, 10);
        if(idx != 0) {
            printFail("binarySearch", arr1, 10, 0, idx);
        }
        idx = binarySearch(arr2, 40);
        if(idx != 3) {
            printFail("binarySearch", arr2, 40, 3, idx);
        }
        idx = binarySearch(arr2, 20);
        if(idx != 1) {
            printFail("binarySearch", arr2, 20, 1, idx);
        }

        idx = binarySearch(arr3, 50);
        if(idx != 4) {
            printFail("binarySearch", arr3, 50, 4, idx);
        }

        idx = binarySearch(arr1, 100);
        if(idx != -1) {
            printFail("binarySearch", arr1, 100, -1, idx);
        }
        idx = binarySearch(arr2, 100);
        if(idx != -1) {
            printFail("binarySearch", arr2, 100, -1, idx);
        }
        idx = binarySearch(arr3, 100);
        if(idx != -1) {
            printFail("binarySearch", arr3, 100, -1, idx);
        }

        // recursive binary search
        idx = recursiveBinarySearch(arr1, 10, 0, arr1.length-1);
        if(idx != 0) {
            printFail("recursiveBinarySearch", arr1, 10, 0, idx);
        }
        idx = recursiveBinarySearch(arr2, 40, 0, arr2.length-1);
        if(idx != 3) {
            printFail("recursiveBinarySearch", arr2, 40, 3, idx);
        }
        idx = recursiveBinarySearch(arr2, 20, 0, arr2.length-1);
        if(idx != 1) {
            printFail("recursiveBinarySearch", arr2, 20, 1, idx);
        }

        idx = recursiveBinarySearch(arr3, 50, 0, arr3.length-1);
        if(idx != 4) {
            printFail("recursiveBinarySearch", arr3, 50, 4, idx);
        }

        idx = recursiveBinarySearch(arr1, 100, 0, arr1.length-1);
        if(idx != -1) {
            printFail("recursiveBinarySearch", arr1, 100, -1, idx);
        }
        idx = recursiveBinarySearch(arr2, 100, 0, arr2.length-1);
        if(idx != -1) {
            printFail("recursiveBinarySearch", arr2, 100, -1, idx);
        }
        idx = recursiveBinarySearch(arr3, 100, 0, arr3.length-1);
        if(idx != -1) {
            printFail("recursiveBinarySearch", arr3, 100, -1, idx);
        }
    }
}
