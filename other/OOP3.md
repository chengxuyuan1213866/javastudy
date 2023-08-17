## super关键字

每个构造方法都会调用父类的构造

**当子类构造方法中没有 super() 关键字，而且父类中没有无参数构造方法，却有一个或多个有参数构造方法时，是错误的；**

super关键字调用父类成员

```java
调用父类的构造方法 : super([实参列表])；
调用父类属性和方法 : super.<父类字段名/方法名>
```

#### super和this的区别

1. 调用方法
   - this访问本类中的方法，包括从父类继承的方法
   - super访问父类的方法
2. 调用构造方法
   - this表示调用本类的构造方法，必须放在构造方法的首行
   - super表示调用父类构造，必须放在子类构造方法首行，如果表示调用父类的无参构造，即super()可省略
3. 调用字段
   - this字段调用当前对象的字段，包括从父类继承的字段
   - super字段：调用的是父类的字段
4. 使用
   - this在实例方法中可以使用，在static中不能使用，每个类都有this
   - super在实例方法中可以使用，在static中不能使用，只能出现在子类中
5. 其他
   - this表示当前对象
   - super不能表示当前对象



## Object

Object是所有类的父类，所有类都直接或间接继承了java.lang.Object类，Object是所有Java类的祖先。

在定义类时，没有使用extends关键字，也就是没有显式地继承某个类，那这个类直接继承Object类

### Object类的方法

1. toString 表示返回对象的有关信息，返回字符串对象
2. equals 比较两个对象是否是同一个对象
3. hashCOde  返回该对象的哈希值
4. finalize 在进行GC之前调用的一个方法
5. getClass 获取类结构信息






























