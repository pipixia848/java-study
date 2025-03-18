package d14_线程同步;

public class DrawThread extends Thread{
    private Account acc;

    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        //取钱
        acc.drawMoney(1000);
    }
}
