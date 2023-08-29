package com.kfm.code.test.Demo0829;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.test();// 输出 A=>test()

        B b = new A();
        b.test();// 输出 B=>test()，说明父类中的test()方法没有被重写
    }
}

// 父类
class B {
    public static void test(){
        System.out.println("B=>test()");
    }
}

// 子类
class A extends B {
    public static void test(){
        System.out.println("A=>test()");
    }
}


