package d10_属性文件;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class test2 {
    public static void main(String[] args) throws Exception {

        //1.创建一个Properties对象
        Properties properties = new Properties();

        //2.用这个对象存储一些数据
        properties.setProperty("就这","123");
        properties.setProperty("张无忌","123123");
        properties.setProperty("啊啊啊","1343");

        //3.将Properties对象中的键值对存储到属性文件中
        properties.store(new FileWriter("helloworld_app\\untitled8\\src\\d10_属性文件\\user2.properties")
                ,"append many users!!");


        /**
         * 遍历属性文件中全部的键，使用stringpropertyname 获取
         * 遍历判断
         * 
         */
    }
}
