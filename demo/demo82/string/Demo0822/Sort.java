package string.Demo0822;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,6,9,6};
        int s = 0;
        int e = arr.length - 1;
        //bubblesort(arr);
        //quicksort(s,e,arr);
        //choicesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    /* *
    * 快速排序
    * */
    public static void quicksort(int start,int end,int[] arr)
    {
        if (start >=end)
        {
            return;
        }
        int left = start;
        int right = end;
        int index = arr[start];
        while (left < right)
        {
            while (left<right && arr[right]>=index)
            {
                right --;
            }
            while (left<right && arr[left]<=index)
            {
                left ++;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        arr[start] = arr[left];
        arr[left] = index;
        quicksort(start,left - 1,arr);
        quicksort(left +1 ,end,arr);
    }
    public static void bubblesort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void choicesort(int[] arr)
    {

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<=arr[min])
                {
                    min = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }



}
