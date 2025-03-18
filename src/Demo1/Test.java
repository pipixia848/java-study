package Demo1;

import jiuzhe.aa;

public class Test {
    public static void main(String[] args) {

        aa b=new aa();
        b.print();

        //开始数据的录入
        Movie[] movies=new Movie[4];

        Movie m1=new Movie(1,"jiuzhe",39,"我","aaa","19万");
        Movie m2=new Movie(2,"b",38,"我","aaa","19,1万");
        Movie m3=new Movie(3,"c",37,"我","aaa","19.2万");
        Movie m4=new Movie(4,"d",35,"我","aaa","19.3万");

        //将数据存入数组
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        movies[3]=m4;

        MoviePrint operator=new MoviePrint(movies);

        operator.PrintMovie(movies);
        operator.MovieFind(1);
    }
}
