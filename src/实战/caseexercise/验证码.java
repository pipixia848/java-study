package 实战.caseexercise;

import java.util.Random;

public class 验证码 {
    public static void main(String[] args) {

        System.out.println(createCode(4));

    }

    public static String createCode(int n){
        //随机数
        String code="";
        Random r = new Random();
        for (int i = 1; i <=n ; i++) {
            int type=r.nextInt(3);
            switch(type){
                //数字
                case 0:
                    code+=r.nextInt(10);
                    break;
                    //大写字母
                case 1:
                    code+=(char) r.nextInt(65,91);
                    break;
                    //小写字母
                case 2:
                    code+=(char) r.nextInt(97,123);
                    break;


            }

        }
        return code;

    }
}
