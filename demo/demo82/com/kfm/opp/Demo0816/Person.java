package opp.Demo0816;

public class Person {
    private String name;
    private int age;
    // 封装
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void say()
    {
        System.out.println("你好啊");
    }
    public void sayHello()
    {
        this.say();
    }
    public Person()
    {
        this("张三",66);
    }
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}
