package src;

import java.util.Scanner;

public class findAverage {

    public static double findAverageValue(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (arr[n-1] + findAverageValue(arr, n-1)*(n-1))/n;
        }
    }

}
