package d5_单元测试框架;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

//测试类
public class testTest { 
    @Test
    public void testPrintNumber(){
        test1.printNumber("admin");
        test1.printNumber(null);
    }

    @Test
    public void testGetManIndex(){
        int Index1 = test1.getMaxIndex(null);
        System.out.println(Index1);

        int Index2 = test1.getMaxIndex("admin");
        System.out.println(Index2);

        //断言机制：程序员可以通过预测业务方法的结果。
        Assert.assertEquals("有BUG",4,Index2);

    }
}
