package d11_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三丰","张无忌","周智弱","赵敏","张强");

        //找出所有姓张的，名字是三个字的
        //普通方法
        List<String> list = new ArrayList<>();

        for (String name : names) {
            if(name.startsWith("张") && name.length()==3){
                list.add(name);
            }
        }
        System.out.println(list);

        //运用Stream 可用链式编程
        List<String> list2 = names.stream().filter(s -> s.startsWith("张"))
                .filter(s ->s.length() == 3).collect(Collectors.toList());
        System.out.println(list2);

    }
}
