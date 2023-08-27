package src.Demo0808;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
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
        System.out.println(Arrays.toString(arr));
        int[] arr1 = new int[len];
        int count = 0;
        out:for (int i = 0; i <= len; i++) {
            if (arr[i] == n)
            {
                continue out;
            }
            arr1[count] = arr[i];
            count++;
        }
        System.out.println(Arrays.toString(arr1));

    }



}
