package Examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class ExampleBase implements IExample
{
    protected Scanner _scanner;

    public ExampleBase(Scanner scanner)
    {
        _scanner = scanner;
    }

    protected int getIntPrompt(String prompt){
        Double result = null;

        do {
            if (result != null)
                System.out.println("Podaj prosze liczbe calkowita.");

            result = getDoublePrompt(prompt);
        } while (result % 1 != 0);

        return (int)(double)result;
    }

    protected double getDoublePrompt(String prompt){
        do {
            try
            {
                System.out.print(prompt + ": ");
                double response = _scanner.nextDouble();
                if (_scanner.hasNext())
                    _scanner.nextLine();

                return response;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Podany ciag znakow nie zostal rozpoznany jako liczba!");

                if (_scanner.hasNext())
                    _scanner.nextLine();
            }
        } while (true);
    }

    protected boolean getBooleanPrompt(String prompt){
        String response = null;
        do {
            if (response != null)
                System.out.println("Udzielona odpowiedz nie jest prawidlowa.");

            response =  getStringPrompt(prompt + "? (T/N)");
        } while (!response.equals("T") && !response.equals("N"));

        return response.equals("T");
    }

    protected String getStringPrompt(String prompt) {
        System.out.print(prompt + ": ");
        return _scanner.nextLine();
    }
}
