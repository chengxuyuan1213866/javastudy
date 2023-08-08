package src.Demo0808;

import java.util.Arrays;

/**
 * @author Administrator
 * 选择排序
 */
public class ChoiceSort {
    public static void main(String[] args) {
        int[] arr = {5,8,9,3,7,1};
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;        // 更新每次循环开始最小值的初始值
            for (int j = i+1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
