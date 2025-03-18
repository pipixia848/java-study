package litter;
import java.util.Random;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt(); //从键盘上截取一个数字
        String name=sc.next(); //从键盘上接取一个字符串

        System.out.println("年龄是："+age);
        System.out.println("姓名是："+name);
        //随机数
        Random ra=new Random();
        int number=ra.nextInt(10); //生成0~9的随机数



    }
}


//import java.util.Scanner;   Scanner.sc=new Scanner(System.in)   sc.nextInt();数字 sc.next(); 字符串
//Scanner sc=new Scanner(System.in);
