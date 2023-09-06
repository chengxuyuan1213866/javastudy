package code.CodeTest.Demo0906.Task;


/**
 * 统计数量
 *
 */
public class work2 {
    public static void main(String[] args) {
        String s = "dajdsjadlkaksfhbajfbgas";
        Count(s);
    }
    private static void Count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                {
                    count++;
                }
            }
            System.out.println(s.charAt(i)+"出现了"+count+"次");
            count = 0;
        }
    }
}
