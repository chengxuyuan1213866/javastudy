package src.Demo0807;

import java.util.Random;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.println("请输入1-60之间的数字");
            arr[i] = scanner.nextInt();
        }
        Random random = new Random();
        int num = random.nextInt(2,11);
        System.out.println("生成的随机数为" + num);
        for (int i = 0; i < len; i++) {
            if (arr[i]%num!=0)
                System.out.println(arr[i]);
        }


    }
}
