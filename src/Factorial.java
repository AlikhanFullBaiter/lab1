package src;

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