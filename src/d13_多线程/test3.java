package d13_多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test3 {
    public static void main(String[] args) throws Exception {
        //1.创建一个Callable对象
        Callable<String> call = new MyCallable(100);

        //2.把Callable对象封装成要给FutureTask对象
        FutureTask<String> f1 = new FutureTask<>(call);

        //3.把任务对象交给一个Thread对象
        new Thread(f1).start();

        //4.获取线程执行完毕后返回的结果
        //若上面的线程没有执行完，代码会暂停，等待上面线程执行完
        String a = f1.get();
        System.out.println(a);

    }
}
