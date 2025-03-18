package d11_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream流的终结方法 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores,12.3, 21.4, 99.8, 11.1, 16.9);

        // forEach 遍历

        //count() 返回元素的个数 forEach count max min(new Comparators)  collect(Collectors.toList());
        //collect(Collectors.toSet()); toMap toArray
        long size = scores.stream().count();
        System.out.println(size);

        //找最大最小值 max min 需要自己重写比较对象
        //流只能收集一次

        //返回到一个新集合中 List和Set集合调用方法相同，
        List<Double> a = scores.stream().filter(s -> s>16).collect(Collectors.toList());
        System.out.println(a);
        //存入Map集合
        //collect(Collectors.toMap(a -> a.getName(), b -> b.getHeight()));

        //存入数组
        // toArray(len -> new Student[len]);

    }
}
