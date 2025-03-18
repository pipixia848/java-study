package 实战.caseexercise;




/*
  *
 ***
*****

 */
public class 打印三角形 {
    public static void main(String[] args) {
        int n=7;
        for (int i = 1; i <=n ; i++) {
            //首先控制打印多少个空格
            //后控制打印多少个星星
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=1+(i-1)*2 ; j++) {
                System.out.print("*");
            }
            System.out.println();
            
            
        }
    }
}
