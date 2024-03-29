package src.Demo0814;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
/*        for (int i = 0; i < arr.length/2; i++) {
            int key = i;
            int left = 0;
            int right = arr.length-1;
            while (left < right) {

                //右边找比key小的值
                while (left < right && arr[right] >= arr[key]) {
                    right--;
                }
                //左边找比key大的值
                while (arr[left] <= arr[key] && left<right) {
                    left++;
                }
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            int tem = arr[left];
            arr[left] = arr[key];
            arr[key] = tem;

        }
        System.out.println(Arrays.toString(arr))*/;
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int start,int end){
        if (start >= end){
            return;
        }
        int key = arr[start];
        int left = start;
        int right = end;

        while (left<right)
        {
            while (left < right && arr[right]>=key){
                right--;
            }
            while (left < right && arr[left] <= key){
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        arr[start] = arr[left];
        arr[left] = key;

        sort(arr, start,left-1);
        sort(arr, left+1, end);

    }

}
