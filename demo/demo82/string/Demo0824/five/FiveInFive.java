package string.Demo0824.five;

public class FiveInFive {
    public static void main(String[] args) {
        int N = 9;
        int[][] arr = { {0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 1, 0, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 1, 0, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 1, 0, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 1, 0, 0, 0, 0,},
                        {0, 0, 0, 0, 0, 1, 0, 0, 0,}};
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
    public static void check(int[][] arr,int x,int y)
    {
        int[][] a = nine(x,y);
        int[][] five = new int[5][];
        int[] co = {x,y};
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            five[count] = co;
        }
    }
}
