package Examples.Lab4;

import Examples.ExampleBase;

import java.util.Optional;
import java.util.Scanner;

public class Lab4Example2 extends ExampleBase
{
    public Lab4Example2(Scanner scanner)
    {
        super(scanner);
    }

    @Override
    public void begin()
    {
        System.out.println("Wypiszemy co drugą liczbę wygenerowanych tablic");
        var len = getIntPrompt("Pierwsza tablica musi posiadać parzystą liczbę elementów (2-20)", Optional.of(x -> x >= 2 && x <= 20 && x % 2 == 0));
        var seq = generateSequence(len);
        showEverySecondValue(seq);

        len = getIntPrompt("Druga tablica musi posiadać nieparzystą liczbę elementów (1-21)", Optional.of(x -> x >= 2 && x <= 20 && x % 2 == 1));
        seq = generateSequence(len);
        showEverySecondValue(seq);
    }

    private void showEverySecondValue(int[] sequence) {
        System.out.println("Co druga wartość wygenerowanej tablicy to:");

        for (var i = 0; i < sequence.length; i += 2)
            System.out.print(sequence[i] + " ");

        System.out.println();
    }

    @Override
    public int getExampleNumber()
    {
        return 2;
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
