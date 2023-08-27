package src.Demo0808;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (i!= j && arr[i] == arr[j])
                {
                    arr[j] = 0;
                    count++;

                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        int arr1[] = new int[len-count];
        int a = 0;
        for(int i = 0; i<len; i++)
        {
            if (arr[i]!= 0) {
                arr1[a] = arr[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
