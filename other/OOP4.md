## 面向对象OOP4 -- 多态

多态指能够呈现出多种不同的形态，在程序设计中，他意味这一个特定类型的变量，可以引用不同类型的对象，并且能自动调用引用对象的方法。也就是根据用到的不同对象类型，响应不同的操作。

###### **方法重写是多态的基础，方法重写是运行时多态**

###### **方法重载是编译时多态**

### 向上转型

向上转型可以自动转

```java
父类类型 引用变量名 = new 子类类型();
```

### 向下转型

向下转型必须先进行判断，用过instanceof

instanceof判断时，对象的类型必须和instanceof后面参数所指定的类有继承关系，否则会编译错误



## 多态的应用

1.使用父类作为方法的参数

2.使用父类作为方法的返回值