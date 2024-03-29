# 分析
## 需求
有一开发喵影院系统需要开发：
1. 用户分为 管理员 和 普通用户
2. 用户都可以通过手机号和密码登录系统
3. 二者登录后能做的操作不同
   1. 管理员可以
      1. 查询所有用户
      2. 添加电影
      3. 修改电影
      4. 删除电影
      5. 查看所有电影
   2. 普通用户可以
      1. 修改用户信息
      2. 查看所有电影

## 类
从需求中我们可以抽象出三个类， 影院、用户、电影

** 完善类的信息(字段、方法) **
字段： 有什么
方法： 能做什么


### 购票
电影类添加票的数量

抽象出 Ticket 类:
 - 电影
 - 票的数量

用户添加 电影票字段(每个人可以买多个电影票)
 - Ticket[] 


## 优化
每个数组我们在添加元素时，都会考虑一个问题--容量是否足够。因为数组的长度是固定的，没办法动态改变。
我们需要手动去扩容，每个都手动扩容太麻烦了。
如何解决?
1. 我们将数组全替换成 Object 数组，然后写一个公共的扩容方法了。
   - 缺点是，我们在使用元素时每个都要强制类型转换 Object --> User/Movie
2. 我们专门写一个类(数据类型)做容器，将所有关于容器的操作全放到这个类中。
   - 添加元素
   - 删除元素
   - 获取元素
   - 显示所有元素
   - 等等
第二个方法更好。

### 如何写这个类
我们创建一个 `List` 类，是一个容器（动态数组）。内部使用一个 Object 数组存元素，我们添加元素时能动态扩容。

```java
public class List {
    // 存元素的
    private Object arr;
    // 元素个数
    private int count;
    
}
```
提供一些方法：
   - 添加元素
   - 删除元素
   - 获取元素
   - 显示所有元素

## 作业
1. 完成 List 类
2. 测试 List 类的功能
   - 不停的往 List 中加元素
   - 测试其他方法
3. 使用 List 类，升级电影院系统