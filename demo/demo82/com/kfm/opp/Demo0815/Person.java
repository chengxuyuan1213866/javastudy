package opp.Demo0815;

/**
 * @author Administrator
 */
public class Person {
    private String name = "蔡徐坤";
     int a = 2;
    private String age = a + "坤年";
    char sex = '鸡';
    public void introduce()
    {
        System.out.println("姓名：" + name + " \t"+ "年龄：" + age+ "\t"+ "性别" + sex);
    }
    public void sleep()
    {
        System.out.println(name + "该睡觉了");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "蔡徐坤";
        p.age = "5坤年";
        p.sex = 'j';
        p.introduce();
        p.sleep();
    }
}

