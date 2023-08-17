package opp.Demo0817;

/**
 * @author Administrator
 */
public class Sub extends Sup {
    int a = 11;
    int b = 22;
    public Sub(int a,int b)
    {
        super(a,b);
        print();
    }
    @Override
    public void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
