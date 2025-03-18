package 实战.caseexercise;

import java.util.Random;
import java.util.Scanner;

public class 评委打分 {
    public static void main(String[] args) {

        System.out.println(fraction(5));

    }

    public static int fraction(int a){
        int[] ages=new int [a];
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        //录入数组元素
        for (int i = 0; i < ages.length; i++) {
            System.out.println("请录取第"+(i+1)+"个评委的分数");
            ages[i]=sc.nextInt();

        }
        //遍历数组，取得最高最低分
        int max=0;
        int min=ages[0];
        int total=0;

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
            //得出最大最小值
            if(max<ages[i]){
                max=ages[i];
            }
            if(min>ages[i]){
                min=ages[i];
            }
            //算出总分
            total+=ages[i];

        }

        //算出去掉最值后的平均分
        return (total - max - min) / (ages.length - 2);

        //System.out.println("最终分为："+(total - max - min) / (ages.length - 2));
//        System.out.println("----------------");
//        System.out.println(max);
//        System.out.println(min);
//        return 0;
    }
}
