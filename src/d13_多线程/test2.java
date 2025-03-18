package d13_多线程;

//通过Runnable接口实现
public class test2 {
    public static void main(String[] args) {

        //3.创建任务对象
        Runnable p = new PrimeRun();
        //4.把任务对象交给一个线程对象处理
        new Thread(p).start();

        for (int i = 0; i < 4; i++) {
            System.out.println("主线程main执行：" + i);
        }
    }
}
