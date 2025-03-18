package Demo1;

public class MoviePrint {

    private Movie m;

    //1，创建一个电影数组，用来存储所有的电影
    private Movie[] movies;

    public MoviePrint(Movie[] movies){
        this.movies=movies;
    }

    //2，展示全部的电影信息
    public void PrintMovie(Movie[] m){
        System.out.println("所有的电影信息如下");
        for (int i = 0; i < m.length; i++) {
            //定义一个电影类型的变量
            Movie b=m[i];
            System.out.println("编号是"+b.getId());
            System.out.println("名称是"+b.getName());
            System.out.println("价格是"+b.getPrice());
            System.out.println("----------------------------");
        }

    }




    //开始查找
    public void MovieFind(int a){

        for (int i = 0; i < movies.length; i++) {
            if(movies[i].getId()==a){
                System.out.println("有"+movies[i].getInfo()+"人想看");
                break;
            }
            else{
                System.out.println("输入的编号有误");
            }
        }



//        System.out.println("编号是"+m.getId());
//        System.out.println("名称是"+m.getName());
//        System.out.println("价格是"+m.getPrice());
//        System.out.println("导演是"+m.getDirector());
//        System.out.println("演员是"+m.getActor());
//        System.out.println("有"+m.getInfo()+"想看");

    }

}
