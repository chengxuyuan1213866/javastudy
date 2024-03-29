package opp.Demo0821;

/**
 * 电影类
 */
public class Movie {

    private String name;

    private Double price;

    private String director;

    private int date;

    private int ticketCount;

    public Movie() {
    }

    public Movie(String name, Double price, String director, int date) {
        this(name, price, director, date, 0);
    }

    public Movie(String name, Double price, String director, int date, int ticketCount) {
        this.name = name;
        this.price = price;
        this.director = director;
        this.date = date;
        this.ticketCount = ticketCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(int ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String info() {
        return name  +
                " \t " + director +
                " \t " + date +
                "\t" + price +
                "\t" + ticketCount;
    }

    @Override
    public String toString() {
        return "电影名：'" + name + '\'' +
                ", 导演：'" + director + '\'' +
                ", 上映时间：" + date +
                ", 价格：" + price +
                ", 数量： " + ticketCount;
    }
}
