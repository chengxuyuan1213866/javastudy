package src.Demo0815.Task;

public class Test {
    public static void main(String[] args) {
        Cat c =new Cat();
        c.eat();
        c.catchMouse();
        Cat c1 = new Cat("大花","汤姆");
        c1.eat();
        c1.catchMouse();
        Dog d = new Dog();
        d.eat();
        d.catchMouse();
        Dog d1 = new Dog("大花","汤姆");
        d1.eat();
        d1.catchMouse();
    }
}
