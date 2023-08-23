package string.Demo0823.Task;

import java.util.Arrays;

public class longsubstring {
    public static void main(String[] args) {
        String s = "cjskdc";
        System.out.println(lostu(s));
    }
    public static int lostu(String s)
    {
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j) == c)
                {
                    arr[i] = j+1;
                }
            }
        }
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }
}
