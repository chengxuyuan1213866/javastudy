package src.Demo0810;

public class Nine {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4, 6,8, 2},
                    {5, 6, 7, 8, 6, 9},
                    {9, 10, 11, 12, 85,69},
                {14,25,36,78,96,4,25,632}
        };

        // 最小值
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]<min)
                {
                    min = a[i][j];
                }
            }
        }
        System.out.println("最小值为" + min);

        int n = a[3][4];
        int sum9 = 0;
        //九宫格


    }
}
