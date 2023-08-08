package src.Demo0808;

import java.util.Arrays;

/**
 * @author Administrator
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {5,7,86,13,52,2,5};
        // 将数组分为已排序和未排序两部分，遍历未排序的部分，将其插入对应已经排序的序列中
        int len = arr.length;
        for (int i = 0; i < len; i++) {     // 外层循环表示已经排序的部分
            int index = i-1;
            int temp = arr[i];

            while (index >= 0 && temp< arr[index]){
                arr[index+1] = arr[index];
                index--;
            }  // 内层循环是将未排序的部分插入到正确的已排序的部分
            if (index != i) {
                arr[index+1] = temp;
            }


            }
        System.out.println(Arrays.toString(arr));

        }




}



