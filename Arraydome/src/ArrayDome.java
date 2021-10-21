import java.util.Arrays;//Arrary

public class ArrayDome {
    public static void main(String[] args) {

        int array[]=new int[10];

        System.out.println(Arrays.toString(array));

        String strings[]=new String[10];
        System.out.println(Arrays.toString(strings));

        int[] arr = new int[]{5, 7, 8, 9, 3, 1, 4, 2, 6};
        int[] arr2 = new int[]{5, 7, 8, 9, 3, 1, 4, 2, 6};


        boolean isEquals = Arrays.equals(arr, arr2);//判断两个数组是否完全相同（顺序以及值）
        System.out.println(isEquals);

        Arrays.sort(arr);//将数组排序sort

        //Arrays.toString() 数组转换成String
        System.out.println(Arrays.toString(arr));

        isEquals = Arrays.equals(arr, arr2);//排序过后判断验证 第八行的注释
        System.out.println(isEquals);

        // Arrays.fill对数组填充(数组,填充元素) 一下填充0
        Arrays.fill(arr2, 0);
        System.out.println(Arrays.toString(arr2));

        Arrays.fill(arr2, 0,3,6);
        System.out.println(Arrays.toString(arr2));

        //Array.binarySearch()查找已排序的数组中的元素 找到返回元素下标 未找到返回一个负数
        int index = Arrays.binarySearch(arr, 2);
        System.out.println(index);
        if (index >= 0) {
            System.out.println("找到元素下标为:"+ Integer.toString(index)+"\nkey:"+Integer.toString(arr[index]));
        } else {
            System.out.println("未找到元素");
        }




    }
}
