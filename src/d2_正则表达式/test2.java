package d2_正则表达式;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //checkPhone();
        //checkEmail();
        checktime1();
    }

    private static void checkPhone() {

        while (true) {
            System.out.println("输入号码：");
            Scanner sc = new Scanner(System.in);

            String ph = sc.nextLine();

            //使用正则表达式
            if(ph.matches("(1[3-9]\\d{9})")){
                System.out.println("号码正确");
                break;
            }
            else{
                System.out.println("号码错误");
            }
        }
    }

    //邮箱的判断
    private static void checkEmail() {

        while (true) {
            System.out.println("输入号码：");
            Scanner sc = new Scanner(System.in);

            String ph = sc.nextLine();

            //使用正则表达式
            if(ph.matches("\\w{2,}@\\w{2,10}(\\.\\w{2,10}){1,2}")){
                System.out.println("号码正确");
                break;
            }
            else{
                System.out.println("号码错误");
            }
        }
    }

    //校验时间
    private static void checktime(){

        while (true) {
            System.out.println("输入时间：");
            Scanner sc = new Scanner(System.in);

            String ph = sc.nextLine();

            //使用正则表达式
            if(ph.matches("^([01]?\\d|2[0-3]):[0-5]?\\d$")){
                System.out.println("时间正确");
                break;
            }
            else{
                System.out.println("时间错误");
            }
        }

    }























    //校验时间2

    private static void checktime1(){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入时间");
        String time = sc.nextLine();

        //判断时间
        //时 分 秒 23:12:56
        if(time.matches("^[01]?\\d|2[0-3]:[0-5]?\\d:[0-5]?\\d$")){
            System.out.println("时间正确");
        }
        else{
            System.out.println("时间错误");
        }
    }
}


