package Examples.Lab6.Example1;

public class Circle extends Figura
{
    double radius;

    public Circle()
    {
        super(new Point(0, 0));
        setRadius(0);
    }

    public Circle(Point center, double radius)
    {
        super(center);
        setRadius(radius);
    }

    public double getArea()
    {
        return Math.PI * Math.pow(radius,2 );
    }

    public double getDiameter()
    {
        return radius * 2;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public boolean isInside(Point point)
    {
        var a = Math.pow(point.getX() - punkt.getY(), 2);
        var b = Math.pow(point.getY() - punkt.getY(), 2);
        var r2 = Math.pow(radius, 2);

        return a + b <= r2;
    }

    String opis()
    {
        return "Klasa Okrąg. Kolor figury: " + kolor;
    }
}
