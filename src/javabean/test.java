package javabean;

public class test {
    public static void main(String[] args) {

        Student s1=new Student();

        s1.setName("张三");
        s1.setScore(99);

        StudentOperator so=new StudentOperator(s1);
        so.printPass(s1);
    }
}
