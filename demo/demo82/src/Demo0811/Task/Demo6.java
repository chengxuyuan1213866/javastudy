package src.Demo0811.Task;

import java.util.Arrays;

public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {1,5,36,87,69,63,58};
        swap(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int n,int m)
    {
        arr[n] = arr[n] ^ arr[m];
        arr[m] = arr[n] ^ arr[m];
        arr[n] = arr[n] ^ arr[m];
    }
}
