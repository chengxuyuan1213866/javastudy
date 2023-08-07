package src.Demo0807;

public class Demo8 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        int reduce = arr1.length-1;
        int temp ;
        out: for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]%2!=0)
            {
                temp = arr1[count];
                arr1[count] = arr1[i];
                arr1[i] = temp;
                count++;
                continue out;
            }
            if (arr1[i]%2==0)
            {
                temp = arr1[reduce];
                arr1[reduce] = arr1[i];
                arr1[i] = temp;
                reduce--;
                continue out;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


    }

}

