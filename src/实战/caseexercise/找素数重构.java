package 实战.caseexercise;

public class 找素数重构 {
    public static void main(String[] args) {

        int a=search(101,200);
        System.out.println(a);

    }
    public static int search(int start,int end){


        //在外层定义一个变量，用于记住素数的个数
        int count=0;

        for (int i = start; i <=end ; i++) {
            boolean flag=true;

            for (int j = 2; j <=i / 2 ; j++) {

                if (i % j == 0) {
                    //不是素数
                    flag = false;
                    break;
                }
            }
                //是素数
                if(flag){
                    System.out.println(i);
                    count++;
                }


        }
        return count;
    }
}
