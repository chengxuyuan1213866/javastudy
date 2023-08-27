package src.Demo0808;

import java.util.Scanner;

public class Demo4 {
    /*
    *给定一个整数数组，输入一个值 n, 输出数组中第 n 大的数。

     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int len = arr.length-1;
        for(int i = 0; i < len;i++)
        {
            for (int j = 0; j < len-i; j++) {
                if (arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.printf("数组中第%d大的数是%d",n,arr[n-1]);

    }



}
