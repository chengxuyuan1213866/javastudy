package src.Demo0810.Task;

public class FillingWater {
    public static boolean fun1(int a,int b,int c,int d)
    {
        // 判断能否放水
        if (a ==1 && b==1 && c==1 || d==1)
        {
            return true;
        }
        else {
            return false;
        }

    }
    public static int fun2(int[][] arr,int lr,int lc,int rr,int rc)
    {
        // 判断能放几个水
        int left_sum = 0;
        int right_sum = 0;
        for (int i = lr;i>=0;i--)
            if (arr[i][lc] == 1)
                left_sum+=1;
        for (int i = rr;i>=0;i--)
            if (arr[i][rc] == 1)
                right_sum+=1;
        int sum = (left_sum>right_sum)? right_sum:left_sum;

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0,0,1,0,0,0,0},
                {0,0,1,0,0,0,0},
                {0,0,1,0,1,0,0},
                {1,0,1,0,1,0,1},
                {1,1,1,1,1,1,1},
        };
        int rol = 3;  // 行下标
        int col = 3;  // 列下标
        int left = 0,right = 0,top = 0,button = 0;
        left = (col-1)>=0 ? arr[rol][col-1] : 0;
        right = (col+1)<arr[0].length ? arr[rol][col+1] : 0;
        top = (rol-1)>=0 ? arr[rol-1][col] : 0;
        button = (rol+1)< arr.length ? arr[rol+1][col] : 0;
        System.out.printf("%d%d%d%d\n",left,right,top,button);
        boolean b = fun1(left,right,button,top);
        int left_rol = rol;
        int left_col = col-1;
        int right_rol = rol;
        int right_col = col+1;
        int sum = fun2(arr,left_rol,left_col,right_rol,right_col);
        System.out.println(sum);
    }
}
