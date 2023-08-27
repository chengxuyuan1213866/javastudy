package src.Demo0809;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        /*
        * 二分查找
        * 折半查找
        */
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int left = 0;
        int right = arr.length-1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int flag = 0;
        while (left<=right)
        {
            int mid = (left+right)/2;
            if (mid==num)
            {
                flag = mid;
                break;
            } else if (mid>num) {
                right = mid -1;

            }
            else {
                left=mid+1;
            }
        }
        if (flag == 0)
        {
            System.out.println("没找到");
        }
        else {
            System.out.println("找到了，下标是:" + flag);
        }




    }

}
