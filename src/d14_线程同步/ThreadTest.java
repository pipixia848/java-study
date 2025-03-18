package d14_线程同步;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account(1000.0);

        new DrawThread(acc,"小明").start();
        new DrawThread(acc,"小红").start();


        //1.同步代码块
        // 在所要执行的线程上加上synchronized
        //2.同步方法
        //3.lock锁
    }
}
