package Examples.Lab4;

import Examples.ExampleBase;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab4Example3 extends ExampleBase
{
    public Lab4Example3(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Wypiszemy predefiniowane wartości tekstowe z tablicy zapisane wielkimi literami");
        List<String> list = Arrays.asList("jeden", "dwa", "trzy");

        System.out.println("Pierwotny wygląda tablicy:");
        showArray(list);

        list = list.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Elementy z wielkich liter w tablicy:");
        showArray(list);
    }

    private void showArray(Collection<String> array) {
        for (var value: array)
            System.out.println(value);

        System.out.println();
    }

    @Override
    public int getExampleNumber()
    {
        return 3;
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
