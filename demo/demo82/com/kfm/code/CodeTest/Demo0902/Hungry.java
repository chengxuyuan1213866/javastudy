package code.CodeTest.Demo0902;

public class Hungry {

    // 1.饿汉模式（静态常量）
    private static final Hungry hun = new Hungry();
    private Hungry() {}
    public static Hungry getobject()
    {
        return hun;
    }
/*    // 2. 饿汉模式(静态代码块)
    private Hungry(){};
    private static Hungry hun;
    static {
        hun = new Hungry();
    }
    public static Hungry getobject()
    {
        return hun;
    }*/
}
