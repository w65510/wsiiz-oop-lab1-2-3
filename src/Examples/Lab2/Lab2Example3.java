package Examples.Lab2;

import Examples.ExampleBase;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2Example3 extends ExampleBase {
    public Lab2Example3(Scanner scanner) { super(scanner);}

    @Override
    public void begin() {
        System.out.println("Bedziemy porzadkowac liczby rosnaco.");
        var a = getIntPrompt("Podaj pierwsza liczbe");
        var b = getIntPrompt("Podaj druga liczbe");
        var c = getIntPrompt("Podaj trzecia liczbe");

        var sorted = sortNumbers(a, b, c);
        System.out.println("Twoje liczby w kolejnosci rosnacej to:");

        for (int number : sorted)
            System.out.print(number + " ");
    }

    private int[] sortNumbers(int a, int b, int c){
        var array = new int[] {a, b, c};
        Arrays.sort(array);

        return array;
    }

    @Override
    public int getExampleNumber() {
        return 3;
    }

    @Override
    public int getLabNumber() {
        return 2;
    }

    @Override
    public Boolean isEnabled() {
        return true;
    }
}
