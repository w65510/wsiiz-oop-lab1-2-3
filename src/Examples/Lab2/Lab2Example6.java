package Examples.Lab2;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab2Example6 extends ExampleBase {
    public Lab2Example6(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Oto twoj osobisty mini kalkulator.");

        var a = getIntPrompt("Podaj a");
        var b = getIntPrompt("Podaj b");

        var choice = getStringPrompt("Jakie dzialanie chesz wykonac? (+ - / * %)");

        Integer result = getCalculatedResult(a, b, choice);

        if (result == null){
            System.out.println("Wybrane dzialanie nie jest obslugiwane.");
            return;
        }

        System.out.println(a + choice + b + "=" + result);
    }

    private Integer getCalculatedResult(int a, int b, String choice) {
        return switch (choice) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            case "%" -> a % b;
            default -> null;
        };
    }

    @Override
    public int getExampleNumber() {
        return 6;
    }

    @Override
    public int getLabNumber() {
        return 2;
    }

    @Override
    public Boolean isEnabled() {
        return false;
    }
}
