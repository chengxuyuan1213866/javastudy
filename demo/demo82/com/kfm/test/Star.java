package com.kfm;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入日期");
        int date = sc.nextInt();
        switch (month){
            case 1 -> {System.out.println(date>=20?"水瓶座":"魔羯座");}
            case 2 -> {System.out.println(date>=19?"双鱼座":"水瓶座");}
            case 3 -> {System.out.println(date>=21?"白羊座":"双鱼座");}
            case 4 -> {System.out.println(date>=20?"金牛座":"白羊座");}
            case 5 -> {System.out.println(date>=22?"双子座":"金牛座");}
            case 6 -> {System.out.println(date>=21?"巨蟹座":"双子座");}
            case 7 -> {System.out.println(date>=23?"狮子座":"巨蟹座");}
            case 8 -> {System.out.println(date>=23?"处女座":"狮子座");}
            case 9 -> {System.out.println(date>=23?"天秤座":"处女座");}
            case 10 -> {System.out.println(date>=23?"天蝎座":"天秤座");}
            case 11 -> {System.out.println(date>=22?"射手座":"天蝎座");}
            case 12 -> {System.out.println(date>=22?"摩羯座":"射手座");}
            default -> {
                System.out.println("输入错误");
            }

    }
}
}
