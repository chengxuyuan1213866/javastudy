## 数组工具类

## Arrays类

| 方法                       | 返回类型      | 说明                                                         |
| -------------------------- | ------------- | ------------------------------------------------------------ |
| equals(arr1,arr2)          | boolean       | 比较两个数组是否相等                                         |
| sort(arr)                  | void          | 对数组arr的元素进行排序(默认是升序排列)                      |
| toString(arr)              | String        | 将一个数组转成一个字符串                                     |
| fill(arr,a)                | void          | 将数组arr的所有元素都赋值成a                                 |
| copyOf(arr,len)            | 与arr类型相同 | 把arr复制成一个长度为len的新数组                             |
| binarySearch(arr,a)        | int           | 查询a在数组arr中的下标                                       |
| compare(arr1,arr2)         | int           | 按自然比较比较数组，前面大返回大于0的值，反之返回小于0的值   |
| copyOfRange(arr,start,end) | 与arr类型相同 | 将指定数组的指定范围复制到新数组中                           |
| mismath                    | int           | 查找并返回两个数组之间第一个不匹配的相对索引，如果未找到返回一个负值 |

##### 1.equals

```java
public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = {1,2,3,4};
        System.out.println(Arrays.equals(arr,arr1));
    }
// 结果是true
public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = {1,2,3};
        System.out.println(Arrays.equals(arr,arr1));
    }
// 结果是false
```

##### 2.sort

默认为升序排列

```java
 public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
// [1, 4, 5, 6, 8, 9]
```

一种降序方法

```java
import java.util.Arrays;
import java.util.Collections; 
public static void main(String[] args) {
        Integer[] arr = {1,5,6,8,9,4};   //  Integer 类型的数据
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
```



##### 3.toString

将数组转换为字符串

```java
 public static void main(String[] args) {
        int[] arr = {1,5,6,8,9,4};
        System.out.println(Arrays.toString(arr));
    }
// 结果为[1,5,6,8,9,4]
```

##### 4.fill

将数组所有元素变成相同的值

```java
int[] arr = {1,5,6,76,5};
        Arrays.fill(arr,6);
        System.out.println(Arrays.toString(arr));

// [6, 6, 6, 6, 6]
```

