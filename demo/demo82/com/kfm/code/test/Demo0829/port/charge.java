package com.kfm.code.test.Demo0829.port;

public interface charge {
    default void show()
    {
        System.out.println("正在充电");
    }
    void add();
    static void full()
    {
        System.out.println("电量已充满");
    }
}
class demo implements charge{

    /**
     * 实现接口中的add方法
     */
    @Override
    public void add() {
        System.out.println("增加电量");
    }

    public static void main(String[] args) {
        demo dem = new demo();
        dem.show();
        dem.add();
        charge.full();
    }

}
