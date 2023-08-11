package src;

public class test {
    public static void main(String[] args) {

        int[][] arr = {
                {0,0,1,0,0,0,0},
                {0,0,1,0,0,0,0},
                {0,0,1,0,1,0,0},
                {1,0,1,0,1,0,1},
                {1,1,1,1,1,1,1},
        };
        int lr = 2;
        int lc = 3;
        int rr = 4;
        int rc = 3;
        int left_sum = 0;
        int right_sum = 0;

        for (int i = lc;i>=0;i--)
            if (arr[i][lr] == 1)
                left_sum+=1;



        for (int i = rc;i>=0;i--)
            if (arr[i][rr] == 1)
                right_sum+=1;

        System.out.println(left_sum);
        System.out.println(right_sum);
    }



}
