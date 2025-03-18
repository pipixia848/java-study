package 面向对象;

public class Test {
    public static void main(String[] args) {
        //创建一个学生类对象，用来封装数据
        Student a1=new Student();
        Student a2=new Student();

        a1.name="张三";
        a1.chinese=90;
        a1.math=100;

        a2.name=a1.name;
        a2.name="lisi";
        System.out.println(a1.name);

        //进行调用，名字+. +方法
//        a1.printAverageScore();
//        a1.printTotalScore();
    }
}
