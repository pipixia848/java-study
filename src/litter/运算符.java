package litter;

public class 运算符 {

    public static void main(String[] args) {

//        int a=10;
//        a+=1;
//        System.out.println(++a);
//        System.out.println(a++);

        int c=10;
        int d=5;
        int rs3=c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);
        System.out.println(c);
        System.out.println(d);

    }

}
