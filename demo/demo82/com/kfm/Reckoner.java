package com.kfm;

import java.util.Scanner;

public class Reckoner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("请输操作符");
        String operato = sc.next();
        if (operato.equals("+"))
        {
            System.out.printf("%d + %d = %d",a,b,a+b);
        }
        else if (operato.equals("-")) {
            System.out.printf("%d - %d = %d",a,b,a-b);

        }
        else if (operato.equals("*")) {
            System.out.printf("%d * %d = %d",a,b,a*b);

        } else if (operato.equals("/")) {
            System.out.printf("%d / %d = %d",a,b,a/b);

        }
        else {
            System.out.println("您输入的不是有效的运算符");
        }

    }
}
