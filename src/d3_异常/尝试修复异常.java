package d3_异常;

import java.util.Scanner;

public class 尝试修复异常 {
    public static void main(String[] args) {

        while (true) {
            try {
                getMoney();
                break;
            } catch (Exception e) {
                System.out.println("输入正确的价格");
            }
        }


    }
    public static void getMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入价格");

        while (true) {
            double money = sc.nextDouble();

            if(money >= 0){
                System.out.println("价格合适");
                break;
            }
            else{
                System.out.println("价格不合适，重新输入！！");
            }
        }
    }
}
