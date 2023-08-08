package src.Demo0808;

import java.util.Arrays;

public class Achievement {
    public static void main(String[] args) {
        int arr[] = {85,52,6,20};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len-1; j++) {
                if (arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println("排名" + "    " + "成绩");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("第%d名\t%d\n",i+1,arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }



}
