package src.Demo0807;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min = arr[0];
        for (int i = 0; i< arr.length;i++)
        {
            if (min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("最小值为: " + min);
    }


}







