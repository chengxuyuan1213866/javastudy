package com.kfm.code.test.Demo0829.port;

public interface Eat {
    private void beef()
    {
        System.out.print("吃牛肉");
    };
    default void noodles()
    {
        beef();
        System.out.println("面");
    }
    String eat(String name);
}
class person implements Eat{

    /**
     * @param name
     * @return
     */
    @Override
    public String eat(String name) {
        return "人吃" + name;
    }

    public static void main(String[] args) {
        person p = new person();
        p.noodles();
        System.out.println(p.eat("方便面"));
    }
}