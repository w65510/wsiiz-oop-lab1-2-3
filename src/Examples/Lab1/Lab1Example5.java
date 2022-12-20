package Examples.Lab1;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab1Example5 extends ExampleBase {

    public Lab1Example5(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        var number = getIntPrompt("Podaj liczbe, podniesiemy ja do 3 potegi");

        var poweredNumber = powerOf3(number);
        System.out.println("Liczba " + number + " podniesiona do 3 potegi to " + poweredNumber);
    }

    private int powerOf3(int numberToPower){
        return numberToPower * numberToPower * numberToPower;
    }

    @Override
    public int getExampleNumber() {
        return 5;
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
