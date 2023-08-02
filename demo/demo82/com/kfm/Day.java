package com.kfm;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年");
        int year = sc.nextInt();
        System.out.println("请输入月");
        int mon = sc.nextInt();
        int days = 0;
        if ((mon<=7 && mon%2 !=0)|| (mon>=8 && mon%2 == 0))
        {
            days = 31;
        } else if (mon==2) {
            if ((year % 4 == 0) && (year % 100 !=0)|| ( year % 400 == 0)) {
                days = 29;
            }
            else
            {
                days = 28;
            }

        }
        System.out.printf("%d年%d月有%d天",year,mon,days);
    }
}
