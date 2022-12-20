package Examples.Lab1;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab1Example2 extends ExampleBase
{
    public Lab1Example2(Scanner scanner)
    {
        super(scanner);
    }

    @Override
    public void begin()
    {
        System.out.println("Nauczymy sie teraz dodawac, odejmowac i mnozyc!");

        var a = getIntPrompt("Podaj pierwsza liczbe");
        var b = getIntPrompt("Podaj druga liczbe");

        doCalculations(a, b);
    }

    private static void doCalculations(int a, int b)
    {
        System.out.println("Twoje liczby to: " + a + " i " + b);
        System.out.println("Ich suma: " + (a+b));
        System.out.println("Ich roznica: " + (a-b));
        System.out.println("Ich iloczyn: " + (a*b));
    }

    @Override
    public int getExampleNumber()
    {
        return 2;
    }

    @Override
    public int getLabNumber()
    {
        return 1;
    }

    @Override
    public Boolean isEnabled()
    {
        return false;
    }
}
