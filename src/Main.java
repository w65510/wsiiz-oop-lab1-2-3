import Examples.*;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    private static Scanner _scanner;
    private static List<IExample> _examples;
    private static InputHelper _inputHelper;

    public static void main(String[] args)
    {
        _scanner = new Scanner(System.in);
        _inputHelper = new InputHelper(_scanner);

        System.out.println("Witaj!");
        beginExamples();
    }

    private static void beginExamples()
    {
        try
        {
            _examples = ExamplesScanner.getAllExamples(_scanner);
        }
        catch(Exception e)
        {
            throw new RuntimeException("Wystąpił błąd podczas wyszukiwania zadan.");
        }

        showMenu();
    }

    private static void showMenu()
    {
        List<Integer> allowedValues = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        System.out.println("Co chcesz zrobić?");
        System.out.println("\n1. Uruchom wszystkie zadania");
        System.out.println("2. Uruchom wszystkie włączone zadania");
        System.out.println("3. Wybierz zadanie");
        System.out.println("4. Najnowsze zadanie\n");

        var choice = _inputHelper.getIntPrompt("Wybor", Optional.of(x -> allowedValues.contains(x)));
        System.out.println();

        switch (choice) {
            case 1 -> runExamples(false);
            case 2 -> runExamples(true);
            case 3 -> chooseLab();
            case 4 -> newestExample();
        }
    }

    private static void newestExample()
    {
        var maxLab = _examples.stream().map(x -> x.getLabNumber()).max(Integer::compareTo).orElse(0);
        _examples = _examples.stream().filter(x -> x.getLabNumber() == maxLab).collect(Collectors.toList());

        var maxExample = _examples.stream().map(x -> x.getExampleNumber()).max(Integer::compareTo).orElse(0);
        var example = _examples.stream().filter(x -> x.getExampleNumber() == maxExample).findFirst().orElse(null);

        example.begin();
    }

    private static void chooseLab()
    {
        List<Integer> availableLabs = _examples.stream()
                .map(person -> person.getLabNumber())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Dostępne laboratoria: " + String.join(", ", availableLabs.stream().map(String::valueOf).collect(Collectors.toList())));
        var lab = _inputHelper.getIntPrompt("Wybierz laboratorium", Optional.of(x -> availableLabs.contains(x)));
        System.out.println();

        _examples = _examples.stream()
                .filter(x -> x.getLabNumber() == lab)
                .collect(Collectors.toList());

        chooseExample();
    }

    private static void chooseExample()
    {
        List<Integer> availableExamples = _examples.stream()
                .map(person -> person.getExampleNumber())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Dostępne zadania: " + String.join(", ", availableExamples.stream().map(String::valueOf).collect(Collectors.toList())));
        var exampleNo = _inputHelper.getIntPrompt("Wybierz zadanie", Optional.of(x -> availableExamples.contains(x)));
        System.out.println();

        var example = _examples.stream()
                .filter(x -> x.getExampleNumber() == exampleNo)
                .findFirst();

        if (!example.isPresent())
        {
            System.out.println("Takie zadanie nie istnieje.");
            return;
        }

        example.get().begin();
    }

    private static void runExamples(Boolean onlyEnabled)
    {
        for (var example : _examples)
        {
            if (onlyEnabled && !example.isEnabled())
                continue;

            System.out.println("Lab " + example.getLabNumber() + ", Zadanie " + example.getExampleNumber());
            example.begin();
            System.out.println();
        }
    }
}