package code.test.Demo0830;

public class MainTest {
    // 定义方法实现接口
    interface Executable {
        void execute();
    }
    // 定义三个示例方法static
    static void function1() {
        System.out.println("Function 1 called.");
    }
    static void function2() {
        System.out.println("Function 2 called.");
    }
    static void function3() {
        System.out.println("Function 3 called.");
    }
    static Executable function4()
    {
        System.out.println("Function 3 called.");
        return MainTest::function1;
    }
    // 定义一个执行方法，接受一个Executable接口作为参数
    static void exec(Executable func)
    {
        func.execute();
    }
    public static void main(String[] args) {
        //使用exec方法执行三个示例方法
/*        exec(new Executable() {
            @Override
            public void execute() {
                function1();
            }
        });*/
        Executable test = new Executable() {
            @Override
            public void execute() {
                function1();
            }
        };
        exec(test);
        exec(MainTest::function1);
        exec(MainTest::function2);
        exec(MainTest::function3);
    }}