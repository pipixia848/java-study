package d1_排序;

import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {9,5,3,6,7,1};

        int[] arr1 = sort(arr);

        System.out.println(Arrays.toString(arr1));

    }
    //设计一个方法，将数组中的内容通过冒泡排序进行升序
    public static int[] sort(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-i-1; j++) {
                int a = 0;
                if(arr[j] > arr[j+1]){
                    a = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }
}
