package src;


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