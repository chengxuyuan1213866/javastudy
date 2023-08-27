package com.kfm.opp.Demo0819;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class Main {
    static Cinema cinema = new Cinema();
    static Scanner sc = new Scanner(System.in);
    public void start()
    {
        menu();
    }

    private void menu() {
        print("*********************************");
        print("*********  1.查询电影 ************");
        print("*********  2.显示所有电影 *********");
        print("*********  3.管理员登录 ***********");
        print("*********  4.用户登录 *************");
        print("*********  5.用户注册 *************");
        print("*********  0.退出 ****************");
        print("*********************************");
        int num = sc.nextInt();
        switch (num)
        {
            case 1 -> cinema.inquire();
            case 2 -> cinema.show();
            case 3 -> cinema.administrator();
            case 4 -> cinema.userlogin();
            case 5 -> cinema.registration();
            default -> close();
        }
        menu();
    }

    private void close() {
        System.exit(0);
    }

    private void print(String msg) {
        System.out.println(msg);
    }


}
