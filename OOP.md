## 面向对象

面向对象程序设计(OOP),是一种基于对象概念的软件开发方法

面向对象三大特性

- 封装
- 继承
- 多态

### 类

类是具有相同状态和相同行为的一组对象的集合，要创建对象必须先定义类

- 属性表示对象的状态
- 方法表示对象的行为

### 对象

对象就是真实存在的具体个体

### 类和对象的关系

类是多个对象综合抽象的结果，而对象是类的实例

## 定义类

```java
[访问修饰符] class 类名{
    成员变量声明;     // 字段/属性
    成员方法声明;		// 行为
} 
```

- 访问修饰符如public、private等是可选的
- class是声明类的关键字
- 类的命名大驼峰

```java
public class Person {
    private String name = "蔡徐坤";
     int a = 2;
    private String age = a + "坤年";
    char sex = '鸡';
    public void introduce()
    {
        System.out.println("姓名：" + name + " \t"+ "年龄：" + age+ "\t"+ "性别" + sex);
    }
    public void sleep()
    {
        System.out.println(name + "该睡觉了");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "蔡徐坤";
        p.age = "5坤年";
        p.sex = 'j';
        p.introduce();
        p.sleep();
    }
}
```



## 类的字段(属性)

```java
[访问修饰符]  数据类型  字段名;
```

```jav
private String name = "蔡徐坤";
int a = 2;
private String age = a + "坤年";
char sex = '鸡';
```



## 类的方法



```java
// 进行自我介绍 
public void introduce()
    {
        System.out.println("姓名：" + name + " \t"+ "年龄：" + age+ "\t"+ "性别" + sex);
    }
// 输出该睡觉了
    public void sleep()
    {
        System.out.println(name + "该睡觉了");
    }
```







## 创建和使用对象

1.创建对象

```java
类名 对象名  = new 类名();
```

```java
// 在main方法中从创建对象  new Person()
public static void main(String[] args) {
        Person p = new Person();
        p.name = "蔡徐坤";
        p.age = "5坤年";
        p.sex = 'j';
        p.introduce();
        p.sleep();
    }
```



2.使用对象

在Java中，要引用对象的字段和方法，需要使用成员运算符   **`.`**

```ja
对象名.属性
对象名.方法名()
```

```java
public static void main(String[] args) {
        Person p = new Person();
        p.name = "蔡徐坤";    // 给实例化出的对象中的name字段赋值
        p.age = "5坤年";		// 给实例化出的对象中的age字段赋值
        p.sex = 'j';		// 给实例化出的对象中的sex字段赋值
        p.introduce();		// 调用自我介绍方法
        p.sleep();			// 调用睡觉方法
    }
```

