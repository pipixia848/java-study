package d2_UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//服务端
public class Server {
    public static void main(String[] args) throws Exception {
        //1.创建一个服务端对象
        DatagramSocket socket = new DatagramSocket(6666);

        //2.创建一个数据包对象，用来接受数据
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

        //3.开始正式使用数据包来接受客户端发来的数据
        while (true) {
            socket.receive(packet);

            //4.在字节数组中，把接受到的数据直接打印出来

            //接受多少就倒多少

            //拿到客户端的IP地址

            System.out.println(packet.getAddress().getHostAddress());
            //拿到客户端的端口
            System.out.println(packet.getPort());

            int len = packet.getLength();
            String s = new String(bytes,0,len);
            System.out.println(s);

            System.out.println("---------------");

            //socket.close();
        }

    }
}
