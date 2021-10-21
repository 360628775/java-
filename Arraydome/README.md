### Array

#### 1.数组定义声明格式

```java
  Object[] object=new Object[]={Object,Object,……}
//元素类型   数组名     元素类型    { 元素,……}
  Object[] object=new Object[lenght]
//元素类型   数组名     元素类型[lenght|正整数<0]   
```

#### 2.默认值



```java
int array[]=new int[10];
System.out.println(Arrays.toString(array));
//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
String strings[]=new String[10];
System.out.println(Arrays.toString(strings));
//[null, null, null, null, null, null, null, null, null, null]



```

数组的默认值为元素类型的默认值

### Arrays类

#### 基本函数

```java
/*
功能：对数组按照升序排序
*/
void  Array.sort(Object[] array);

/*
功能：数组填充相同元素
*/
void  Array.fill(Object[] array,Object object);
/*
功能：数组范围填充相同元素(范围)左闭右开
*/
void  Array.fill(Object[] array,int fromIndex,int toIndex, Object object);

/*
功能：返回数组的字符串形式
*/
 String Arrays.toString(Object[] array);

/*
功能：返回二维数组的字符串形式
*/
 String Arrays.toString(Object[][] array);

/*
功能：返回查找元素的下标 
返回值大于等于0 查找成功
返回值小于0 查找失败 
PS：需要数组排好序，底层为二分查找法

*/
int binarySearch(Object[] array, Object key) 


  
```

