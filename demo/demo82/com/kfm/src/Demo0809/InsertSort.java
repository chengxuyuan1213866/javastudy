package src.Demo0809;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //
        // 插入排序
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index] < num) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = num;
        }
        System.out.println(Arrays.toString(arr));
    }
}
