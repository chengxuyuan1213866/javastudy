package src.Demo0815.Task;

public class GirlFriend {
    String name ;
    double h;
    double w;
    public void wash()
    {
        System.out.println("女朋友给我洗衣服");
    }
    public void cook()
    {
        System.out.println("女朋友给我做饭");
    }
    public void show()
    {
        System.out.printf("我的女朋友叫%s\t,身高%f\t,体重%f\n",name,h,w);
    }
    public GirlFriend(String a,double b,double c)
    {
        name = a;
        h = b;
        w = c;
    }

    public static void main(String[] args) {
        GirlFriend k = new GirlFriend("蔡徐坤",25.0,25.0);
        k.show();
        k.wash();
        k.cook();
    }

}
