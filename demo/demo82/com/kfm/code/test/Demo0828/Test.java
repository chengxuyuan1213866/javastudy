package code.test.Demo0828;

public class Test {
    static {
        int a = 1;
    }
    static class A
    {
        static int a = 2;
        public static void play()
        {
            System.out.println("A类的 play方法 ");
        }
    }
    static class Test1
    {
        A aaa = new A(){
            public static void play()
            {
                System.out.println("1111 play方法 ");
            }
        };
    }
    public static void main(String[] args) {
        Test t = new Test();
        A t2 = new A();
        Test1 t1 = new Test1();
    }
}
