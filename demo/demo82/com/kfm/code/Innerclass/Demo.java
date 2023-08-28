package com.kfm.code.Innerclass;

public class Demo {

    class A{
        static {
            int a = 10;
        }
        A()
        {
            System.out.println("内部类的构造进行");
        }
    }

}
