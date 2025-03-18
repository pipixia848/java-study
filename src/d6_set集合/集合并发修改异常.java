package d6_set集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 集合并发修改异常 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();

        name.add("王麻子");
        name.add("小李");
        name.add("李玉刚");
        name.add("张全蛋");
        name.add("李小龙");

        //使用迭代器遍历并删除元素

//        while(it.hasNext()){
//            String temp = it.next();
//            if(temp.contains("李")){
//                //调用迭代器自己的remove方法
//                //删除迭代器当前遍历到的数据，每删除一个数据后，在底层--
//                it.remove();
//            }
//        }
        //调用迭代器自己的remove方法
        //删除迭代器当前遍历到的数据，每删除一个数据后，在底层--
        name.removeIf(temp -> temp.contains("李"));
        //使用增强for循环和lambda表达式遍历会出现并发修改异常，且无法解决

        System.out.println(name);
    }
}
