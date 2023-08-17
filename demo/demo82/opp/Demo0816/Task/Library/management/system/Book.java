package opp.Demo0816.Task.Library.management.system;

public class Book extends Library {
    private String title;
    private String author;
    private String year;
    private double price;

    public Book() {
    };

    // 添加图书
    public void add(String title, String author, String year, double price) {
        super.stacktitle = stringAdd(stacktitle, this.title);
        super.stackauthor = stringAdd(stacktitle, this.author);
        super.stackyear = stringAdd(stacktitle, this.year);
        double[] a1 = new double[super.stackprice.length + 1];
        System.arraycopy(super.stackprice, 0, a1, 0, super.stackprice.length);
        a1[a1.length - 1] = price;
        super.stackprice = a1;

    }

    public String[] stringAdd(String[] a, String title) {
        String[] a1 = new String[a.length + 1];
        System.arraycopy(a, 0, a1, 0, a.length);
        a1[a1.length - 1] = title;
        return a1;
    }

    // 查找图书
    // 比较懒，只写按照书名查找
    public String lookUp(String n) {
        int index = -1;
        for (int i = 0; i < super.stacktitle.length; i++) {
            if (super.stacktitle[i].equals(n)) {
                index = i;
            }
        }
        if (index == -1) {
            return "没找到";
        } else {
            return "书名：" + super.stacktitle[index] + "作者" + super.stackauthor[index] + "出版年月日" + super.stackyear[index] + "价格" + super.stackprice[index];
        }
    }
    // 打印图书列表
    public void print()
    {
        for (int i = 0; i < super.stacktitle.length; i++) {
            System.out.println("书名：" + super.stacktitle[i] + "作者" + super.stackauthor[i] + "出版年月日" + super.stackyear[i] + "价格" + super.stackprice[i]);

            }

    }

}
