package d10_map集合;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class 投票人数实战 {
    public static void main(String[] args) {
        Map<String,Integer> result = new HashMap<>();

        ArrayList<String> people = new ArrayList<>();
        String[] date = {"A","B","C","D"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int a = r.nextInt(0,4);
            people.add(date[a]);
        }

        //统计每个景点的投票人数
        for (String s : people) {
            //存在
            if(result.containsKey(s)){
                result.put(s,result.get(s)+1);
            }
            //不存在
            else{
                result.put(s,1);
            }
        }
        System.out.println(result);
    }
}
