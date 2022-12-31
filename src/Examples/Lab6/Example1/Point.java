package Examples.Lab6.Example1;

public class Point
{
    protected double x;
    private double y;

    public Point() {
        setX(0);
        setY(0);
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public void reset() {
        setX(0);
        setY(0);
    }

    public void description() {
        System.out.println("Punkt o współrzędnych X: " + getX() + ", Y: " + getY());
    }

    public void move(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}
