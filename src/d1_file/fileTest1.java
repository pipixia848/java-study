package d1_file;

import java.io.File;

public class fileTest1 {
    public static void main(String[] args) {

        //1.创建一个file对象，指代具体文件
        File f1 = new File("C:\\Users\\宁夏夏\\Desktop\\p151\\aaa.txt");

        System.out.println(f1.length()); //返回大小

        //还可以指向文件夹  返回的是文件夹本身的大小
        File f2 = new File("D:/miHoYo Launcher");
        System.out.println(f2.length());


        //File 对象可以指向一个不存在的路径
        File f3 = new File("C:\\Users\\宁夏夏\\Desktop\\p151\\bbb.txt");
        //判断文件是否存在
        System.out.println(f3.exists());
    }
}
