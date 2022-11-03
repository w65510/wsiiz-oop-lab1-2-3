package Examples.Lab1;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab1Example4 extends ExampleBase
{
    public Lab1Example4(Scanner scanner)
    {
        super(scanner);
    }

    @Override
    public void begin()
    {
        var number = getIntPrompt("Podaj liczbe, zobaczymy czy dzieli sie przez 3 i 5");

        if (isDivisibleBy5And3(number))
            System.out.println("Twoja liczba dzieli sie przez nie!");
        else
            System.out.println("Twoja liczba nie dzieli sie przez nie!");
    }

    private static Boolean isDivisibleBy5And3(int number){
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public int getExampleNumber()
    {
        return 4;
    }

    @Override
    public int getLabNumber()
    {
        return 1;
    }

    @Override
    public Boolean isEnabled()
    {
        return true;
    }
}
