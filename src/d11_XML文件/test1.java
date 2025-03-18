package d11_XML文件;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class test1 {
    public static void main(String[] args) throws Exception {
        //1.创建一个Dom4j框架提供的解析器对象
        SAXReader saxReader = new SAXReader();

        //2.使用saxReader对象把需要解析的XML文件读成一个Document对象
        Document document =
                saxReader.read("D:\\Project\\code\\newjava\\helloworld_app\\untitled8\\src\\d11_XML文件\\helloWorld.xml");

        //3.从文档对象中解析XML文件的全部数据
        Element root = document.getRootElement();
        System.out.println(root.getName());

        //4.获取根元素下的一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        //5.获取当前元素下的某个子元素
        Element user = root.element("user");
        //如果下面有很多子元素，默认获取第一个

        //6.获取元素的子元素信息
        System.out.println(user.attributeValue("id"));


        //7.获取全部的文本内容
        System.out.println(user.elementText("name"));
    }
}
