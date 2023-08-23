package string.Demo0823.Task;

public class email {
    public static void main(String[] args) {
        String stu = "45643qq.com@";
        System.out.println(A(stu));
    }
    public static Boolean A(String stu)
    {

        if (stu.contains("@") && stu.endsWith(".com")){
            if (stu.indexOf('@') < stu.indexOf(".com") )
                return true;
        }
        return false;
    }
}
