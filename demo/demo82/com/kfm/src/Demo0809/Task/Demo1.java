package src.Demo0809.Task;

public class Demo1 {
    public static void main(String[] args) {
        char[][] chunxiao = {
                {'春', '眠', '不', '觉', '晓'},
                {'处', '处', '闻', '啼', '鸟'},
                {'夜', '来', '风', '雨', '声'},
                {'花', '落', '知', '多', '少'}};


        // 正常输出
       /* for (int i = 0; i < chunxiao.length; i++) {
            for (int j = 0; j < chunxiao[i].length; j++) {
                System.out.print(chunxiao[i][j]);
            }
            System.out.println();

        }*/
        // 纵向从左到右输出
        /*int row = chunxiao.length-1;
        int col = chunxiao[0].length-1;
         for (int j = 0; j <= col ; j++){
             for (int i = row; i >= 0 ; i--) {
                 System.out.print(chunxiao[i][j]);
            }
            System.out.println();
        }*/

    }}
