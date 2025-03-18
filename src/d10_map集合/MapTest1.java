package d10_map集合;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        //定义一个Map集合

        //无序，不重复，无索引
        Map<String,Integer> map = new HashMap<>();

        //有序，不重复，无索引 LinkedHashMap

        //可排序，不重复，无索引  TreeMap

        map.put("手机",10);
        map.put("手机",10);
        map.put("shoubiao",10);
        map.put("diannao",10);

        System.out.println(map);

    }
}
