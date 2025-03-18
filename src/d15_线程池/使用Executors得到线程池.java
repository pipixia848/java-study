package d15_线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 使用Executors得到线程池 {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);
    }
}
