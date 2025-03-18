package d1_排序;

import java.util.Scanner;

public class 二分查找 {
    public static void main(String[] args) {
        //1.准备一个数组
        int[] arr = {7, 23, 81, 103, 127, 131, 147};

        //运用二分查找，找出开始索引与结束索引
        // 将开始索引与结束索引相加除2，找出数组中间那个数，判断
        //挺好，就是刷新率低了一点，有点看不习惯，
        int start = 0;
        int end = arr.length-1;

        Scanner sc = new Scanner(System.in);
        System.out.println("shuruyigeshu");
        int b = sc.nextInt();

        int i = 1;

        while(start <= end){
            //1.在一半之前
            int middle = (start + end) / 2;
            if(b < arr[middle]){
                end = middle - 1;
            }
            //在一半之后
            else if(b > arr[middle]){
                start = middle + 1;
            }

            else{
                i = 0;
                System.out.println("cunzai");
                break;
            }
        }
        if(i == 1) {
            System.out.println("bucunzai");
        }

    }
}
