package src;

import java.util.Arrays;
import java.util.Scanner;

import static src.Factorial.factorial;
import static src.Fibonacci.findFibonacci;
import static src.binom.binomialCoefficient;
import static src.findAverage.findAverageValue;
import static src.findMin.findMinFromArr;
import static src.findPrimeNumber.isPrime;
import static src.isDigit.isAllDigits;
import static src.powerOfNumber.power;
import static src.reversedArray.reverseArray;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("finding minumum value - 1");
        System.out.print("finding average value - 2");
        System.out.print("finding prime or not value - 3");
        System.out.print("finding factorial - 4");
        System.out.print("finding Fibonacci value - 5");
        System.out.print("finding the power - 6");
        System.out.print("finding reversed array - 7");
        System.out.print("finding is digit- 8");
        System.out.print("finding binomial coefficient - 9");
        System.out.println("finding GCD - 10");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the lenght of array : ");
                int n = scanner.nextInt();
                int[] array = new int[n];
                System.out.println("Enter the array : ");
                for (int i=0; i<n; i++){
                    array[i] = scanner.nextInt();
                }
                int min = findMinFromArr(array, n);
                System.out.println("Minimum is " + min);
                break;
            case 2:
                System.out.println("Enter the lenght of array : ");
                int l = scanner.nextInt();
                int[] ar = new int[l];
                System.out.println("Enter the array : ");
                for (int i=0; i<l; i++){
                    ar[i] = scanner.nextInt();
                }
                double avg = findAverageValue(ar, l);
                System.out.println("Average: " + avg);
                break;
            case 3:
                System.out.println("Enter the value");
                int number = scanner.nextInt();
                if (isPrime(number)) {
                    System.out.println("prime");
                } else {
                    System.out.println("composite");
                }
                break;
            case 4:
                System.out.println("Enter the value");
                int factor = scanner.nextInt();
                int fact = factorial(factor);
                System.out.println(fact);
                break;
            case 5:
                System.out.println("Enter the value");
                int fibo = scanner.nextInt();
                System.out.println(findFibonacci(fibo));
                break;
            case 6:
                System.out.println("Enter the value of a");
                int a = scanner.nextInt();
                System.out.println("Enter the value of n");
                int na = scanner.nextInt();
                System.out.println(power(a , na));
                break;
            case 7:
                System.out.println("Enter the lenght of the array :");
                int lenght = scanner.nextInt();
                System.out.println("Enter the array : ");
                int[] arra = new int[lenght];
                for(int i = 0; i< lenght; i++) {
                    arra[i] = scanner.nextInt();
                }
                reverseArray(arra, 0, arra.length - 1);
                System.out.println("Reversed array: " + Arrays.toString(arra));
                break;
            case 8:
                System.out.println("Enter the string");
                String st = scanner.next();
                boolean isAllDigits = isAllDigits(st);
                System.out.println(isAllDigits);
                break;
            case 9:
                System.out.println("enter the n");
                int nn = scanner.nextInt();
                System.out.println("enter the k");
                int k = scanner.nextInt();
                int c = binomialCoefficient(nn, k);
                System.out.println("C(" + nn + ", " + k + ") = " + c);
                break;
        }
    }
}

