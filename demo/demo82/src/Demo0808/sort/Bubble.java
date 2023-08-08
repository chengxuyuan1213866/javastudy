package src.Demo0808.sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //冒泡排序
        int arr[] = {3,7,15,6,8};
        int len = arr.length-1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
