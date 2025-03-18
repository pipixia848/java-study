package litter;

public class 类型转换 {
    public static void main(String[] args) {
        int a;
        byte c;
        c=12;
        a=c;
        System.out.println(a);

        double d=a;
        System.out.println(d);
        //byte short int long float double char boolean

        int f=256;
        //byte h=(byte)f;
        byte h= (byte) f;

        System.out.println(h);
        System.out.println(f);

        System.out.println("5"+5);

    }
}
