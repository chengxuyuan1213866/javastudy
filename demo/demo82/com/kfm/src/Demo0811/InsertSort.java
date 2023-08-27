package src.Demo0811;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5,8,6,96,39,31,42};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i - 1;
            while (index>=0 && arr[index] > temp)
            {
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = temp;
        }
    }
}
