package d8_Collections类;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        //1.往集合中批量添加数据
        Collections.addAll(name,"张三","就这","王五","李四");

        //2.打乱List集合中的元素
        Collections.shuffle(name);
        System.out.println(name);

        //3.对List集合中的元素进行升序
        Collections.sort(name);

        //4.对List集合中的元素，按照比较器对象指定的规则进行排序
        Collections.sort(name, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

    }
}
