package d7_可变参数;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {

        test(12,34,45,656,1,2);

        test(new int[] {12,234,345,456,11});

    }

    //可变参数可以灵活的接受数据

    //注意1，一个形参列表中，只能有一个可变参数
    //注意2，可变参数必须放在形参列表的最后
    public static void test(int...nums){
        //可变参数在方法内部，本质上是一个数组
        System.out.println(nums.length);

        System.out.println(Arrays.toString(nums));

        System.out.println("-------------------");
    }
}
