package src.Demo0805;

import java.util.Scanner;

import static java.lang.Math.pow;


public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        System.out.println("请输入位数");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // int a = (int) ((num/(pow(10,i-1)))%10);
            if ((int) ((num/(pow(10,i-1)))%10) == (int) ((num/(pow(10,n-i-1)))%10)){
                System.out.println("是回文数");
                break;
            }
        }
        System.out.println("不是回文数");





    }
}
