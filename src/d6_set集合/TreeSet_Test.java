package d6_set集合;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Test {
    public static void main(String[] args) {


        //底层是基于红黑树进行排序
        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //通过调用Double中的compare方法进行比较
                //Double.compare(o1.getAge() - o2.getAge());
                return 0;
            }
        });

        students.add(new Student("1",15));
        students.add(new Student("2",19));
        students.add(new Student("3",16));

        System.out.println(students);
    }
}
