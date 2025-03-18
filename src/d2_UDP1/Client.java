package d2_UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

//客户端
public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建客户端对象
        DatagramSocket socket = new DatagramSocket();

        /*2.创建数据包对象封装要发出去的数据
        (byte buf[], int length,
           InetAddress address, int port)
        1.封装要发出去的数据
        2.发送出去的数据大小
        3.服务端的IP地址
        4.服务端程序的端口号

         */

        //实现多发多收
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            byte[] bytes = s.getBytes();

            if("exit".equals(s)){
                System.out.println("已退出~~");
                socket.close();
                break;
            }

            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,
                    InetAddress.getLocalHost(),6666);

            //3.正式将这个数据包的数据发送出去
            socket.send(packet);
        }

//        System.out.println("Over~~");
//
//        socket.close(); //释放资源
    }
}
