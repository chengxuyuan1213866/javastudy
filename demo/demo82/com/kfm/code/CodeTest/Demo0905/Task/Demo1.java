package code.CodeTest.Demo0905.Task;


import java.util.List;

public class Demo1 {

    /**
     * 去重统计
     *
     * 有bug
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","a");
        int count = 0;
        out:for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (j!=i && list.get(i).equals(list.get(j)))
                    {
                        continue out;
                    }
                }
                count++;
            System.out.println(list.get(i));

        }
        System.out.println("这个集合中有不重复元素" + count+"个");
    }

}
