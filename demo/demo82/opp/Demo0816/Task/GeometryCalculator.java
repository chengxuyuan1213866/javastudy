package opp.Demo0816.Task;

public class GeometryCalculator {
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double r;
    private final static double PI = 3.14;
    double width;
    double height;
    public double calculateCircleArea(double radius)
    {
        return PI*radius*radius;
    };
    public double calculateRectangleArea(double width, double height)
    {
        return width*height;
    };
    public GeometryCalculator(double radius)
    {
        this.r = radius;
    }
    public GeometryCalculator(double width,double height)
    {
        this.width = width;
        this.height = height;
    }

}
