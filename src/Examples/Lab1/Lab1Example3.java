package Examples.Lab1;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab1Example3 extends ExampleBase
{
    public Lab1Example3(Scanner scanner)
    {
        super(scanner);
    }

    @Override
    public void begin()
    {
        var number = getIntPrompt("Podaj liczbe, sprawdzimy czy jest parzysta");

        if (isEven(number))
            System.out.println("Twoja liczba jest parzysta!");
        else
            System.out.println("Twoja liczba nie jest parzysta!");
    }

    public Boolean isEven(int number)
    {
        return number % 2 == 0;

        /* Taki żarcik :)
        while (number >= 0) {
            if (number == 0)
                return true;

            number -= 2;
        }

        return false;
        */
    }

    @Override
    public int getExampleNumber()
    {
        return 3;
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
