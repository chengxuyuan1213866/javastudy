# Record(记录)

什么是Record？
        一个专门用于描述 内容不可变的，记录数据的类

        它可以自动生成 对 定义数据 进行创建、设置、访问、比较等代码，所以也被称作“数据类”。
    
        记录类 专用于保存属性数据（有点像JavaBean），生成后的数据不能改动。
    
        记录类的对象在初始化的时候就保存了数据，以后这里面的数据是不能修改的了。

语法

```java
public record 记录类类名(属性列表){
}

public record Data( int x, int y){
}
```

特点（底层）
1、本质就是一个类

2、类名后面的()中填写属性列表，编译后，里面的属性会被自动赋上“private final”的修饰符

3、 record类只会产生声明的构造，默认提供带参构造，且在构造中把参数赋值给对应的属性。

3、记录类会根据类名()中的属性列表，自动生成属性的get方法。所有的方法直接使用属性名做为方法名

4、记录类自动重写toString方法

5、自动重写了equals方法，判断了两个记录对象里面的内容是否相等

6、根据Java的比较规范要求，equals方法和hashCode方法必须遵守统一原则。所以，也重写hashCode方法。

```java
public record TestRecord(String name,int age,long tel) {
}

public class Main {
    public static void main(String[] args) {
        TestRecord testRecord1=new TestRecord("小明",9,1335061187);
        TestRecord testRecord2=new TestRecord("小明",9,1335061187);
        System.out.println(testRecord1.equals(testRecord2));
        System.out.println(testRecord1.hashCode()+" "+testRecord2.hashCode());
    }
}

结果：
     true
     2062253049 2062253049
```

Record内部可以添加哪些内容？
1、属性只能添加static的

2、可以添加自定义构造，但由于它没有公共无参构造，只有公共全参构造，所以必须通过this()的方式调用到记录的规范构造（记录类名后面()形式声明的构造方法）

3、可以添加 行为，但是所有的行为中不能修改记录的实例属性

4、可以有static的静态初始化块，不能书写实例初始化块

5、可以添加 普通的成员内部类和静态成员内部类。 在记录的方法里面也可以书写局部内部类或匿名内部类。

Record的继承和实现
1、不能主动用extends继承类。原因是：Java是单继承，而用record关键字声明的记录类，自带一个父类 -- java.lang.Record

2、Record也不能被继承，因为它自动生成的类是final的

4、自动实现了Serializable接口，可以直接参与序列化和反序列化

5、可以实现接口的，多实现

### 使用场景

​        把数据以对象的方式进行传递的时候

        假设我们想创建一个不可变的类Point，它有 x 和 y 的坐标。我们想实例化Point对象，读取它们的字段，并将它们存储在集合中使用。

### 如何判读一个类是Record？

​        使用反射的API，得到这个类的Class对象，调用isRecord()方法，它会返回true或false。
