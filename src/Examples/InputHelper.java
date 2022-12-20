package Examples;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

public class InputHelper
{
    protected Scanner _scanner;

    public InputHelper(Scanner scanner)
    {
        _scanner = scanner;
    }

    public int getIntPrompt(String prompt) {
        return getIntPrompt(prompt, Optional.ofNullable(null));
    }

    public int getIntPrompt(String prompt, Optional<Predicate<Integer>> predicate){
        Double result = null;

        do {
            if (result != null)
                System.out.println("Podaj prosze liczbe calkowita.");

            result = getDoublePrompt(prompt);

            if (result % 1 != 0)
                continue;

            if (!predicate.isPresent())
                break;

            if(predicate.get().test((int)(double)result))
                return (int)(double)result;
            else
                System.out.println("Podana wartość nie jest poprawna w obecnym kontekście.");

            result = null;
        } while (true);

        return (int)(double)result;
    }

    public double getDoublePrompt(String prompt){
        return getDoublePrompt(prompt, Optional.ofNullable(null));
    }

    public double getDoublePrompt(String prompt, Optional<Predicate<Double>> predicate){
        do {
            try
            {
                System.out.print(prompt + ": ");
                double response = _scanner.nextDouble();
                _scanner.nextLine();

                if (!predicate.isPresent())
                    return response;

                if (predicate.get().test(response))
                    return response;

                System.out.println("Podana wartość nie jest poprawna w obecnym kontekście.");
            }
            catch (InputMismatchException e)
            {
                System.out.println("Podany ciag znakow nie zostal rozpoznany jako liczba!");

                if (_scanner.hasNext())
                    _scanner.nextLine();
            }
        } while (true);
    }

    public boolean getBooleanPrompt(String prompt){
        String response = null;
        do {
            if (response != null)
                System.out.println("Udzielona odpowiedz nie jest prawidlowa.");

            response =  getStringPrompt(prompt + "? (T/N)");
        } while (!response.equals("T") && !response.equals("N"));

        return response.equals("T");
    }

    public String getStringPrompt(String prompt) {
        System.out.print(prompt + ": ");
        return _scanner.nextLine();
    }
}
