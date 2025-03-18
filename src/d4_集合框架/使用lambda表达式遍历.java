package d4_集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class 使用lambda表达式遍历 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        System.out.println(c);

        //使用forEach进行遍历
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //使用forEach结合Lambda表达式简化
        //c.forEach( s-> System.out.println(s));
        c.forEach(System.out::println);

        //list add 添加  get(index) 返回集合中指定索引的元素
        // set() 替换元素 索引+要替换的元素



    }
}
