package Examples.Lab3;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab3Example2 extends ExampleBase {
    public Lab3Example2(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Zliczymy liczby ujemne i dodatnie oraz zsumujemy je. Bedziemy potrzebowac ich 10.");

        var numbers = new double[10];
        for (var i = 0; i < numbers.length; i++)
            numbers[i] = getDoublePrompt("Podaj liczbe nr " + (i+1));

        showStatistics(numbers);
    }

    private void showStatistics(double[] numbers) {
        var negativeAmount = 0;
        double negativeSum = 0;

        var nonNegativeAmount = 0;
        double nonNegativeSum = 0;

        for (var number: numbers) {
            if (number < 0) {
                negativeAmount++;
                negativeSum += number;
            }
            else {
                nonNegativeAmount++;
                nonNegativeSum += number;
            }
        }

        System.out.println("Podales " + negativeAmount + " liczb ujemnych, a ich suma to " + negativeSum);
        System.out.println("Podales " + nonNegativeAmount + " liczb nieujemnych, a ich suma to " + nonNegativeSum);
    }

    @Override
    public int getExampleNumber() {
        return 2;
    }

    @Override
    public int getLabNumber() {
        return 3;
    }

    @Override
    public Boolean isEnabled() {
        return true;
    }
}
