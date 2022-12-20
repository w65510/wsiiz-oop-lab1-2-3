package Examples.Lab2;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab2Example1 extends ExampleBase {
    public Lab2Example1(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Rozwiazemy rownanie kwadratowe ax+bc+c=0");

        var a = getIntPrompt("Podaj stala a");
        var b = getIntPrompt("Podaj stala b");
        var c = getIntPrompt("Podaj stala c");

        solveQuadraticEquation(a, b, c);
    }

    private void solveQuadraticEquation(int a, int b, int c) {
        var delta = Math.pow(b, 2) - (4 * a * c);

        if (delta > 0) {
            System.out.println("Rownanie kwadratowe ma 2 rozwiazania:");
            var deltaSqrt = Math.sqrt(delta);
            System.out.print("x1 = " + (-b-deltaSqrt)/(2*a) + ", ");
            System.out.println("x2 = " + (-b+deltaSqrt)/(2*a));
        }
        else if (delta == 0) {
            System.out.println("Rownanie kwadratowe ma 1 rozwiazanie:");
            System.out.println("x = " + -(b/(2*a)));
        }
        else {
            System.out.println("Rownanie kwadratowe nie ma rozwiazan!");
        }
    }

    @Override
    public int getExampleNumber() {
        return 1;
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
