import Examples.*;
import Examples.Lab1.*;
import Examples.Lab2.*;
import Examples.Lab3.*;

import java.util.Scanner;

public class Main
{
    private static Scanner _scanner;

    public static void main(String[] args)
    {
        _scanner = new Scanner(System.in);

        greetUser();
        beginExamples();
    }

    private static void beginExamples()
    {
        // Aby wyłączyć któreś zadanie, wystarczy w nim ustawić isEnabled na false, albo zakomentować je w tablicy
        // Wszystkie zadania są włączone, więc uruchomienie programu spowoduje uruchomienie wszystkich zadań
        // Jedno po drugim
        var examples = new IExample[] {
                new Lab1Example1(_scanner),
                new Lab1Example2(_scanner),
                new Lab1Example3(_scanner),
                new Lab1Example4(_scanner),
                new Lab1Example5(_scanner),
                new Lab1Example6(_scanner),
                new Lab1Example7(_scanner),
                new Lab2Example1(_scanner),
                new Lab2Example2(_scanner),
                new Lab2Example3(_scanner),
                new Lab2Example4(_scanner),
                new Lab2Example5(_scanner),
                new Lab2Example6(_scanner),
                new Lab3Example1(_scanner),
                new Lab3Example2(_scanner),
                new Lab3Example3(_scanner),
                new Lab3Example4(_scanner),
                new Lab3Example5(_scanner)
        };

        for (var example : examples)
        {
            if (!example.isEnabled())
                continue;

            System.out.println("Lab " + example.getLabNumber() + ", Zadanie " + example.getExampleNumber());
            example.begin();
            System.out.println();
        }
    }

    private static void greetUser()
    {
        System.out.println("Witaj!");
    }
}