package Examples.Lab2;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab2Example5 extends ExampleBase {
    public Lab2Example5(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Jesteś w salonie samochodowym, zastanawiasz się nad zakupem nowego samochodu.");

        var isDiscount = getBooleanPrompt("Czy na samochód jest zniżka");
        var salaryRaised = getBooleanPrompt("Czy dostales niedawno podwyzke");

        canBuyCar(isDiscount, salaryRaised);
    }

    private void canBuyCar(Boolean isDiscount, Boolean salaryRaised) {
        // W poleceniu zapewne wkradł się błąd, ponieważ zadane warunki nawzajem sobie wadzą, napisałem swoje
        if (salaryRaised || isDiscount)
            System.out.println("Mozesz kupic samochod!");
        else
            System.out.println("Zakup samochodu trzeba odlozyc na pozniej...");

        if (!isDiscount)
            System.out.println("Znizki na samochod nie ma.");
    }

    @Override
    public int getExampleNumber() {
        return 5;
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
