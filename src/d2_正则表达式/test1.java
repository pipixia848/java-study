package d2_正则表达式;

public class test1 {
    public static void main(String[] args) {

        System.out.println(checkQQ("12342354as4"));

        System.out.println("------------------");

        System.out.println(checkQQ1("12342354as4"));


    }

    //使用正则表达式
    public static boolean checkQQ1(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq){

        //1.首先进行判断
        if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20){
            return false;
        }
        //2.进行第二步判断，是否都是数字
        for (int i = 0; i < qq.length(); i++) {
            char ch = qq.charAt(i);

            if(ch<'0' || ch>'9'){
                return false;
            }
        }
        return true;
    }
}
