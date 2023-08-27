package opp.Demo0815;

/**
 * @author Administrator
 */
public class StaticDemo {
    public StaticDemo(){
        age = 20;
        System.out.println(age);
        System.out.println("现在执行构造方法");
    }
    int age;
    {
        age = 10;
        System.out.println("age为" + age);
        System.out.println("现在进行的是实例初始化");

    }
    static {
        String name = "坤坤";
        System.out.println(name);
        System.out.println("现在进行的是静态初始化");
    }
    String name ;

    public StaticDemo(int age)
    {
        System.out.println("传参时的age为" + age);
        System.out.println("这里是传参时的构造方法");
    }


    public static void main(String[] args) {
        StaticDemo kun = new StaticDemo();
        StaticDemo kk = new StaticDemo(250);
    }

}
