package Examples.Lab5.Example3;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab5Example3 extends ExampleBase
{
    public Lab5Example3(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Zapraszam do prezentacji najnowszego odkrytego gatunku.\n");

        var species = new Species("Człekokształtny", "Murlok", 56, 2,
                "Dziwnie wyglądająca jaszczurka, chodząca na dwóch nogach");

        species.writeAllData();

        var clone = species.Clone();

        System.out.println("\nA tutaj prezentuję jego klon:");
        clone.writeAllData();
    }

    @Override
    public int getExampleNumber()
    {
        return 3;
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
