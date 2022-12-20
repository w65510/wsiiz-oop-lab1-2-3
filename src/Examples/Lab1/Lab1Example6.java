package Examples.Lab1;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab1Example6 extends ExampleBase {

    public Lab1Example6(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        var number = getIntPrompt("Podaj liczbe, policzymy z niej pierwiastek kwadratowy");

        var sqrt = calculateSqrt(number);
        System.out.println("Pierwiastek kwadratowy z liczby " + number + " wynosi " + sqrt);
    }

    private double calculateSqrt(int number) {
        return Math.sqrt(number);
    }

    @Override
    public int getExampleNumber() {
        return 6;
    }

    @Override
    public int getLabNumber() {
        return 1;
    }

    @Override
    public Boolean isEnabled() {
        return false;
    }
}
