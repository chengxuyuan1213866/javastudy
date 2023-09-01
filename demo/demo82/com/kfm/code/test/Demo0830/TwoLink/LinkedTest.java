package code.test.Demo0830.TwoLink;

public class LinkedTest {
    public static void main(String[] args) {
        Linked lk = new Linked();
        lk.add(5);
        lk.add(45);
        lk.add(2);
        lk.add(555);
        lk.add(56);
        System.out.println(lk.length());
        System.out.println(lk.show());
        lk.delete(2);

        System.out.println(lk.show());
    }
}
