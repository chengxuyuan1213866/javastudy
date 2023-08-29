package com.kfm.code.test.Demo0829.Lambda;

public interface demo1 {
    void show();
}
class Test{
    public static void main(String[] args) {
        demo1 a1 = () -> System.out.println("我是show()方法");
        demo1 a2 = () ->
        {
            System.out.println("我也是show方法");
            System.out.println("我是第二段");
        };
        a1.show();
        a2.show();
    }

}


