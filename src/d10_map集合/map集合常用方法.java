package d10_map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map集合常用方法 {
    public static void main(String[] args) {

        //创建集合
        Map<String,Integer> map = new HashMap<>();

        map.put("手机",10);
        map.put("手机",10);
        map.put("shoubiao",10);
        map.put("diannao",10);
        map.put("java",2);
        map.put(null,1);

        //1.获取集合的大小
        System.out.println(map.size()); //4

        //2.清空集合
//        map.clear();
//        System.out.println(map);

        //3.判断集合是否为空
        System.out.println(map.isEmpty());

        //4.根据键获取对应的值
        System.out.println(map.get("java"));

        //5.根据键删除某个元素
        map.remove("shoubiao");
        System.out.println(map);

        //6.判断是否包含某个键
        System.out.println(map.containsKey("java"));

        //7.判断是否包含某个值
        System.out.println(map.containsValue(10));

        //8.获取全部键的集合
        Set<String> maps =  map.keySet();

        //9.获取Map集合的全部值
        Collection<Integer> i1 = map.values();

        //10.将其他的map集合的数据倒入到自己的集合中
        // map.putAll()
    }
}
