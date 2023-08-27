package src.Demo0807;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5,6,7,8};
        for(int i = 1;i<arr.length;i+=2){
            if (arr[i]%2!=0)
                System.out.println(arr[i]);
        }
    }


}
