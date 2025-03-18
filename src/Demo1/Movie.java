package Demo1;

public class Movie {

    //电影的编号，名称，价格等信息
    private int id;
    private String name;
    private double price;
    private String director;//导演
    private String actor;//演员
    private String info;//有多少人想看

    //将名称写入
    public Movie(int id, String name, double price, String director, String actor, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.director = director;
        this.actor = actor;
        this.info = info;
    }

    //定义一个空


    public Movie() {
    }

    //写get与set方法
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDirector() {
        return director;
    }

    public String getActor() {
        return actor;
    }

    public String getInfo() {
        return info;
    }
}
