package javabean;

public class StudentOperator {

    private Student student;
    public StudentOperator(Student student){

        this.student=student;
    }
    public void printPass(Student student){

        if(student.getScore()>=60){
            System.out.println(student.getName()+"同学及格");
        }
        else{
            System.out.println(student.getName()+"同学不及格");
        }
    }
}
