package src;

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
