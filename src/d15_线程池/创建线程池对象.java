package d15_线程池;

import java.util.concurrent.*;

public class 创建线程池对象 {
    public static void main(String[] args) {

//                int corePoolSize,
//                int maximumPoolSize,
//                long keepAliveTime,
//                TimeUnit unit,
//                BlockingQueue<Runnable> workQueue,
//                ThreadFactory threadFactory,
//                RejectedExecutionHandler handler


        ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Runnable target  = new MyRunnable();

        //把任务交给线程池
        pool.execute(target); //线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); //线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); //线程池会自动创建一个新线程，自动处理这个任务，自动执行
        pool.execute(target); //复用前面的核心线程
        pool.execute(target); //复用。。。
        pool.execute(target); //复用。。。
        pool.execute(target); //复用。。。

        //到了临时线程创建的时机了
        pool.execute(target); //复用。。。


        //关闭线程池 shutdown() and shutdownNow() 立即关闭线程池
        pool.shutdown();


        //使用线程池处理Callable任务
        // pool.submit() 启动任务
        //用future<> name 来获取线程处理后的结果

        
    }
}
