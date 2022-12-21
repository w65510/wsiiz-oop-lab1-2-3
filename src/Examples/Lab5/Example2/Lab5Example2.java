package Examples.Lab5.Example2;

import Examples.ExampleBase;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Lab5Example2 extends ExampleBase
{
    public Lab5Example2(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Zbudujemy budynek i dowiemy się o nim co nieco.");
        var name = getStringPrompt("Podaj nazwę budynku");
        var floorsCount = getIntPrompt("Ile pięter ma Twój budynek", Optional.of(x -> x > 0));
        var date = getStringPrompt("Kiedy budynek został wybodywany (yyyy-MM-dd)", Optional.of(x -> Pattern.matches("\\d{4}-\\d{2}-\\d{2}", x)));
        var buildDate = LocalDate.parse(date);

        var building = new Building(name, floorsCount, buildDate);
        building.showAllInfo();
    }

    @Override
    public int getExampleNumber()
    {
        return 2;
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
