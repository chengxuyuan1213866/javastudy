package src.Demo0815;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {1,10,10,7,6,5,4,3,2,10};
        sort(arr,0, arr.length-1);
        //quickSort1(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int start,int end)
    {
        if (start >= end){
            return;
        }
        int key = arr[start];
        int left = start;
        int right = end;


        while(left < right){

            while (left < right && arr[right] >= key){
                right --;
            }

            while(left < right && arr[left] <= key){
                left ++;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // 交换基准值的位置
        arr[start] = arr[left];
        arr[left] = key;

        sort(arr,start,left-1);
        sort(arr,left+1,end);

    }
    public static void quickSort1(int[] arr, int start, int end){
        // 结束标识
        if (start >= end){
            return;
        }

        int base = arr[start]; // 基准值
        int left = start, right = end;

        while(left < right){

            while (left < right && arr[right] >= base){
                right --;
            }

            while(left < right && arr[left] <= base){
                left ++;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // 交换基准值的位置
        arr[start] = arr[left];
        arr[left] = base;

        // 对左边元素进行快排
        quickSort1(arr, start, left - 1);

        // 对右边元素进行快排
        quickSort1(arr, left + 1, end);


    }
}
