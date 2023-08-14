package src;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
            int[] a = {1,2,3,4,5,6,7,8};
            int k = 9;
            int n = 3;
            int[] arr = insert(k,n,a);
            System.out.println(Arrays.toString(arr));

    }
    public static int[] insert(int k,int n,int[] arr)
    {
        int[] arr1 = new int[arr.length+1];
        System.arraycopy(arr,0,arr1,0,k-1);
        arr[k] = n;
        System.arraycopy(arr,k,arr1,k+1,arr.length-k);
        return arr1;
    }


}
