package d3_异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException{


        //1,try catch 将异常围起来
        //2.将异常抛出
//        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2023-12-5 12:12:12");
            System.out.println(d);
 //       } catch (ParseException e) {
 //           throw new RuntimeException(e);
 //       }

    }
}
