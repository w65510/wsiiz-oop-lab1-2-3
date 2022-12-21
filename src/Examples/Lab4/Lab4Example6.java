package Examples.Lab4;

import Examples.ExampleBase;

import java.util.Optional;
import java.util.Scanner;

public class Lab4Example6 extends ExampleBase
{
    public Lab4Example6(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Podaj 5 liczb i policzymy silnię każdej z nich. Max 12.");

        var sequence = getSequence(5, Optional.of(x -> x <= 12));
        System.out.println();

        for (var value : sequence)
            showFactorial(value);
    }

    private void showFactorial(int value) {
        if (value < 0)
        {
            System.out.println("Nie liczymy silni z liczb ujemnych");
            return;
        }

        var factorial = 1;
        for (var i = 0; i < value; i++)
            factorial *= i+1;

        System.out.println("Silnia z liczby " + value + " to " + factorial);
    }

    @Override
    public int getExampleNumber()
    {
        return 6;
    }

    @Override
    public int getLabNumber()
    {
        return 4;
    }

    @Override
    public Boolean isEnabled()
    {
        return false;
    }
}
