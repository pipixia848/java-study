package 实战.caseexercise;

public class 打印九九乘法表 {
    public static void main(String[] args) {
        //运用循环嵌套
        for (int i = 1; i <=9 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "X" + i + "=" + i * j + "\t");
            }
            System.out.println();

        }
    }
}
