package d10_map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map遍历方法 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        map.put("手机",10);
        map.put("shoubiao",10);
        map.put("diannao",10);
        map.put("java",2);
        map.put(null,1);

        //第一种方法，键找值
        Set<String> maps =  map.keySet();
        for (String s : maps) {
            System.out.print(s+"->");
            System.out.println(map.get(s));
        }

        System.out.println("--------------------");

        //第二种方法，键值对
        //1.调用Map集合提供的entrySet方法，把map集合转换成键值对类型的set集合

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String name = entry.getKey();
            Integer a = entry.getValue();

            System.out.println(name + "->" + a);
        }
        System.out.println("--------------------");


        //第三种方法，lambda表达式
        map.forEach((k,v)->{
            System.out.println(k + "->" + v);
        });


    }
}
