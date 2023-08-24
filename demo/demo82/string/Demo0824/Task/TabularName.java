package string.Demo0824.Task;

public class TabularName {
    public static void main(String[] args) {
        System.out.println(name(28));


    }
    public static String name(int n)
    {
        StringBuilder stu = new StringBuilder();
        int a = n/26;
        char b = (char) (n%26+64);
        for (int i = 0; i < a; i++) {
            stu.append("A");
        }

        System.out.println(b);
        String s = new String(stu);
        return s;
    }
}
