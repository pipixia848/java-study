package constructor;

public class Student {

    String name;
    double Score;

    public Student(){
        System.out.println("无参数构造器被执行了");

    }

    public Student(String name,int Score){

        System.out.println("有参数构造器被执行了");
        this.name=name;
        this.Score=Score;
        //System.out.println(name+"的分数是"+Score);
    }

}
