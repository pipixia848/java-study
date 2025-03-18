package d10_map集合;

import java.util.*;

public class 集合的嵌套 {
    public static void main(String[] args) {
        //定义一个map集合 用来存储省份及城市信息

        Map<String, List<String>> map = new HashMap<>();
        List<String> cite1 = new ArrayList<>();
        List<String> cite2 = new ArrayList<>();
        List<String> cite3 = new ArrayList<>();

        Collections.addAll(cite1,"1","2","3");
        map.put("第一",cite1);


        Collections.addAll(cite2,"1","2","3");
        map.put("第二",cite2);

        Collections.addAll(cite3,"1","2","3");
        map.put("第三",cite3);


        System.out.println(map.get("第二"));
        System.out.println(map);
    }
}
