package string.Demo0824.Task;

public class TabularName {
    public static void main(String[] args) {
        System.out.println(name(26));
    }
    public static String name(int c)
    {

        StringBuilder stu = new StringBuilder();
        c-=1;
        while (c != 0)
        {
            stu.append((char) (65+ c%26));
            c /= 26;
        }
        return stu.reverse().toString();
    }
}
