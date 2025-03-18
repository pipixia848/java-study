package d3_异常;

public class 自定义异常 {
    public static void main(String[] args) {

//        try {
//            saveAge(160);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try {
            saveAge2(19);
        } catch (AgeIllegalException e) {
            throw new RuntimeException(e);
        }

    }

    //编译时异常
    public static void saveAge2(int age) throws AgeIllegalException{

        if(age > 0 && age <150){
            System.out.println("数据保存成功~");
        }
        else {
            //throws 用在方法上，抛出方法内部的异常
            throw new AgeIllegalException("/age is illegal,your age is " + age);
        }

    }

    //运行时异常
    public static void saveAge(int age){

        if(age > 0 && age <150){
            System.out.println("数据保存成功~");
        }
        else {
            throw new AgeIllegalRuntimeException("/age is illegal,your age is " + age);
        }

    }
}
