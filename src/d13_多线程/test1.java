package d13_多线程;


import java.nio.charset.StandardCharsets;

//线程的创建方式1：继承Thread类
public class test1 {
    public static void main(String[] args) {
        //3.创建MyThread线程类的对象代表一个线程
        Thread t = new MyThread("一号线程");

        //t.setName("一号线程");

        //4.启动线程
        t.start(); //拥有两个线程，main t


        Thread t1 = new MyThread("二号线程");
        //t1.setName("二号线程");
        t1.start();

        //1.获取名字
        System.out.println(t.getName());

        //2.获取当前执行线程的线程对象
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

        //3.暂停当前进程
        //sleep()

        //4.join 方法，让当前调用的线程先执行完
    }
}
