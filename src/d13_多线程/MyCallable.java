package d13_多线程;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }


    @Override
    public String call() throws Exception {
        //求1-n的和
        int sun = 0;
        for (int i = 1; i <= n; i++) {
            sun += i;
        }

        return "求和结果为" + sun;
    }
}
