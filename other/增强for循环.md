## 增强for循环

### JDK1.5引进了一种新的循环类型，即增强型for循环，可用于数组和集合

```java

for(type element: arrays)
  {
    System.out.println(element);
  }
```

```java
public class Demo{
	public static void main(String[] args){
	    int arr[] = {1,2,3};
	    /**
	    *增强for
	    */
	    for(int num : arr){
	     System.out.println(num);
	    }
	}
}
