package com.kfm.opp.Demo0816.Task.Library.management.system;

/**
 * @author Administrator
 */
public class Library {

    /*
        对象数组
        TODO( 如果我要存第 11 本书怎么办？ 扩容？)
        如果一个个扩容，效率太低了。高效的扩容方式
     */
    private Book[] books = new Book[10];
    // 图书数量
    private int count = 0;
    private static final int CON = 2;

    {
        for (int i = 0; i < 10; i++) {
            String name = "第" + (i + 1) + "本书";
            addBook(new Book(name, "佚名", 2021, 3.86));
        }
    }


    public void addBook(Book book){
        Book[] books1 = new Book[books.length+CON];
        if (count < 10)
            books[count ++] = book;
        else {
            System.arraycopy(books,0,books1,0,books.length);
            books1[count++] = book;
            books = books1;
        }
    }

    public String search(String title){
            for (int i = 0; i < this.books.length; i++) {
                String name = books[i].getTitle();
                if (name.equals(title))
                    return books[i].info();
            }

        return null;
    }


    public void show(){
//        for (Book book : books){
//            System.out.println(book);
//        }
        if (count == 0){
            System.out.println("\u001B[31m 目前没有存书！\u001B[0m");
        }else{
            for (int i = 0; i < count; i++) {
                System.out.println(books[i].info());
            }
        }
    }


}