package opp.Demo0817;

/**
 * @author Administrator
 */
public class Sup {
    int a = 1;
    static {
        b = 3;
    }
    static int b =2;
    public Sup(int a,int b)
    {
        print();
        this.a= a;
        Sup.b = b;
        print();
    }
    public void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
