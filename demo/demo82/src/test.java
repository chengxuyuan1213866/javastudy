package src;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        /*
        https://blog.csdn.net/shujuelin/article/details/82423852
         */
        int[] arr = {6, 1, 2, 7, 9, 11, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int[] arr, int start, int end){
        // 递归结束条件
        if (start >= end){
            return;
        }

        int base = arr[start];

        int left = start;
        int right = end;

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

        // 基准值的位置
        arr[start] = arr[left];
        arr[left] = base;

        // 对数组左边进行快排
        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }


}
