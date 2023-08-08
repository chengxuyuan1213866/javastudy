package src.Demo0808;

import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        /*
        * 求两个数组的交集
        * */
        int[] arr = {1, 2, 3};
        int[] arr1 = {2, 3};
        int len = arr.length;
        int len1 = arr1.length;
        int n = 0;
        if (len <=len1) {
            n = len1;
        }
        else {
            n = len;
        }
        int arr2[] = new int[n];

        for (int i = 0; i < len1; i++) {
            for (int j = 0;j< len;j++)
            {
                if (arr[j]==arr1[i])
                {
                   arr2[i] = arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
