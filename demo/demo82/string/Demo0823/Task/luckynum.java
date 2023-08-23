package string.Demo0823.Task;

import java.util.Arrays;
import java.util.Random;

public class luckynum {
    public static void main(String[] args) {
        int[] a =number();
        System.out.println(Arrays.toString(a));
        disorganize(a);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 生成随机数数组
     * @return
     */
    public static int[] number()
    {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr,0,i);
            int a =random.nextInt(40)+1;

            if (Arrays.binarySearch(arr,0,i,a) < 0)
            {
                arr[i] = a;
            }
            else {
                i--;
            }
        }
        return arr;
    }

    /**
     * 打乱随机数数组
     */
    public static void disorganize(int[] arr)
    {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ran1 = random.nextInt(20);
            int ran2 = random.nextInt(20);
            int temp = arr[ran1];
            arr[ran1] = arr[ran2];
            arr[ran2] = temp;
        }
    }


}
