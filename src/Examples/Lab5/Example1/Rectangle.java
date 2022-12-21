package Examples.Lab5.Example1;

public class Rectangle
{
    private double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getGirth() {
        return 2*width + 2*height;
    }

    public double getArea() {
        return width * height;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
