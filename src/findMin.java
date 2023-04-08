package src;
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