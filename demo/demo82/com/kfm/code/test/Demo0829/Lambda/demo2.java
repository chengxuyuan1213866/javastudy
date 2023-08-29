package com.kfm.code.test.Demo0829.Lambda;

public interface demo2 {
    void show(String s);
}
class Test2{
    public static void main(String[] args) {

        demo2 a1 = (String s) -> System.out.println("传入的值为" + s);
        demo2 a2 = (String s) ->
        {
            System.out.println("我是第二段");
            System.out.println("我也是show方法" + s);

        };
        a1.show("你好");
        a2.show("你好");


    }
}
