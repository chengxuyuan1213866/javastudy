package string.Demo0823.Task;

public class email {
    public static void main(String[] args) {
        String stu = "@3qq.com";
        System.out.println(A(stu));
    }
    public static Boolean A(String stu)
    {

        if (stu.contains("@") && stu.indexOf("@") != 0 && stu.endsWith(".com")){
            if (stu.indexOf('@') < stu.indexOf(".com")-1 )
                return true;
        }
        return false;
    }
}
