package 封装;

public class Student {

    private int score;

    //对成员变量进行赋值
    public void setScore(int score){
        this.score=score;
    }

    //返回成员变量的值
    public double getScore(){
        return score;
    }

    //写一个方法
    public void printScore(){
        System.out.println(score>=60? "及格":"不及格");
    }
}
