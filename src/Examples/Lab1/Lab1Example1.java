package Examples.Lab1;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab1Example1 extends ExampleBase
{
    public Lab1Example1(Scanner scanner)
    {
        super(scanner);
    }

    @Override
    public void begin()
    {
        System.out.println("Przedstaw sie! W tym celu");

        var name = getStringPrompt("Podaj imie");
        var age = getIntPrompt("Podaj wiek");

        System.out.println("Masz na imie " + name + " i masz " + age + " lat");
    }

    @Override
    public int getExampleNumber()
    {
        return 1;
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
