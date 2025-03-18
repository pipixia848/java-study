package d1_file;

import java.io.File;
import java.io.IOException;

public class 创建与删除文件 {
    public static void main(String[] args) throws IOException {

        //1.创建一个新文件 成功返回true
        File f1 = new File("C:\\Users\\宁夏夏\\Desktop\\p151\\ab.txt");
        f1.createNewFile();

        //2.创建文件夹 只能创建一级文件夹
        File f2 = new File("C:\\Users\\宁夏夏\\Desktop\\p151\\abc");
        System.out.println(f2.mkdir());

        //3.创建多级文件夹
        File f3 = new File("C:\\Users\\宁夏夏\\Desktop\\p151\\abc\\a");
        System.out.println(f3.mkdirs());

        //4.删除文件  不能删除非空文件
        System.out.println(f3.delete());
        System.out.println(f2.delete());
    }
}
