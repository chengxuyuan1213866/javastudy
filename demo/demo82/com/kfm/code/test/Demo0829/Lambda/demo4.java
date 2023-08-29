package com.kfm.code.test.Demo0829.Lambda;

public interface demo4 {
    int add(int x,int y);
}


class Test4
{
    public static void main(String[] args) {
        demo4 t;
        t = (x,y) -> {
            return x+y;
        };
        System.out.println(t.add(2,3));
        t = (x,y) -> x+y;
        System.out.println(t.add(5,9));


    }
}
