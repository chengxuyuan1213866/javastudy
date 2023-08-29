package com.kfm.code.test.Demo0829.port;

public interface USB {
    void fun();
}
class TypeC implements USB{
    /**
     * USB接口的实现
     */
    @Override
    public void fun() {
        System.out.println("实现了TypeC接口");
    }

    public static void main(String[] args) {
        TypeC typec = new TypeC();
        typec.fun();
    }
}
