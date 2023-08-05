# Break

1、break用于跳出一个循环体或者完全结束一个循环。

```java
for(int i=0; i<10; i++) {
    if(i==5) {
        break; //退出循环
    }
    System.out.println(i);
}
```



# Continue

2、continue语句的作用是跳过本次循环体中剩下尚未执行的语句，立即进行下一次的循环条件判定，可以理解为只是中止(跳过)本次循环，接着开始下一次循环。

```java
for(int i=0; i<10; i++) {
    if(i%2==0) {
        continue; //跳过偶数的循环
    }
    System.out.println(i);
}
```





### 一、break和continue的作用

  break和continue都是用来控制循环结构的，主要作用是停止循环。

### 二、break和continue的区别

1、break用于跳出一个循环体或者完全结束一个循环，不仅可以结束其所在的循环，还可结束其外层循环。

注意：

- 只能在循环体内和switch语句体内使用break。
- 不管是哪种循环，一旦在循环体中遇到break，系统将完全结束循环，开始执行循环之后的代码。
- 当break出现在循环体中的switch语句体内时，起作用只是跳出该switch语句体，并不能终止循环体的执行。若想强行终止循环体的执行，可以在循环体中，但并不在switch语句中设置break语句，满足某种条件则跳出本层循环体。

2、continue语句的作用是跳过本次循环体中剩下尚未执行的语句，立即进行下一次的循环条件判定，可以理解为只是中止(跳过)本次循环，接着开始下一次循环。

注意：

- continue语句并没有使整个循环终止。
- continue 只能在循环语句中使用，即只能在 for、while 和 do…while 语句中使用。

