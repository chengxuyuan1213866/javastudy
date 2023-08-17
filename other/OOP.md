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

```java
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

#### 1.创建对象

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



#### 2.使用对象

在Java中，要引用对象的字段和方法，需要使用成员运算符   **`.`**

```java
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

## static

- ``static`` 修饰的属性和方法称为静态属性(方法)或者类变量，**属于类不属于对象**。
- 没有``static``修饰的方法和属性称为实例变量
- 静态方法中不能直接访问实例变量和实例方法
- 再实例变量中可以直接调用类中定义的静态变量和静态方法

#### 实例变量和静态变量的区别：

**1、生命周期的不同：**
成员变量随着对象的创建而存在随着对象的回收而释放。
静态变量随着类的加载而存在随着类的消失而消失。

**2、调用方式不同：**

成员变量只能被对象调用。

静态变量可以被对象调用，也可以用类名调用。（推荐用类名调用）

**3、名称不同：**

实例变量。

静态变量称为类变量。

4、**数据存储位置不同**：

实例变量数据存储在堆内存的对象中，所以也叫对象的特有数据。

静态变量数据存储在方法区（共享数据区）的静态区，所以也叫对象的共享数据。

## 静态初始化和实例初始化

```java
public class StaticDemo {
    public StaticDemo(){
        age = 20;
        System.out.println(age);
        System.out.println("现在执行构造方法");
    }
    int age;
    {
        age = 10;
        System.out.println("age为" + age);
        System.out.println("现在进行的是实例初始化");

    }
    static {
        String name = "坤坤";
        System.out.println(name);
        System.out.println("现在进行的是静态初始化");
    }
    String name ;


   public StaticDemo(int age)
    {
        System.out.println("传参时的age为" + age);
        System.out.println("这里是传参时的构造方法");
    }


    public static void main(String[] args) {
        StaticDemo kun = new StaticDemo();
        StaticDemo kk = new StaticDemo(250);
    }

}


```





### 1.静态初始化

```java
// 静态初始化
static {
  // 静态初始化代码块
}
```

```java

    static {
        String name = "坤坤";
        System.out.println(name);
    }
    String name ;



//先在堆区中创建类，并且执行静态初始化，所以会先打印  坤坤   

```







2. 实例初始化

```java
// 实例初始化

{
    // 实例初始化代码
}
```

```java
int age;
    {
        age = 10;
        System.out.println("age为" + age);
        System.out.println("现在进行的是实例初始化");

    }

    public static void main(String[] args) {
        StaticDemo kun = new StaticDemo();
    }
// 在每次实例化时会先执行实例初始化，再执行构造方法、

```





## 构造方法

- 每个类 必须要有一个构造方法。
- 如果没有定义类的构造方法，系统会自动为该类生成一个默认的构造方法。
- 默认的构造方法的参数列表及方法体均为空，所生成的对象的属性值为零或空。
- 当定义构造方法时，会屏蔽掉默认的构造方法。

```java

// 构造方法
[访问修饰符]  方法名  ([参数列表])
{
    // 省略方法体的代码
}
```

```java
// 下面是不传参的构造方法
public StaticDemo(){
        age = 20;
        System.out.println(age);
        System.out.println("现在执行构造方法");
    }
 public static void main(String[] args) {
        StaticDemo kun = new StaticDemo();
        StaticDemo kk = new StaticDemo(250);
    }

}
```

```java
// 传参的构造方法

public StaticDemo(int age)
    {
        System.out.println("传参时的age为" + age);
        System.out.println("这里是传参时的构造方法");
    }
 public static void main(String[] args) {
        StaticDemo kun = new StaticDemo();
        StaticDemo kk = new StaticDemo(250);
    }

}
```

**这时我们发现  传参和不传参构成了方法的重载** ，我们称为构造方法的重载。

## 实例化的执行流程

初始化的顺序：
           第一次使用时，先**加载类**。进行**静态初始化**
           每次**实例化**时先执行**实例初始化** 再执行**构造**

## 遮蔽(Shadowing)

指的是在一个作用域中使用了一个和外层作用域相同的变量名，导致内部变量**遮蔽**了外部变量，即无法直接访问外部变量。































