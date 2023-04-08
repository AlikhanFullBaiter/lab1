package src;

public class findAverage {

    /**
     * @param arr the array of n elements
     * @param n the length of the array
     * @return the average value of the array
     */
    public static double findAverageValue(int[] arr, int n) {
        if (n == 0) {
            // base case: array is empty, return 0
            return 0;
        } else {
            return (arr[n-1] + findAverageValue(arr, n-1)*(n-1))/n; // recursive call with smaller array and calculating new average
        }
    }

}
