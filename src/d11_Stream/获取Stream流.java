package d11_Stream;

import java.util.*;
import java.util.stream.Stream;

public class 获取Stream流 {
    public static void main(String[] args) {

        //List获取
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"张三丰","张无忌","周智弱","赵敏","张强");
        Stream<String> stream1 =  names.stream();

        //Set获取
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"张三丰","张无忌","周智弱","赵敏","张强");
        Stream<String> stream2 = set.stream();


        //Map获取
        Map<String,Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",1);
        map.put("3",1);
        map.put("4",1);

        //分开处理
        Set<String> keys = map.keySet();
        keys.stream();

        Collection<Integer> values = map.values();
        values.stream();

        //统一处理 Set<Map.Entry<String,Integer>> ky = map.entrySet();
        /*
        Set<Map.Entry<String,Integer>> ke = map.entrySet();
        Stream<Map.Entry<String,Integer>> ky = ke.stream();

        Set<Map.Entry<String,Integer>> te = map.entrySet();
        Stream<Map.Entry<String,Integer>> ky = te.stream();
         */
        Set<Map.Entry<String,Integer>> sk = map.entrySet();
        Stream<Map.Entry<String,Integer>> kvs = sk.stream();


        //数组获取
        String[] name = {"1","3"};
        Stream<String> s1 = Arrays.stream(name);

        Stream<String> s2 = Stream.of(name);

        /*
        数组
        int[] i = {};
        Stream<String> s1 = Arrays.stream(i);
        Stream<Stream> s2 = Stream.of(i);
         */























    }
}
