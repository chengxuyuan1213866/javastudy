package code.Innerclass;

public class Demo {

    static {
        System.out.println("Demo静态");
        A.play();
    }
    public static int fun()
    {
        System.out.println("Demo 的静态方法");
        return 11;
    }
    int a = Demo.fun();

    static void fun1()
    {
        System.out.println("fun1");
    }


    Demo()
    {
        System.out.println("Demo的构造");
    }
    class A{
        int a =Demo.fun();
        static {
            System.out.println("内部类的静态");
        }

        static void play()
        {
            System.out.println("内部类的play方法");
        }
        A()
        {
            System.out.println("内部类的构造进行");
        }
    }


    public static void main(String[] args) {
        // 在外部调用内部类
        Demo d = new Demo();
        A a = d.new A();
        Demo.A.play();

    }

}
