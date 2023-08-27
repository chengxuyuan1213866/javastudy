package src.Demo0807;

import java.util.Random;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] arr = new int[20];
        System.out.println("请输入你要判断的数字：(范围在20~40之间)");
        int num = scanner.nextInt();
        int count = 0;
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = random.nextInt(20,41);
            System.out.print(arr[i]+"  ");
            if (arr[i]==num)
            {
                count++;
            }
        }
        System.out.println();
        System.out.printf("%d出现了%d次",num,count);


    }
}
