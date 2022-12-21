package Examples;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public abstract class ExampleBase extends InputHelper implements IExample
{
    public ExampleBase(Scanner scanner)
    {
        super(scanner);
    }
}
