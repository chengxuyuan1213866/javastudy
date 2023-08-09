package src.Demo0808;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入插入的位置");
        int n = scanner.nextInt();
        System.out.println("请输入插入的值");
        int k = scanner.nextInt();
        int len1 = arr.length;
        int[] arr1 = new int[len1+1];
        int count = 0;
        for (int i = 0; i < len1+1; i++) {
            if (i == (n-1))
            {
                arr1[i] = k;
                continue ;
            }
            arr1[i] = arr[count];
            count++;

        }
        System.out.println(Arrays.toString(arr1));

    }
}
