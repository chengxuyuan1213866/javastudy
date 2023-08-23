package string.Demo0823.Task;

public class Duplicateremoval {
    public static void main(String[] args) {
        String stu = "112233";
        System.out.println(filter(stu));
    }
    public static String filter(String s) {
        //非空判断
        if (s == null) {
            return null;
        }
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                sbd.append(c);
            } else {
                if (s.indexOf(c) == i) {
                    sbd.append(c);
                }
            }
        }
        return sbd.toString();
    }

}
