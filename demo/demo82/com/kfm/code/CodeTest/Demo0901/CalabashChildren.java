package code.CodeTest.Demo0901;

import java.util.Scanner;

public enum CalabashChildren  {
    OneCalabash("大娃","变大"),TwoCalabash("二娃","千里眼顺风耳"),ThrCalabash("三娃","精钢不坏"),FouCalabash("四娃","吐火"),FivCalabash("五娃","吐水"),SixCalabash("六娃","隐身"),SevCalabash("小娃","小葫芦装人");

    //名字
    private String name;
    // 能力
    private String ability;
    private CalabashChildren(String name,String ability)
    {
        this.name = name;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }
}
class A
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        int num = scanner.nextInt();
        switch (num)
        {
            case 1 -> fun(CalabashChildren.OneCalabash);
            case 2 -> fun(CalabashChildren.TwoCalabash);
            case 3 -> fun(CalabashChildren.ThrCalabash);
            case 4 -> fun(CalabashChildren.FouCalabash);
            case 5 -> fun(CalabashChildren.FivCalabash);
            case 6 -> fun(CalabashChildren.SixCalabash);
            case 7 -> fun(CalabashChildren.SevCalabash);
            default -> System.out.println("你输的什么东西");

        }
    }
    public static void fun(CalabashChildren a)
    {
        System.out.println("葫芦娃的名字是:" + a.getName()+",它的能力是："+ a.getAbility());
    }
}
