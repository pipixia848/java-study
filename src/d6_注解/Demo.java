package d6_注解;

@MyTest4(value = "就这", aaa = 11.3, bbb = {"至尊宝","紫霞"})
public class Demo {

    @MyTest4(value = "aaa", aaa = 111.3, bbb = {"牛魔王","铁扇"})
    public void test1(){

    }
}
