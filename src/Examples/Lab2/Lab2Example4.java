package Examples.Lab2;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab2Example4 extends ExampleBase {
    public Lab2Example4(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Ciekawe czy dostaniesz sie dzisiaj na uczelnie?");

        Boolean isRaining = getBooleanPrompt("Czy pada dzisiaj deszcz");
        Boolean isBus = getBooleanPrompt("Czy autobus jest na przystanku");

        canGetToCollege(isRaining, isBus);
    }

    private void canGetToCollege(Boolean isRaining, Boolean isBus) {
        if (isRaining && isBus)
            System.out.println("Wez parasol. Dostaniesz sie na uczelnie.");
        else if (isRaining && !isBus) // !isBus jest redundantne, ale pozostawiłem warunek z uwagi na polecenie
            System.out.println("Nie dostaniesz sie na uczelnie.");
        else if (!isRaining && isBus)
            System.out.println("Dostaniesz sie na uczelnie. Milego dnia i pieknej pogody.");
        else
            System.out.println("Mozesz dostac sie na uczelnie pieszo. Milego dnia i pieknej pogody.");
    }

    @Override
    public int getExampleNumber() {
        return 4;
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
