package com.kfm;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入月份");
            int mon = sc.nextInt();
            if ((mon>=1) && (mon<=12))
            {
                System.out.println("输入了" + mon + "月");
                break;
            }
        }
    }
}
