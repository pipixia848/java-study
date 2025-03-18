package litter;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class 随机数实例 {
    public static void main(String[] args) {
        //生成随机数
        Random r=new Random();
        int number=r.nextInt(100);

        //从键盘上获取数字
        Scanner sc=new Scanner(System.in);

        //循环主体
        while(true){
            int a=sc.nextInt();
            if(a>number){
                System.out.println("大了");
            }
            else if(a<number){
                System.out.println("小了");
            }
            else{
                System.out.println("猜对了！");
                break;
            }

        }


    }
}






