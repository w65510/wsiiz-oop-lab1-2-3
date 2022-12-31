package Examples.Lab6.Example1;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab6Example1 extends ExampleBase
{
    public Lab6Example1(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        showPoints();
        playWithGeometries();

        var rect = new Prostokat(2, 5, "Zielony");
        rect.move(3, 5);

        var square = new Square(4);
        System.out.println(square.opis());

        var circle = new Circle(new Point(1, 4), 7);
        System.out.println(circle.opis());
    }

    private void playWithGeometries()
    {
        var geom = new Figura("Niebieski");
        System.out.println(geom.opis());

        var rectangle = new Prostokat(4, 5);
        System.out.println("Wysokość prostokąta: " + rectangle.wys);
        System.out.println("Szerokość prostokąta: " + rectangle.szer);
        System.out.println("Powierzchnia prostokata: " + rectangle.getPowierzchnia());
        System.out.println(rectangle.opis());

        var triangle = new Trojkat(3, 4);
        System.out.println("Podstawa trójkąta: " + triangle.podst);
        System.out.println("Wysokość trójkąta: " + triangle.wys);
        System.out.println(triangle.opis());
    }

    private void showPoints()
    {
        var point1 = new Point(1, 2);
        var point2 = new Point(5, 3);
        var point3 = new Point(21.37, 420.69);

        System.out.println("Punkt pierwszy: ");
        point1.description();

        System.out.println("Punkt drugi:");
        point2.description();
        System.out.println("Przesunięty punkt 2:");
        point2.move(5, 5);
        point2.description();

        System.out.println("Punkt trzeci:");
        point3.description();
        System.out.println("Wyzerowany punkt 3:");
        point3.reset();
        point3.description();
    }

    @Override
    public int getExampleNumber()
    {
        return 1;
    }

    @Override
    public int getLabNumber()
    {
        return 6;
    }

    @Override
    public Boolean isEnabled()
    {
        return false;
    }
}
