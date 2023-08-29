package com.kfm.code.test.Demo0829.Lambda;

public interface demo3 {
    void show(String str);
}
class Test3
{
    public static void main(String[] args) {
        demo3 a1 = str -> System.out.println("我是show()方法" + str);
        demo3 a2 = str ->
        {
            System.out.println("我是第二段");
            System.out.println("我也是show方法" + str);

        };
        a1.show("你好世界");
        a2.show("你好世界");


    }
}



