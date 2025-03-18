package 实战.caseexercise;

import java.util.Random;
import java.util.Scanner;

public class 抢红包 {
    public static void main(String[] args) {
        int[] money = {9, 666, 188, 520, 99999};

        lottery2(money);
    }
//怎么抽奖？
    //首先用随机数，随机找出数组中的一个数，并将它赋值为0；
    //运用循环嵌套；
    public static void lottery(int[] ages){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < ages.length; i++) {
            System.out.print("按任意键完成抽奖: ");
            sc.next();


            while(true) {
                //
                int a=r.nextInt(ages.length);
                if(ages[a]==0){
                    continue;
                }
                else{
                    System.out.println("抽中了："+ages[a]);
                    ages[a]=0;
                    break;
                }


            }
        }
        System.out.println("活动结束!");

    }

    //抢红包2，将数组中的顺序随机打乱，再重新进行遍历，可减少性能损耗
    public static void lottery2(int[] ages){
        Random r=new Random();
        //循环后，数组中的内容已被打乱
        for (int i = 0; i < ages.length; i++) {
            int a=r.nextInt(ages.length);
            int temp=0;
            temp=ages[i];
            ages[i]=ages[a];
            ages[a]=temp;

        }
        //让用户抽奖，并且遍历数组即可
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < ages.length; i++) {
            System.out.print("按任意键进行抽奖:");
            sc.next();
            System.out.println("抽到了:"+ages[i]);
        }
        System.out.println("抽奖结束！！");

    }

}
