package com.kfm;


import java.util.Scanner;

public class FtrasferC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入温度的形式(C或者F)：");
        String tras = sc.next();
        System.out.println("请输入温度的大小：");
        int temperature = sc.nextInt();
        int end = 0;
        if (tras.equals("C") ){
            end = (temperature*9/5)+32;
            System.out.printf("您输入了摄氏温度，经过转换后他的温度是%d",end);
        } else if (tras.equals("F")) {
            end = (temperature-32)*5/9;
            System.out.printf("您输入了华氏温度，经过转换后他的温度是%d",end);
        }
        else {
            System.out.println("您输入的不正确");
        }
    }
}
