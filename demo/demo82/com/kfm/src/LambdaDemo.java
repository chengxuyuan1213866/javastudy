package src;

/**
 * @author Administrator
 */

interface C {
    default public int B(int x,int y)
    {
        return x+y;
    }
}
class a implements C {
    public int B(int x,int y)
    {
        return x-y;
    }

    public static void main(String[] args) {
        a a = new a();
        System.out.println(a.B(a.B(1, 2), 3));
    }
}



