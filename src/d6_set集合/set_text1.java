package d6_set集合;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_text1 {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>(); //创建一个HashSet的集合对象，无序，不重复，无索引
        //Set<Integer> s = new LinkedHashSet<>(); //有序（添加和获取元素顺序一致） 不重复，无索引
        //Set<Integer> s = new TreeSet<>(); //排序 不重复，无索引

        s.add(12);
        s.add(14);
        s.add(15);
        s.add(11);
        s.add(12);
        s.add(8888);

        System.out.println(s);

    }
}
