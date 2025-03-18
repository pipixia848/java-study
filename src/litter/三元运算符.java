package litter;

public class 三元运算符 {
    public static void main(String[] args) {

        System.out.println(1>2 ? 3:4);

        //找三个整数的最大值
        int a=15;
        int b=13;
        int c=11;
        int max1=a>b ? a:b;
        int max2=max1>c ? max1:c;
        System.out.println(max2);

    }
}
