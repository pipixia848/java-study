package d3_TCP1;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//客户端
public class Client {
    public static void main(String[] args) throws Exception {
        //1.创建Socket对象，同时请求与服务端程序的连接
        Socket socket = new Socket("172.20.244.10",6666);

        //2.从Socket通信管道中得到一个字节输出流，用来发数据给服务端
        OutputStream os = socket.getOutputStream();

        //3.将低级流包装成高级流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            //4.开始写数据出去
            dos.writeUTF(s);
        }

        //5.关闭
//        dos.close();
//        socket.close();
    }
}
