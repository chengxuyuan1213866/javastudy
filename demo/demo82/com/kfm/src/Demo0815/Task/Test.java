package com.kfm.src.Demo0815.Task;

public class Test {
    public static void main(String[] args) {
        src.Demo0815.Task.Cat c =new src.Demo0815.Task.Cat();
        c.eat();
        c.catchMouse();
        src.Demo0815.Task.Cat c1 = new src.Demo0815.Task.Cat("大花","汤姆");
        c1.eat();
        c1.catchMouse();
        src.Demo0815.Task.Dog d = new src.Demo0815.Task.Dog();
        d.eat();
        d.catchMouse();
        src.Demo0815.Task.Dog d1 = new src.Demo0815.Task.Dog("大花","汤姆");
        d1.eat();
        d1.catchMouse();
    }
}
