package Examples.Lab4;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab4Example4 extends ExampleBase
{
    public Lab4Example4(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Wprowadzisz teraz 5 słów i wypiszemy wszystkie od tyłu.");
        var array = new String[5];

        for (var i = 0; i < 5; i++)
            array[i] = getStringPrompt("Podaj " + (i+1) + " słowo");

        System.out.println("Twoje słowa wypisane od tyłu to:\n");

        for (var i = array.length-1; i >= 0; i--){
            for (var j = array[i].length()-1; j >= 0; j--) {
                System.out.print(array[i].charAt(j));
            }

            System.out.println();
        }
    }

    @Override
    public int getExampleNumber()
    {
        return 4;
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
