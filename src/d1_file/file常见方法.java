package d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class file常见方法 {
    public static void main(String[] args) {

        File f1 = new File("C:\\Users\\宁夏夏\\Desktop\\p151\\aaa.txt");

        //1.判断文件是否存在 exists();
        System.out.println(f1.exists());

        //2.判断对象是否是文件
        System.out.println(f1.isFile());

        //3.判断对象是否是文件夹 isDirectory()
        System.out.println(f1.isDirectory());

        //4.获取文件的名称 包含后缀
        System.out.println(f1.getName());

        //5.获取文件的大小
        System.out.println(f1.length());

        //6.获取文件最后的修改时间
        long time = f1.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
        System.out.println(sdf.format(time));

        //7.获取创建文件对象是，使用的路径
        System.out.println(f1.getPath());

        //8.获取绝对路径
        f1.getAbsolutePath();
    }
}
