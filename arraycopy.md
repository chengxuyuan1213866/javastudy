## arraycopy

```java
public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
 
// src -- 要进行复制的原数组
// srcPos-- 原数组从哪里开始复制
// dest -- 粘贴数据的数组
// destPos -- 粘贴的起始位置
// lengeh -- 粘贴的起始位置
```

应用

```java
// 在指定位置删除一个元素
public static void main(String[] args) {
        int[] nums = {2, 11, 33, 44, 55, 66, 277};
        int[] arr = new int[nums.length-1];
        System.arraycopy(nums,0,arr,0,2);
        System.arraycopy(nums,3,arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
```



```java
// 在指定位置添加一个元素
public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 3;
        int k = 7;
        int[] arrNew = new int[arr.length];
        System.arraycopy(arr,0,arrNew,0,n-1);
        arrNew[n-1] = k;
        System.arraycopy(arr,n,arrNew,n,arr.length-n);
        System.out.println(Arrays.toString(arrNew));

    }
```

