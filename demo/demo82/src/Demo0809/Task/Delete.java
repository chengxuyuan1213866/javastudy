package src.Demo0809.Task;

import java.util.Arrays;

public class Delete {
    public static void main(String[] args) {
        int[] nums = {2, 11, 33, 44, 55, 66, 277};
        int[] arr = new int[nums.length-1];
        System.arraycopy(nums,0,arr,0,2);
        System.arraycopy(nums,3,arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
}
