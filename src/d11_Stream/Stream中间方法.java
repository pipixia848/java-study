package d11_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stream中间方法 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores,12.3, 21.4, 99.8, 11.1, 16.9);
        //1.找出分数大于60 且升序
        scores.stream().filter(s -> s<=60).sorted().forEach(s -> System.out.println(s));
        //filter() 查找 sorted（）排序，要自定义排序方法，new Comparator


        List<Student> students = new ArrayList<>();
        Student s1 = new Student("1",28);
        Student s6 = new Student("1",28);
        Student s2 = new Student("2",34);
        Student s3 = new Student("3",18);
        Student s4 = new Student("4",21);
        Student s5 = new Student("5",25);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);

        //2.找出年龄大于等于23，且小于30，降序
//        students.stream().filter(s -> s.getAge()>=23 && s.getAge()<=30).sorted(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.getAge()- o1.getAge();
//            }
//        });
        students.stream().filter(s -> s.getAge()>=18 && s.getAge()<=30)
                .sorted((o1 , o2) -> o2.getAge()- o1.getAge()).forEach(s -> System.out.println(s));

        System.out.println("-------------------------");

        //3.找出年龄最大的三个学生 limit() 找出最大值    limit() limit()
        students.stream().sorted((o1,o2) -> o2.getAge() - o1.getAge())
                .limit(3).forEach(s -> System.out.println(s));
        System.out.println("-------------------------");

        //skip() 跳过几个数据    skip() 跳过 limit skip distinct  distinct limit skip  distinct ii filter() 查找   / sorted 排序 / limit 找出最大值 / skip 跳过数据 /distinct//
        //filter limit skip distinct distinct 

        //找年龄超过25，去重复 distinct()去重，自定义对象，（希望内容一样，要重写equals hashcode方法）  map 映射
        students.stream().filter(s -> s.getAge()>25).map(s -> s.getName())
                .distinct().forEach(s -> System.out.println(s));

        //合并两个流
        //concat() 返回一个新的流

    }
}
