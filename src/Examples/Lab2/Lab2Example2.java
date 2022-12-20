package Examples.Lab2;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab2Example2 extends ExampleBase {
    public Lab2Example2(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Obliczymy wartosci 3 roznych fukncji na podstawie wprowadzonego x.");
        var x = getIntPrompt("Podaj x");

        ax(x);
        bx(x);
        cx(x);
    }

    private void ax(int x){
        int result;

        if (x > 0) result = 2*x;
        else if (x == 0) result = 0;
        else result = -3*x;

        printFunction("a", x, result);
    }

    private void bx(int x){
        int result;

        if (x >= 1) result = (int)Math.pow(x, 2);
        else result = x;

        printFunction("b", x, result);

    }

    private void cx(int x){
        int result;

        if (x > 2) result = 2 + x;
        else if (x == 2) result = 8;
        else result = x - 4;

        printFunction("c", x, result);
    }

    private void printFunction(String functionName, int x, int result){
        System.out.println(functionName + "(" + x + ") = " + result);
    }

    @Override
    public int getExampleNumber() {
        return 2;
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
