package opp.Demo0816;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("蔡徐坤",25);
        p.setAge(20);
        p.setName("范丞丞");
        System.out.println(p.getAge());
        System.out.println(p.getName());
        p.sayHello();

    }
}
