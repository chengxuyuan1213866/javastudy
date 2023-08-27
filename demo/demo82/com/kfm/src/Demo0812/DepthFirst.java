package src.Demo0812;

/**
 * @author Administrator
 */
public class DepthFirst {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1,1,1,1,1},
                {1,0,0,0,0,0,1},
                {1,1,1,0,1,0,1},
                {1,0,0,0,0,0,1},
                {1,0,1,1,1,1,1},
                {1,0,0,0,0,9,1},
                {1,1,1,1,1,1,1}
        };
        depth(arr);
    }
    public static void depth(int[][] arr)
    {
        int startI = 1;    // 起点行
        int startJ = 1;    // 起点列
        int endI = 5;      // 终点行
        int endJ = 5;      // 终点列
        int actionI = 1;   //行动点 行坐标
        int actionJ = 1;    //行动点 列坐标
        int count = 0;
        while (arr[actionI][actionJ] != 9)
        {

            if (arr[actionI+1][actionI] == 0)
            {
                actionI = actionI+1;
            }
            else if (arr[actionI][actionJ+1] == 0)
            {
                actionJ = actionJ+1;
            }
            else if (arr[actionI-1][actionJ] == 0)
            {
                actionI = actionI-1;
            }
            else if (arr[actionI][actionJ-1] == 0)
            {
                actionJ = actionJ-1;
            }

            count ++;
        }
        System.out.println(count);



    }
    public static int coordinate(int x,int y)
    {
        return 0;
    }

}
