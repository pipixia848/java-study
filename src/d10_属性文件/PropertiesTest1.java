package d10_属性文件;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个Properties的对象出来
        Properties properties = new Properties();

        //2.开始加载属性文件中的键值对数据到properties对象中去
        properties.load(new FileReader("helloworld_app\\untitled8\\src\\d10_属性文件\\user.properties"));
        System.out.println(properties);

        // 3.根据键取值
        System.out.println(properties.getProperty("就这"));
        System.out.println(properties.getProperty("admin"));

        System.out.println("-------------------");

        //4.遍历全部的键与值
        Set<String> strings = properties.stringPropertyNames();

        for (String string : strings) {
            System.out.println(properties.getProperty(string));
        }
    }
}
