package src;

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
