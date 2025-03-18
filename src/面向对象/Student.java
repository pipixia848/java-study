package 面向对象;

public class Student {

    String name;
    double chinese;
    double math;

    //设计方法
    public void printTotalScore(){
        System.out.println(name+"的总成绩是"+(chinese+math));
    }

    public void printAverageScore(){
        System.out.println(name+"的平均成绩是"+(chinese+math)/2*1.0);
    }

}



















