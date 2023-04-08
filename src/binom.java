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
