package 实战.caseexercise;

public class 找素数 {
    public static void main(String[] args) {

        int[] pn=PrimeNumber(5,20);
        for (int i = 0; i < pn.length; i++) {
            System.out.println(pn[i]);
        }

        
    }
    public static int[] PrimeNumber(int a,int b){
        //首先定义一个数组，将a与b之间的数据全部录入到数组之中去
        //2 用for循环，来遍历数组中的每一个元素，
        int[] ages=new int[b-a+1];
        
        //录入完成
        for (int i=0; i<=b-a ;i++) {
            ages[i]=a+i;
            
        }
        
        //遍历数组，找素数
        //定义一个新数组，用来装素数
        int[] newages=new int[6];
        int c=2;
        int d=0;
        for (int i = 0; i < ages.length; i++) {
            while(c<=ages[i]){
                //不为素数
                if((ages[i]%c)==0){
                    newages[d]=ages[i];
                    d++;
                    c++;
                    continue;

                }
                //为素数
                else{

                    c++;

                    continue;
                }

            }
            
        }
        return newages;
        
    }
}
