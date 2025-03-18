package javabean;

public class Student {

    //实体类的书写要求

    //1,成员变量必须私有，且每个成员变量必须要有get set类
    private String name;
    private double score;

    //2,必须为类提供一个无参数构造器


    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
