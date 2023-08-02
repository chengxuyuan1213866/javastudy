package com.kfm;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工资");
        double wage = sc.nextDouble();
        System.out.println("请输入工龄");
        int age = sc.nextInt();
        if (age<=5){
            System.out.printf("您的工龄小于等于5年,您的奖金为%f",wage*0.05);
        }
        else if ((age>5)||(age<=10)){
            System.out.printf("您的工龄在5-10年之间,您的奖金为%f",wage*0.1);
        }
        else {
            System.out.printf("您的工龄在大于10年,您的奖金为%f",wage*0.15);
        }


    }
}
