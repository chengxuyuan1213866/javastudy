package src.Demo0807;

public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {9,1,3,4,54,56,23,22,20,43,45,78};
        for (int i = 0; i<arr.length;i++)
        {
            if (arr[i]%6==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
