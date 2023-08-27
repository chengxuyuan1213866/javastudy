package com.kfm.string.Demo0822.Task.Person;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张三",'男',18,false);
        Person p2 = new Person("张三",'男',18,false);
        CAB c = new CAB();
        System.out.println(c.canMarry(p1, p2));
        System.out.println(p1.equals(p2));
    }
}
