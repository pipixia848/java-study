package d4_集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 迭代器遍历集合 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

//        Iterator<String> it =  c.iterator();
//
//        while(it.hasNext()){
//
//            String adf = it.next();
//            System.out.println(adf);
//        }
        for(String s : c){
            System.out.println(s);
        }
        //用增强for循环遍历数组
        int[] arr = {1,2,3,5,4,2,9};

        for(int age : arr){
            System.out.println(age);
        }

        

    }
}
