package src;

import java.util.Scanner;

public class findAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double avg = findAverage(arr, n);
        System.out.println("Average: " + avg);
    }

    public static double findAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (arr[n-1] + findAverage(arr, n-1)*(n-1))/n;
        }
    }

}
