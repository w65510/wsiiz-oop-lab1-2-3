package Examples.Lab1;

import Examples.ExampleBase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab1Example7 extends ExampleBase {

    public Lab1Example7(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Sprawdzimy czy z wylosowanych dlugosci da sie zbudowac trojkat prostokatny.");
        System.out.println("Losowanie odbedzie sie z przedzialu liczb a i b.");

        var range = getRandomRange();
        var random = new Random();

        var a = rollLength(range, random);
        var b = rollLength(range, random);
        var c = rollLength(range, random);

        System.out.println("Wylosowane dlugosci bokow to: " + a + ", " + b + ", " + c);
        if (canBuildTriangle(a, b, c))
            System.out.println("Z wylosowanych dlugosci mozna zbudowac trojkat prostokatny!");
        else
            System.out.println("Z wylosowanych dlugosci niestety nie mozna zbudowac trojkata prostokatnego.");
    }

    private static int rollLength(int[] range, Random random) {
        return random.nextInt(range[0], range[1] + 1);
    }

    private Boolean canBuildTriangle(int a, int b, int c) {
        var lengths = new int[] { a, b, c };
        Arrays.sort(lengths);

        return Math.pow(lengths[0], 2) + Math.pow(lengths[1], 2) == Math.pow(lengths[2], 2);
    }

    private int[] getRandomRange() {
        var range = new int[2];

        range[0] = getNumber("Podaj liczbe a");
        range[1] = getNumber("Podaj liczbe b");

        Arrays.sort(range);

        return range;
    }

    private int getNumber(String prompt){
        while (true) {
            var number = getIntPrompt(prompt);

            if (number > 0)
                return number;

            System.out.println("Czy widziales kiedys bok trojkata o takiej dlugosci?");
        }
    }

    @Override
    public int getExampleNumber() {
        return 7;
    }

    @Override
    public int getLabNumber() {
        return 1;
    }

    @Override
    public Boolean isEnabled() {
        return true;
    }
}
