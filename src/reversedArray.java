package src;

import java.util.Scanner;

public class reversedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        reverse(array, n);

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + ' ');
        }
    }

    public static void reverse(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
