package code.test.Demo0828.Simplestack;

public class Test {
    public static void main(String[] args) {
        mystack s = new mystack();
        s.push("aaa");
        s.push("bbb");
        s.push("ccc");
        s.push("ddd");
        s.push("eee");
        s.push("fff");
        s.push("ggg");
        s.push("hhh");
        s.push("iii");
        s.push("jjj");
        Object a = s.pop();
        System.out.println(a);
        System.out.println(s.toString());


    }
}
