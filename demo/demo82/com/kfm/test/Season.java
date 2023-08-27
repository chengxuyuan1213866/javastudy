package com.kfm;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        switch (month/3){
            case 0,4-> System.out.println("冬天");
            case 1 -> System.out.println("春天");
            case 2 -> System.out.println("夏天");
            case 3 -> System.out.println("秋天");
            default -> System.out.println("输入错误");
        }
    }
}
