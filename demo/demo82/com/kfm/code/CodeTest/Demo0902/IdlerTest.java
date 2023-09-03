package code.CodeTest.Demo0902;

public class IdlerTest {

    // 3.懒汉模式 (线程不安全)
/*    private static IdlerTest idt;
    private IdlerTest(){};

    public static IdlerTest getobject()
    {
        if (idt == null)
        {
            idt = new IdlerTest();
        }
        return idt;
    }*/
    // 4.懒汉模式(线程安全，同步方法)
/*    private static IdlerTest idt;
    private IdlerTest(){};
    public static synchronized IdlerTest getobject()
    {
        if (idt == null) {
            idt = new IdlerTest();
        }
        return idt;
    }*/
    // 5.懒汉式 ()
/*    private static IdlerTest idt;
    private IdlerTest(){};
    public static synchronized IdlerTest getobject()
    {
        if (idt == null) {
            synchronized (IdlerTest.class){
                idt = new IdlerTest();
            }
        }
        return idt;
    }*/
    // 6. 双重检查
    private static IdlerTest idt;
    private IdlerTest(){};
    public static synchronized IdlerTest getobject()
    {
        if (idt == null) {
            synchronized (IdlerTest.class){
                if (idt == null) {
                    idt = new IdlerTest();
                }

            }
        }
        return idt;
    }

}
