package code.test.Demo0828.Simplequeue;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,3,4,};
        System.arraycopy(arr,1,arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
