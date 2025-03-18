package d3_TCP1;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Server {
    public static void main(String[] args) throws Exception {
        //1.创建ServerSocket的对象，同时为服务端注册端口
        ServerSocket sst = new ServerSocket(6666);

        //2.使用ServerSocket对象，调用一个accept方法，等待客户端的连接请求
        Socket socket = sst.accept();

        //3.从socket通信管道中得到一个字节输入流
        InputStream is = socket.getInputStream();

        //4.包装成高级流
        DataInputStream dis = new DataInputStream(is);

        while (true) {
            System.out.println(dis.readUTF());

            //可以获取客户端的IP地址
            System.out.println(socket.getRemoteSocketAddress());

//            dis.close();
//            sst.close();
        }

    }
}
