package d13_多线程;

//1.让子类继承Thread类
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    //2.必须重写Thread类的run方法
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        //描述线程的执行任务
        for (int i = 0; i < 4; i++) {
            System.out.println(t.getName() + "输出" + i);
        }
    }
}
