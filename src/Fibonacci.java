package src;

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
