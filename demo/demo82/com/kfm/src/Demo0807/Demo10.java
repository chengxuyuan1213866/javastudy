package src.Demo0807;

public class Demo10 {
    public static void main(String[] args) {
        // 将数组中的元素逆置
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int len = arr.length;
        int temp;
        for (int i = 0; i <= (arr.length-1)/2; i++) {
            temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-i-1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
