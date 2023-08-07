package src.Demo0807;

public class Demo7 {
    public static void main(String[] args) {
        int[] arr= {5,6,4,7};
        int num = 0;
        for (int i = 0;i<arr.length;i++)
        {
            num += (int) (arr[i]*Math.pow(10,arr.length-i-1));
        }
        System.out.println(num);
    }
}
