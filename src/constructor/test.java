package constructor;

public class test {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println("_________________________");


        Student s2=new Student("jiuzhe",100);

        System.out.println(s2.name);
        System.out.println(s2.Score);
    }
}
