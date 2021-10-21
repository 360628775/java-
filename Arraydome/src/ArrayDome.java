import java.util.Arrays;//Arrary

public class ArrayDome {
    public static void main(String[] args) {
        int[] arr =new int[]{5,7,8,9,3,1,4,2,6};
        int[] arr2 =new int[]{5,7,8,9,3,1,4,2,6};

        boolean isEquals=Arrays.equals(arr,arr2);//判断两个数组是否完全相同（顺序以及值）
        System.out.println(isEquals);

        Arrays.sort(arr);//将数组排序sort

        //Arrays.toString() 数组转换成String
        System.out.println(Arrays.toString(arr));

        isEquals=Arrays.equals(arr,arr2);//排序过后判断验证 第八行的注释
        System.out.println(isEquals);

        // Arrays.fill对数组填充(数组,填充元素) 一下填充0
        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));

    }
}
