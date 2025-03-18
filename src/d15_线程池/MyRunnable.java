package d15_线程池;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //
        System.out.println(Thread.currentThread().getName() +  "==> 输出666");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
