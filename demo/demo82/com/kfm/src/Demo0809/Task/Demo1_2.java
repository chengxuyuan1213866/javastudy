package src.Demo0809.Task;

public class Demo1_2 {
    public static void main(String[] args) {
        char[][] poetry = {
                {'十', '年', '生', '死', '两', '茫', '茫', ',','不', '思', '量', ',','自', '难', '忘','。'},
                {'千', '里', '孤', '坟', ',', '无', '处', '话', '凄', '凉','。'},
                {'纵', '使', '相', '逢', '应', '不', '识', ',', '尘', '满', '面', ',', '鬓', '如', '霜','。'},
                {'夜', '来', '幽', '梦', '忽', '还', '乡', ',', '小', '轩', '窗', ',', '正', '梳', '妆','。'},
                {'相', '顾', '无', '言', ',', '惟', '有', '泪', '千', '行','。'},
                {'料', '得', '年', '年', '肠', '断', '处', ',', '明', '月', '夜', '短', '松', '冈','。'},

        };
/*        for (int i = 0; i < poetry.length; i++) {
            for (int j = 0; j < poetry[i].length ; j++) {
                System.out.println(poetry[i][j]);
            }
        }*/
        int count = 0;
        int len = poetry.length;
        for (int i = 0; i < poetry[count].length; i++) {
            if (poetry[count].length>poetry.length){
                int a = poetry[i].length-poetry.length;
                len += a;
            }
            // System.out.println(i);
           for (int j = len-1; j >=0; j--) {
                System.out.printf("%d%d \t",j,i);
                System.out.print(poetry[j][i]);
            }

            System.out.println();
        }



        /*for (int i = 0; i < chunxiao.length; i++) {
            for (int j = 0; j < chunxiao[i].length; j++) {
                System.out.print(chunxiao[i][j]);
            }
            System.out.println();*/

    }
}
