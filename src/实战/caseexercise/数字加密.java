package 实战.caseexercise;

public class 数字加密 {
    public static void main(String[] args) {

//        System.out.println(9876 / 1000);
//        System.out.println((9876 % 1000)/100);
//        System.out.println((9876 % 100)/10);
//        System.out.println(9876 % 10);
        System.out.println(encrypt(1983));
        System.out.println(encrypt(8346));
    }

    public static String encrypt(int number){
        //分别求出个十百千位单独的数字
        int[] ages=new int[4];
        ages[0]=(number/1000);
        ages[1]=(number%1000)/100;
        ages[2]=(number%100)/10;
        ages[3]=(number%10);

        //进行数据加密
        int[] newages=new int[4];
        int[] num=new int[4];
        for (int i = 0; i < ages.length; i++) {
            newages[i]=(ages[i]+5)%10;

        }
        //将数据进行反转
        for (int i = 0; i < newages.length; i++) {
            num[i]=newages[num.length-1-i];
        }

        //遍历新数组
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
        //最后进行相加
        String sum="";
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];

        }

        return sum;
    }
}
