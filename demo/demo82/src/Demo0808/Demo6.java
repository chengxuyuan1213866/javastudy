package src.Demo0808;

import java.util.Arrays;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int k = 10;
        int len1 = arr.length;
        int[] arr1 = new int[len1+1];
        int count = 0;
        out:for (int i = 0; i < len1+1; i++) {
            if (i == (n-1))
            {
                arr1[i] = k;
                continue out;
            }
            arr1[i] = arr[count];
            count++;

        }
        System.out.println(Arrays.toString(arr1));

    }
}
