
package src.Demo0807;
import java.util.Scanner;
public class Demo09 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] arr = new int[6];
            for (int i = 0;i<arr.length;i++){
                System.out.printf("请输入第 %d 位评委的打分:",i+1);
                arr[i] = sc.nextInt();
            }


            int max = arr[0];
            int min = arr[0];
            double sum = 0;
//遍历数组
            for(int i = 0;i < arr.length;i++){
                if (arr[i]<min)
                    min = arr[i];
                if (arr[i]>max)
                    max = arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == min || arr[i] == max) {
                   arr[i] = 0;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
                sum += arr[i];
            }
            double avg = sum/ arr.length;
            System.out.printf("最后选手的得分为%f",avg);
        }
    }

