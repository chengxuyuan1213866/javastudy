package string.Demo0824.Task;

public class Poker {
    public static void main(String[] args) {
        print();
    }
    public static void print()
    {
        String[] color = {"红桃","方片", "黑桃","梅花"};
        for (int i = 0; i < color.length; i++) {
            for (int j = 1; j < 14; j++) {
                if (j == 1)
                {
                    System.out.println(color[i] + "A");
                } else if (j == 11) {
                    System.out.println(color[i] + "J");
                }
                else if (j == 12) {
                    System.out.println(color[i] + "Q");
                }else if (j == 13) {
                    System.out.println(color[i] + "K");
                }
                else {
                    System.out.println(color[i] + j);
                }
            }
        }
    }
}
