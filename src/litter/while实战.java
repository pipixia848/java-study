package litter;

public class while实战 {
    public static void main(String[] args) {
        //山高8848860 纸高0,1 折叠几次才有山高?
        //

        double a=0.1;
        int b=0;
        while(a<8848860){
            a*=2;
            b++;

        }
        System.out.println("需要折叠"+(b)+"次");
    }
}
