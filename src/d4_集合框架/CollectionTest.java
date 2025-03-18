package d4_集合框架;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();

        //1.往集合中添加元素
        c.add("java1");
        c.add("java2");
        c.add("java3");
        c.add("java4");
        System.out.println(c);
        //2.删除元素
        c.remove("java1");
        System.out.println(c);
        //3.清空集合
        //c.clear();
        //System.out.println(c);

        //4.将一个集合中的元素倒给另一个集合
        Collection<String> c1 = new ArrayList<>();
        c1.add("java5");
        c1.add("java6");
        c.addAll(c1);
        System.out.println(c);

        //5.查找元素，返回值为boolean
        System.out.println(c.contains("java1"));

        //6.获取集合的大小
        System.out.println(c.size());

        //7.将集合转成数组
        Object o1 = c.toArray();
        //还可以转成特点类型的数组 需要填大小
        String[] s1 = c.toArray(new String[c.size()]);

        //8.判断集合是否为空
        System.out.println(c.isEmpty());


    }
}
