package src.Demo0807;

import java.util.Random;

public class Six {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random ro = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ro.nextInt(100);
        }
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            sum += arr[j];
        }
        System.out.println("数组内元素的和是：" + sum);
    }


}
