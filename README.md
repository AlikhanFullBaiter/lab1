# Main class  🥇
This is a Java program that includes various mathematical functions. The functions are divided into separate classes, and are imported into the main class using the import statement.

# Usage 👨‍💻
The ***Main*** class is the main class of the program that provides a menu for the user to select the desired function to use. The menu prompts the user to enter a number corresponding to the function they want to use. Based on the user input, the program calls the appropriate function from the other classes and prints the result to the console.
```bash
import java.util.Arrays;
import java.util.Scanner;

import static src.Factorial.factorial;
import static src.Fibonacci.findFibonacci;
import static src.binom.binomialCoefficient;
import static src.findAverage.findAverageValue;
import static src.findMin.findMinFromArr;
import static src.findPrimeNumber.isPrime;
import static src.gcd.findGcd;
import static src.isDigit.isAllDigits;
import static src.powerOfNumber.power;
import static src.reversedArray.reverseArray;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("finding minumum value - 1");
        System.out.println("finding average value - 2");
        System.out.println("finding prime or not value - 3");
        System.out.println("finding factorial - 4");
        System.out.println("finding Fibonacci value - 5");
        System.out.println("finding the power - 6");
        System.out.println("finding reversed array - 7");
        System.out.println("finding is digit- 8");
        System.out.println("finding binomial coefficient - 9");
        System.out.println("finding GCD - 10");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            //FIND MIN VALUE FROM ARRAY
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
            //FIND AVERAGE VALUE FROM ARRAY
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
            //FIND IF THE GIVEN NUMBER IS PRIME
                System.out.println("Enter the value");
                int number = scanner.nextInt();
                if (isPrime(number)) {
                    System.out.println("prime");
                } else {
                    System.out.println("composite");
                }
                break;
            case 4:
            //FIND THE FACTORIAL
                System.out.println("Enter the value");
                int factor = scanner.nextInt();
                int fact = factorial(factor);
                System.out.println(fact);
                break;
            case 5:
            //FIND FIBONACCI VALUE
                System.out.println("Enter the value");
                int fibo = scanner.nextInt();
                System.out.println(findFibonacci(fibo));
                break;
            case 6:
            //FIND THE POWER OF GIEN NUMBER
                System.out.println("Enter the value of a");
                int a = scanner.nextInt();
                System.out.println("Enter the value of n");
                int na = scanner.nextInt();
                System.out.println(power(a , na));
                break;
            case 7:
            //FIND REVERSED ARRAY
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
            //FIND IF THE GIVEN STRING CONSISTS ONLY OF DIGITS
                System.out.println("Enter the string");
                String st = scanner.next();
                boolean isAllDigits = isAllDigits(st);
                System.out.println(isAllDigits);
                break;
            case 9:
            //FIND BINOMAL COEFFICIENT
                System.out.println("enter the n");
                int nn = scanner.nextInt();
                System.out.println("enter the k");
                int k = scanner.nextInt();
                int c = binomialCoefficient(nn, k);
                System.out.println("C(" + nn + ", " + k + ") = " + c);
                break;
            case 10:
            //FIND GCD
                System.out.println("Enter the first value");
                int first = scanner.nextInt();
                System.out.println("Enter the second value");
                int second = scanner.nextInt();
                int gcd = findGcd(first, second);
                System.out.println(gcd);
                break;
        }
    }
}
```
# Task 1 

This code is a Java implementation of a recursive algorithm to find the minimum value in an array of integers.

# Functionality 🚀

The ***findMinFromArr*** method takes two arguments: an array of integers and the number of elements in the array. It returns the minimum value in the array.

The method first checks if there is only one element in the array (the base case) and returns it. Otherwise, it recursively calls itself with the first n-1 elements of the array and compares the minimum value obtained with the nth element.

# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
public class findMin {
    /**
     * @param arr the array of n elements
     * @param n   the number of elements in the array
     * @return the minimum value in the array
     */
    public static int findMinFromArr(int[] arr, int n){
        // Base case: when there is only one element in the array
        if(n==1)
            return arr[0];
            // Recursive case: when there are more than one elements in the array
        else{
            // Recursively find the minimum of the first n-1 elements
            int min = findMinFromArr(arr, n-1);
            // Compare the minimum value obtained from the first n-1 elements with the nth element
            return Math.min(min, arr[n-1]);
        }
    }
}
```


# Task 2

This code is a Java implementation of a recursive algorithm to find the average value of an array of integers.


# Functionality 🚀

The ***findAverageValue*** method takes two arguments: an array of integers and the length of the array. It returns the average value of the array.

The method first checks if the array is empty (the base case) and returns 0. Otherwise, it recursively calls itself with a smaller array obtained by removing the last element of the original array. The new average is calculated by adding the last element of the original array to the product of the previous average and the length of the smaller array, and then dividing by the length of the original array.

# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash

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
```
# Task 3 

This code is a Java implementation of a function to check if a given number is prime or not.


# Functionality 🚀

The ***isPrime*** method takes one argument: a number to be checked for primality. It returns true if the number is prime and false otherwise.

The method first checks if the number is less than or equal to 1 (not prime). It then checks for factors of the number from 2 to the square root of the number. If the number is divisible by any factor, it is not prime and the method returns *false*. If the number is not divisible by any factor between 2 and the square root of the number, it is prime and the method returns *true*.

# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash

public class findPrimeNumber {
    /**

     * @param n the number to be checked
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // 1 and any number less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        // check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // if the number is divisible by i, it is not prime
            if (n % i == 0) {
                return false;
            }
        }
        // if the number is not divisible by any number between 2 and the square root of the number, it is prime
        return true;
    }

}
```

# Task 4
This code is a Java implementation of a function to compute the factorial of a given number.

# Functionality 🚀

The ***factorial*** method takes one argument: a number n whose factorial is to be computed. It returns the factorial of n.

The method first checks if n is equal to 0, in which case it returns 1 (0! = 1). Otherwise, it calculates the factorial of n-1 recursively and multiplies the result by n to obtain the factorial of n.

# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
public class Factorial {

    /**
     * @param n the number whose factorial is to be computed
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
```

# Task 5

This code is a Java implementation of a function to compute the nth Fibonacci number.

# Functionality 🚀

The ***findFibonacci*** method takes one argument: the index n of the Fibonacci number to be computed. It returns the nth Fibonacci number.

The method uses recursion to calculate the Fibonacci number. There are two base cases: when n is 0, the method returns 0 (the 0th Fibonacci number is 0), and when n is 1, the method returns 1 (the 1st Fibonacci number is 1). For all other values of n, the method calculates the sum of the (n-1)th and (n-2)th Fibonacci numbers recursively.
# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
public class Fibonacci {

    /**

     * @param n the index of the Fibonacci number to be computed
     * @return the nth Fibonacci number
     */
    public static int findFibonacci(int n) {
        // Base case 1: the 0th Fibonacci number is 0
        if (n == 0) {
            return 0;
        }
        // Base case 2: the 1st Fibonacci number is 1
        else if (n == 1) {
            return 1;
        }
        // Recursive case: compute the sum of the (n-1)th and (n-2)th Fibonacci numbers
        else {
            return findFibonacci(n - 1) + findFibonacci(n - 2);
        }
    }
}
```

# Task 6
This code is an implementation of the power function, which calculates the value of a number raised to a specified power. The function takes two arguments, a and n, representing the base number and the exponent respectively, and returns the result of a raised to the power of n.

# Functionality 🚀

The ***power*** function is implemented using a recursive approach. The function first checks if the exponent is 0, in which case it returns 1, since any number raised to the power of 0 is 1. If the exponent is not 0, the function recursively computes the value of a raised to the power of (n-1), and then multiplies it by a to obtain the final result.
# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
public class powerOfNumber {

    /**
     * @param a the base number
     * @param n the exponent
     * @return the result of a raised to the power of n
     */
    public static int power(int a, int n) {
        // Base case: any number raised to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: compute the result of a raised to the power of (n-1) and multiply it by a
        else {
            return a * power(a, n - 1);
        }
    }
}
```

# Task 7
This code is a Java implementation of a function to reverse an array recursively.

# Functionality 🚀

The ***reverseArray*** method takes three arguments: the array to be reversed (arr), the starting index of the array (start), and the ending index of the array (end). It reverses the array in place using a recursive approach.

The method works by swapping the first and last elements of the array using a temporary variable. It then recursively calls itself with the starting index incremented by one and the ending index decremented by one, effectively reversing the remaining elements of the array.

The method has a base case where it returns if the starting index is greater than or equal to the ending index, indicating that the entire array has been reversed.
# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
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
```

# Task 8
The code you provided is an implementation of a function that checks if a given string consists only of digits.

# Functionality 🚀

The ***isAllDigits*** method takes a String argument s and returns a boolean value. The method iterates through each character in the string s and checks if it is a digit using the ***Character.isDigit()*** method. If any non-digit character is found, the method immediately returns *false*. If all characters in the string are digits, the method returns *true*.
# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
import org.jetbrains.annotations.NotNull;

public class isDigit {
    /**
     * This function checks whether the given string consists of all digits.
     *
     * @param s the string to check
     * @return true if the string consists of all digits, false otherwise
     */
    public static boolean isAllDigits(@NotNull String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                // If the character is not a digit, return false
                return false;
            }
        }
        // If we get here, all characters are digits, so return true
        return true;
    }
}
```

# Task 9
This code is a Java implementation of a function to calculate the binomial coefficient C(n, k).

# Functionality 🚀

The ***binomialCoefficient*** method takes two arguments: n and k, where n is the total number of items and k is the number of items to choose. It returns the binomial coefficient C(n, k).

The method uses recursion to calculate the binomial coefficient. There are two base cases: when k is 0 or k is equal to n, the method returns 1. For all other values of k, the method calculates the binomial coefficient recursively using the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
package src;

public class binom {
    /**
     * Calculates the binomial coefficient C(n, k) using the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
     *
     * @param n the total number of items
     * @param k the number of items to choose
     * @return the binomial coefficient C(n, k)
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            // Base case: C(n, 0) = C(n, n) = 1
            return 1;
        } else {
            // Recursive case: use the formula C(n, k) = C(n-1, k-1) + C(n-1, k)
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}
```

# Task 10
This code is an implementation of a function to find the greatest common divisor (GCD) of two integers using recursion and the Euclidean Algorithm.
# Functionality 🚀

The ***findGcd*** method takes two arguments: the first integer (a) and the second integer (b). It finds the GCD of the two integers by recursively applying the *Euclidean Algorithm* with b and the remainder of a/b until b is equal to 0. The GCD is then returned.

The *Euclidean Algorithm* states that the GCD of two integers is equal to the GCD of the second integer and the remainder of the first integer divided by the second integer. This process is repeated with the second integer and the remainder until the remainder is 0.

The method has a base case where it returns a if b is equal to 0, indicating that a is the GCD.
# Usage 👨‍💻
To use this code, you can go to ***Main*** class and you can select the function you want to use.
```bash
public class gcd {
    /**
     * This function finds the greatest common divisor (GCD) of two integers a and b using recursion and the Euclidean Algorithm.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the GCD of a and b
     */
    public static int findGcd(int a, int b) {
        if (b == 0) {
            // Base case: if b is 0, the GCD is a
            return a;
        } else {
            // Recursive case: apply Euclidean Algorithm with b and the remainder of a/b
            int r = a % b;
            return findGcd(b, r);
        }
    }

}
```
