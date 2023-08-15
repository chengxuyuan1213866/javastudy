package src.Demo0815;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int start,int end)
    {
        if (start >= end){
            return;
        }
        int left = start;
        int right = end;
        int key = arr[left];

        while (left<right)
        {
            while (left<right && arr[left] <= key)
            {
                left++;
            }
            while (left <right && arr[right] >= key)
            {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        key = arr[left];
        arr[left] = key;

        sort(arr,start,left-1);
        sort(arr,left+1,end);

    }
}
