package src.Demo0815;

import java.util.Arrays;

public class delete {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        int k = 3;
        int[] arr1 = del(arr,k);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] del(int[] arr,int k)
    {
        int[] arr1 = new int[arr.length-1];
        System.arraycopy(arr,0,arr1,0,k-1);
        System.arraycopy(arr,k,arr1,k-1,arr.length-k);
        return arr1;

    }
}
