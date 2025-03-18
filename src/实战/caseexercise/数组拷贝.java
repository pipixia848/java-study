package 实战.caseexercise;

public class 数组拷贝 {
    public static void main(String[] args) {

        int[] a={1,2,3,4,5};
        for (int i = 0; i < arraycopy(a).length; i++) {
            System.out.println(arraycopy(a)[i]);

        }
        //遍历新数组


    }
    public static int[] arraycopy(int[] ages){
        int[] newages=new int[ages.length];

        for (int i = 0; i < ages.length; i++) {
            newages[i]=ages[i];
        }
        return newages;
    }

}
