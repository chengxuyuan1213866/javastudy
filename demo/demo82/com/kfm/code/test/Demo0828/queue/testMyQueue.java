package code.test.Demo0828.queue;

public class testMyQueue {
    public static void main(String[] args) {
        myqueue myq = new myqueue(2);
        for (int i = 0; i < 5; i++) {
            myq.push("a"+i);
        }

        System.out.println(myq);
        System.out.println(myq.pop());
        System.out.println(myq);
    }
}
