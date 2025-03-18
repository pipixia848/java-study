package d1_网络通信;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1 {
    public static void main(String[] args) throws Exception {

        //1.获取本机IP地址对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2.获取指定IP或者域名的IP地址对象
        InetAddress ip2 = InetAddress.getByName("www.bilibili.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        //3.判断是否能联通 
        System.out.println(ip2.isReachable(3000));
    }
}
