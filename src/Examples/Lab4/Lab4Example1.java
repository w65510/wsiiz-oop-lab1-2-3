package Examples.Lab4;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab4Example1 extends ExampleBase
{
    public Lab4Example1(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Policzymy sumę i średnią wartości w sekwencji za pomocą dwóch różnych pętli");
        var sequence = generateSequence();

        countWithFor(sequence);
        countWithForeach(sequence);
    }

    private void countWithFor(int[] sequence) {
        int sum = 0;

        for (var i = 0; i < sequence.length; i++) {
            sum += sequence[i];
        }

        var avg = (double)sum / sequence.length;

        System.out.println("Suma i średnia wyliczona za pomocą pętli for to odpowiednio: " + sum + " i " + avg);
    }

    private void countWithForeach(int[] sequence) {
        int sum = 0;

        for (var value : sequence) {
            sum += value;
        }

        var avg = (double)sum / sequence.length;

        System.out.println("Suma i średnia wyliczona za pomocą pętli foreach to odpowiednio: " + sum + " i " + avg);
    }

    @Override
    public int getExampleNumber()
    {
        return 1;
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
