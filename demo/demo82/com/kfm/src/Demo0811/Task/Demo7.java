package src.Demo0811.Task;

import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr1 = new int[arr.length];
        int k = 3;
        arr1 = leftShift(arr,k);
        System.out.println(Arrays.toString(arr1));



    }
    public static int[] leftShift(int[] arr, int k)
    {
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr,k,arr1,0,arr.length-k);
        System.arraycopy(arr,0,arr1,arr.length-k,k);
        return arr1;
    }
}
