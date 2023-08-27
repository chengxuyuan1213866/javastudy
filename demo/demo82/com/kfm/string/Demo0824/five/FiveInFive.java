package string.Demo0824.five;

import java.util.Arrays;

public class FiveInFive {
    static int N = 9;
    public static void main(String[] args) {

        int[][] arr = { {0, 0, 0, 0, 0, 1, 0, 0, 0,},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0,},
                        {0, 0, 0, 1, 0, 0, 0, 0, 0,},
                        {0, 0, 1, 0, 0, 0, 0, 0, 0,},
                        {0, 1, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0,}};
        int[][] nine = nine(2,1);
        int[][] five = check(arr,4,1);
        for (int i = 0; i < five.length; i++) {
            System.out.println(Arrays.toString(five[i]));
        }
    }
    // 找出指定坐标周围元素
    public static int[][] nine(int x,int y)
    {
        int[][] a= {
                {x-1,y},  //左
                {x+1,y},  //右
                {x,y+1},  //上
                {x,y-1},   // 下
                {x-1,y-1},  // 左上
                {x+1,y-1},  // 右上
                {x-1,y+1},  // 左下
                {x+1,y+1},  // 右下
        };
        // 左右上下 左上 右上 左下 右下
        //int[] left = {x-1,y};
        //int[] right = {x+1,y};
        //int[] top = {x,y+1};
        //int[] button = {x,y-1};
        //int[] lefttop = {x-1,y-1};
        //int[] righttop = {x+1,y-1};
        //int[] leftbutton = {x-1,y+1};
        //int[] rightbutton = {x+1,y+1};
        return a;
    }
    // 找出连续的邻居
    public static int[][] check(int[][] arr,int x,int y)
    {
        int[][] a = nine(x,y);
        int[][] five = new int[5][];
        int[] co = {x,y};
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            five[count] = co;
            int q = 0,p = 0;
            if (arr[a[i][0]][a[i][1]] == 1 && a[i][0]!=x && a[i][1] != y) {
                q = a[i][0];
                p = a[i][1];
            }
            // 必须是同一个方向上的增量
            final int septx = q-x;
            final int septy = p-y;
            for (int j = 1; j < 5; j++) {  // 找其他的四个点
                // 如何记录增量
                //
                int newx = x + septx;
                int newy = y + septy;
                if (0<= newx && newx<N && 0<= newy && newy<N && arr[newx][newy] == 1)
                {
                    count++;
                    int[] co1 = {newx,newy};
                    five[count] = co1;
                    x = newx;
                    y = newy;
                }
                if (count == 4)
                {
                    return five;
                }
            }
        }
        return five;
    }
}
