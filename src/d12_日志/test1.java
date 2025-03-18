package d12_日志;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test1 {
    //创建一个Logger日志对象
    public static final Logger LOGGER = LoggerFactory.getLogger("LogBackTest");


    public static void main(String[] args) {
        try {

            LOGGER.info("方法开始执行~~~");
            chu(10,0);
            LOGGER.info("方法执行结束~~~");

        } catch (Exception e) {
            LOGGER.error("方法出现bug");
        }

    }

    public static void chu(int a,int b){
        LOGGER.debug("参数a" + a);
        LOGGER.debug("参数b" + b);
        int c = a/b;
        LOGGER.debug("结果是"+ c);

    }
}
