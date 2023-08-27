package src.Demo0810;

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 3;
        int k = 7;
        int[] arrNew = new int[arr.length];
        System.arraycopy(arr,0,arrNew,0,n-1);
        arrNew[n-1] = k;
        System.arraycopy(arr,n,arrNew,n,arr.length-n);
        System.out.println(Arrays.toString(arrNew));

    }
}
