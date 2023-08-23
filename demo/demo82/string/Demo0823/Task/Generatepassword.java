package string.Demo0823.Task;

import java.util.Random;

public class Generatepassword {
    public static void main(String[] args) {
        System.out.println(get());

    }
    public static String get()
    {
        Random random = new Random();
        String stu = new String();
        for (int i = 0; i < 6; i++) {
            Integer a = random.nextInt(10);
            String c = a.toString();
            if (!stu.contains(c))
            {
                if (i == 0)
                {
                    int b = random.nextInt(65,91);
                    stu += (char)b;
                    continue;
                }
                stu += a;
            }
            else {
                i--;
            }
        }
        return stu;


    }
}
