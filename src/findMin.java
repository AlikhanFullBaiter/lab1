package src;
public class findMin {

    public static int findMinFromArr(int[] arr, int n){
        if(n==1)
            return arr[0];
        else{
            int min = findMinFromArr(arr, n-1);
            return Math.min(min, arr[n-1]);
        }
    }

}