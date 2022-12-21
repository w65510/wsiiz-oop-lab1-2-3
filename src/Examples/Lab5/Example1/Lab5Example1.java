package Examples.Lab5.Example1;

import Examples.ExampleBase;

import java.util.Optional;
import java.util.Scanner;

public class Lab5Example1 extends ExampleBase
{
    public Lab5Example1(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Zadanie prezentuje zasade dzialania klasy prostokat.");

        var width = getDoublePrompt("Podaj a", Optional.of(x -> x > 0));
        var height = getDoublePrompt("Podaj b", Optional.of(x -> x > 0));

        var rectangle = new Rectangle(width, height);

        System.out.println("Szerokość prostokąta: " + rectangle.getWidth());
        System.out.println("Wysokość prostokąta: " + rectangle.getHeight());
        System.out.println("Przekątna prostokąta: " + rectangle.getDiagonal());
        System.out.println("Obwód prostokąta: " + rectangle.getGirth());
        System.out.println("Pole prostokąta: " + rectangle.getArea());
    }

    @Override
    public int getExampleNumber()
    {
        return 1;
    }

    @Override
    public int getLabNumber()
    {
        return 5;
    }

    @Override
    public Boolean isEnabled()
    {
        return false;
    }
}
