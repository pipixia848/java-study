package 实战.caseexercise;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class 模拟双色球 {
    public static void main(String[] args) {

        judge(userSelectNumber(),createLuckNumber());
        //userSelectNumber();
        int[] a=createLuckNumber();
//        int[] a= {1,13,14,15,16,17,1};
//        int[] b= {22,13,14,15,16,12,1};
//        judge(a,b);
        //开奖
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    //1,用于让用户投注一组号码（前6个是红球，最后一个是篮球）并返回用户投注的号码
    public static int[] userSelectNumber(){
        //用扫描器，依次让用户输入所要购买的号码，且号码不可重复
        Scanner sc=new Scanner(System.in);
        int[] num=new int[7];

        //遍历前6个数据，并将数据输入
        for (int i = 0; i < num.length-1; i++) {


            while (true) {
                System.out.println("请输入第"+(i+1)+"个红球号码,且不可重复");
                int number=sc.nextInt();

                //判断是否在1-33之间
                if(number<1||number>33){
                    System.out.println("数据错误，重新输入");
                    continue;
                }
                else{
                    num[i]=number;
                    break;
                }
            }
        }

        //输入第7个数据
        System.out.println("请输入最后一个蓝球号码，且范围为1-16");

        while (true) {
            int n=sc.nextInt();
            if(n<1||n>16){
                System.out.println("输入的篮球号码有误，请重新输入");
            }
            else{
                num[6]=n;
                break;
            }
        }


        //判断数组中的元素是否重复
        if(repeat(num)){
            return num;
        }
        int[] a={0};
        return a;
    }

    //2.系统随机一组中奖号码（前6红，后1蓝）返回中奖号码
    public static int[] createLuckNumber(){
        Random r=new Random();
        int[] ages=new int[7];
        int[] num=new int[33];

        //用随机数选前6个双色球，且不能重复
        //用数组，在数组中存入1-33中的数，将数组中的元素进行随机互换，再取出前6个数
        for (int i = 0; i < num.length; i++) {
            num[i]=i;
        }
        //将数组中元素随机互换
        for (int i = 0; i < num.length; i++) {
            int a=r.nextInt(1,33);
            int temp=6;
            temp=num[i];
            num[i]=num[a];
            num[a]=temp;

        }
        for (int i = 0; i < ages.length-1; i++) {
            ages[i]=num[i];
        }



        ages[6]=r.nextInt(1,17);

        return ages;
    }

    //3.传入两组号码，来判断用户的中奖情况
    public static void judge(int[] userNumber,int[] luckNumber){
        int temp=0;
        for (int i = 0; i < userNumber.length-1; i++) {

            for (int j = 0; j < luckNumber.length-1; j++) {
                if(userNumber[i]==luckNumber[j]){
                    temp++;
                }

            }
        }
        if(userNumber[userNumber.length-1]==luckNumber[luckNumber.length-1]){
            temp++;
        }
        System.out.println("你猜中了"+temp+"个号码");

    }
    //再写一个方法用来判断录入的数据中是否有重复的
    public static boolean repeat(int[] ages){
        for (int i = 0; i < ages.length-1; i++) {
            //1
            boolean b=false;
            //[1,2,3,4,1,6]
            for (int i1 = 0; i1 < ages.length-1; i1++) {
                if(i!=i1 && ages[i]!=ages[i1]){
                    b=true;
                    return b;

                }
                else{
                    b=false;
                }

            }
        }
        System.out.println("号码重复了，抽奖无效");
        return false;

    }
}

/*
稍微还有点问题，大体上差不多了，就这样吧，不想改了，写了一上午了
 */















