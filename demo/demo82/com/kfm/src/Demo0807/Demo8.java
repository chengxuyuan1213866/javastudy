package src.Demo0807;

public class Demo8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,6,7,8,5,2};
        /*
        * 此程序有BUG
        * 下面提供一种解决方案
        * 可以新建数组，将排序好的数组放入
        *
        * */
        int count = 0;
        int reduce = arr1.length-1;
        for (int i = 0; i < arr1.length; i++) {
/*          System.out.println("count =  " + count + "\t" + "reduce = " + reduce);*/
            if (arr1[i]%2==0)
            {
                int temp = arr1[reduce];
                arr1[reduce] = arr1[i];
                arr1[i] = temp;
                reduce--;
            }
            if (arr1[i]%2!=0)
            {
                int temp = arr1[count];
                arr1[count] = arr1[i];
                arr1[i] = temp;
                count++;
            }

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }
}

