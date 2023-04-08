package src;

public class reversedArray {

    /**
     * Reverses the given array recursively.
     *
     * @param arr   the array to be reversed
     * @param start the starting index of the array
     * @param end   the ending index of the array
     */
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            // Base case: when start >= end, we have reversed the entire array
            return;
        }

        // Swap the first and last elements of the array
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively reverse the remaining elements of the array
        reverseArray(arr, start + 1, end - 1);
    }
}