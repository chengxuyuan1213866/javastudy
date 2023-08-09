package src.Demo0809;

import java.util.Arrays;

public class ArraysTool {
    public static void main(String[] args) {
        int[] arr = {1,5,6,76,5};
        Arrays.fill(arr,6);
        System.out.println(Arrays.toString(arr));


/*        public static void main(String[] args) {
            int[] arr = {1,2,3,4};
            int[] arr1 = {1,2,3,4};
            System.out.println(Arrays.equals(arr,arr1));
        }
// 结果是true
        public static void main(String[] args) {
            int[] arr = {1,2,3,4};
            int[] arr1 = {1,2,3};
            System.out.println(Arrays.equals(arr,arr1));
        }
// 结果是false*/


/*        public static void main(String[] args) {
            int[] arr = {1,5,6,8,9,4};
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
// [1, 4, 5, 6, 8, 9]*/




    }


}
