package code.CodeTest.Demo0902;

public class InnerClass {

    private InnerClass(){};

    private static class Singleton{
        private static final InnerClass sing = new InnerClass();
    }
    public static InnerClass getobject()
    {
        return Singleton.sing;
    }

}
