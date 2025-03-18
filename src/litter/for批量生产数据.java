package litter;

public class for批量生产数据 {
    public static void main(String[] args) {
        int i=0;
//        for(int a=1;a<=100;a++){
//            //System.out.println(a);
//
//            i+=a;
//            if(a==100) {
//                System.out.println(i);
//            }
//        }
        //求1~100的奇数和
        for(int a=1;a<=100;a++){
            if(a%2!=0)
                i+=a;

        }
        System.out.println(i);
    }
}
