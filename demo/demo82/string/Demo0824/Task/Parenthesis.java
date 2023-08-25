package string.Demo0824.Task;

public class Parenthesis {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(fun(s));
    }
    public static boolean fun(String stu)
    {
        for (int i = 0; i < stu.length(); i++) {
            if (stu.charAt(i) == '(')
            {
                for (int j = stu.length()-1; j >i; j--) {
                    if (stu.charAt(j) == ')')
                    {
                        break;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
