package code.CodeTest.Demo0906.Task;

public class work3 {
    public static void main(String[] args) {
        String s = "abc";
        String[] arr={"adsa","das","sas"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] +"->" + encipher(arr[i]));
        }
    }

    private static String encipher(String s) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int a = ((char) s.charAt(i))%97;
            str.append(code[a]);
        }
        return str.toString();
    }
}
