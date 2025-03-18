package d13_多线程;

//1.定义一个任务类，实现Runnable接口
public class PrimeRun implements Runnable{
    //2.重写Run方法
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("子线程执行：" + i);
        }
    }
}
