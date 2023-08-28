package com.kfm.code.test.Demo0828.stack;

public class mystackTest {
    public static void main(String[] args) {
        mystcak mys = new mystcak();
        for (int i = 0; i < 20; i++) {
            mys.push("a"+i);
        }
        System.out.println(mys);
        System.out.println(mys.pop());
        System.out.println(mys);

    }
}
