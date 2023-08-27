package string.Demo0823;

public class StringMethod {


    public static void main(String[] args) {
        // 获取字符
        String str = "abc123";
        char c = str.charAt(0);
        System.out.println(c);
        // 返回值指定索引位置的字符的编码值
        str = "A123";
        int index = str.codePointAt(0);
        System.out.println(index);
        //返回值指定索引位置前一位的字符的编码值
        System.out.println(str.codePointBefore(1));
        //


    }


}
