package Examples.Lab4;

import Examples.ExampleBase;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab4Example5 extends ExampleBase
{
    public Lab4Example5(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Podaj 8 liczb i posortujemy Twoją sekwencję.");

        var sequence = getSequence(8);
        System.out.println("\nWprowadzona sekwencja wygląda następująco:");
        showSequence(sequence);

        Arrays.sort(sequence);

        System.out.println("\nPosortowana sekwencja wygląda następująco:");
        showSequence(sequence);
    }

    @Override
    public int getExampleNumber()
    {
        return 5;
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
