package string.Demo0824.Task;

public class prefix {
    public static void main(String[] args) {
        String[] s = {"flower","flow","floght"};
        System.out.println(fun(s));
    }
    public static String fun(String[] stu)
    {
        int count = 0;
        int count1 = 0;
        int min = 0;
        for (int i = 0; i < stu.length; i++) {
            if (stu[i].length()<stu[min].length()){
                min = i;
            }
        }
        int n = stu[min].length();
        for (int i = 0; i < n; i++) {  // 便利数组内最短元素的遍历
            for (int j = 0; j < stu.length; j++) {
                if (stu[min].charAt(i) == stu[j].charAt(i))
                {
                    count++;
                }
            }
            if (count == stu.length)
            {
                count1++;
            }
            count =0;
        }
        return stu[min].substring(0,count1);
    }
}
