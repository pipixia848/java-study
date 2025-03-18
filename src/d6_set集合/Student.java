package d6_set集合;

//实现Comparable接口，后重写compareTo方法
public class Student implements Comparable<Student>{
    private String name;
    private int age;


    //this 和 o 进行比较
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
