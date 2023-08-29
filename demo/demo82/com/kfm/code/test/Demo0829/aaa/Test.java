package com.kfm.code.test.Demo0829.aaa;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Param cat = new Param() {
            @Override
            void say() {
                System.out.println("这是一只" + name);
            }
        };
        cat.say();

    }
}
