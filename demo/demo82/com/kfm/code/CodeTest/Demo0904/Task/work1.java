package code.CodeTest.Demo0904.Task;


import java.util.List;
import java.util.Scanner;

/**
 * 商品管理
 * 创建一个List集合，添加多个商品名称
 * 实现根据输入查询某个商品是否存在，如果存在则输出信息
 */
public class work1 {
    public static void main(String[] args) {
        List list = List.of("蔡徐坤","蔡虚坤","蔡虚鲲");

        Scanner scanner = new Scanner(System.in);
        System.out.println("黑子，输入你要查询的名字");
        String chicken = scanner.next();
        if (list.contains(chicken))
        {
            System.out.println("黑子，给你找到了,信息是:" + chicken);
        }
        else
        {
            System.out.println("傻子，没找到");
        }

    }

}
