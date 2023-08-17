## this关键字

this关键字是调用当前对象进行操作

**this**关键字只能在类的**成员方法**和**构造方法**中使用

1.引用当前对象的成员变量

当存在与成员变量同名的局部变量(会产生遮蔽)，则可以使用this关键字来引用当前对象的成员变量。

```c++
private String name;
    private int age;

    public void setName(String name)
    {
        // 引用类中的成员变量
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
```



2.调用当前对象的成员方法

```java
public void say()
    {
        System.out.println("你好啊");
    }
    public void sayHello()
    {
        this.say();
    }
```



3.调用用当前对象的构造方法

```java
public Person()
{
    this("张三",66);
}
public Person(String name,int age)
{
    this.name = name;
    this.age = age;
}
```

## 封装

封装的实质是将类的状态信息（成员变量）、方法等隐藏在类的内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏数据的访问和操作。

```java

public class Person {
    private String name;
    private int age;
    // 封装
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void say()
    {
        System.out.println("你好啊");
    }
    public void sayHello()
    {
        this.say();
    }
    public Person()
    {
        this("张三",66);
    }
    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

```

封装的优点

- 防止外部直接访问类的内部数据，可以保护数据的安全性
- 通过限制外部访问，可以更好的控制数据的正确性和完整性
- 可以隐藏类的实现细节，使得类的用户不需要了解类的内部实现细节，只需要知道如何使用类的接口

#### 封装的步骤

1. 修改字段的可见性

访问修饰符

1. 设置getter/setter方法
2. 设置字段的存取限制

对字段的合法性进行校验

## 包

包是类的容器，利用包来管理类，避免类名冲突

- 存放类
- 防止命名冲突
- 允许在更广的范围内保护类、数据和方法

包的定义

```java
package 包名;
```

包不能以**java/javax**开头

包的使用

```java
import 包;
```

## 访问修饰符（三种4个）

- public 修饰的成员变量和成员方法可以在所有类中访问
- protected可以在声明它的类中访问，也可以在子类中访问，但不能在位于其他包的非子类中访问
- package-access 包访问修饰符，什么都不写时默认是包访问修饰符，不能在位于其他包的类中访问
- private只能在声明他的类中访问

类的访问修饰符

- public在同一个包或者不同包都可以访问
- package-access只能在同一个包中访问

类成员的访问修饰符



![](https://s2.loli.net/2023/08/17/9JzSVo4Awr7RhHM.jpg)

## 包装类

在Java中基本数据类型和对象类型是两个不同的概念。为了使基本数据类型也具备面向对象的特性，Java提供了包装类Wrapper Class.

- 包装类用于把基本数据类型封装成对象

- Java提供了8种包装类，对应8种基本数据类型

| 基本类型 |       包装类        |
| :------: | :-----------------: |
| boolean  |  java.lang.Boolean  |
|   byte   |   java.lang.Byte    |
|  short   |   java.lang.short   |
|   int    |  java.lang.Integer  |
|   long   |   java.lang.Lang    |
|  float   |   java.lang.Lang    |
|  double  |  java.lang.Double   |
|   char   | java.lang.Character |

#### 包装类常量

- MAX_VALUE  --- 最大值
- MIN_VALUE  --- 最小值

```java
public class wrapperClass {
    public static void main(String[] args) {
        System.out.println("int的最大值：" + Integer.MAX_VALUE);
        System.out.println("byte的最大值：" + Byte.MAX_VALUE);
        System.out.println("double的最大值：" + Double.MAX_VALUE);
        System.out.println("float的最大值：" + Float.MAX_VALUE);
    }
}
// 最小值同理
```

#### 装箱/拆箱

装箱和拆箱指的是基本数据类型和对应包装类之间的转换。

自动装箱/自动拆箱 ，指编译器自动帮我们进行装箱拆箱操作

## 继承

新类通过在不增加自身代码的情况下，通过从现有类中继承其属性和防范，来实现充实自身内容，这种行为称为继承。

新类称为子类

现有类成为父类

- java类中只支持单继承，一个类只能··有一个直接父类。

```java
[访问修饰符] class 子类名 extends 父类名{
    子类成员变量
    子类成员方法
}
```

- 子类可以继承父类的非私有属性和方法。子类可以使用父类的属性和方法，无需编写相同的代码
- 子类可以添加自己的属性和方法。可以增加父类中没有的父类和方法，从而增加代码的灵活性和可拓展性
- 子类的构造方法可以调用父类的构造方法(不是继承) 。在子类的构造方法中使用super关键字可以调用父类的构造方法，从而初始化父类的属性
- Object类是所用类的根类。，因此可以使用Object定义的一些方法，例如equals()、hashCode()等。
- 子类可以称为其他类的父类

## 方法重写

必须满足的条件

- **在继承关系中**，

- 重写的方法与被重写的方法必须有相同的方法名称
- 重写方法与被重写方法必须有相同的参数列表
- 重写的方法与被重写的方法的返回值类型相同或者是其子类
- 重写方法不能缩小被重写方法的访问权限
- **不能用子类的非静态方法重写(覆盖)父类的静态方法，否则会编译错误**
- 不能重写父类中的最终(final)方法
- 不能用子类的静态方法重写父类的实例方法

方法重写一般在前面加上注解@Override

#### 方法重载与方法重写的区别

- 方法重载是在一个类中定义多个同名但参数不同的方法，而方法重写是在子类中重写父类的方法，方法名和参数都相同
- 方法重载是编译时多态，方法重写是运行时多态

## 方法隐藏

子类和父类拥有相同名字的属性或方法(方法隐藏只有一种形式，就是父类和子类存在签名相同的静态方法)，父类同名的属性和方法形式上不见了。

## instanceof

**instanceof**是 Java 的保留关键字。它的作用是测试它左边的对象是否是它右边的类的实例，返回 boolean 的数据类型。

```java
public static void main(String[] args) {
        Sub b = new Sub(6,9);
        System.out.println((b instanceof Sub));
    }
// 结果为true
```

## final

1. final修饰变量，final修饰的变量称为常量，一旦被初始化，就无法再被改变。
2. final修饰方法，final修饰的方法称为不可覆盖方法，**子类无法重写**该方法
3. final修饰类，修饰的类无法继承
