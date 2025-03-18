package d14_线程同步;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private Double money;
    //创建lock锁
    private final Lock lk = new ReentrantLock();

    public Account(Double money) {
        this.money = money;
    }


    public void drawMoney(double money){
        //搞清楚谁来取钱
        String name = Thread.currentThread().getName();

        //判断钱是否足够
        // this正好代表共享资源

        //加锁
        lk.lock();

        if(this.money >= money){
             System.out.println(name + "来取钱，取走了" + money);
             this.money -= money;
             System.out.println(name + "账户还剩" + this.money);
        }
        else{
            System.out.println(name + "来取钱，余额不足");
        }

        //解锁
        lk.unlock();

    }

    public Account() {
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
