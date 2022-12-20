package Examples.Lab3;

import java.util.Random;
import java.util.Scanner;

public class Lab3Example4 extends Lab3Example3 {
    public Lab3Example4(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Zliczymy ile liczb w ciagu jest parzystych oraz ich sume.");
        System.out.println("Ciag wypelni sie losowymi liczbami z przedzialu (-10, 45).");
        var sequenceLen = getSeqLen();

        var random = new Random();
        var sequence = new int[sequenceLen];
        System.out.println("Wygenerowane liczby to:");
        for (int i = 0; i < sequenceLen; i++)
        {
            sequence[i] = random.nextInt(-10, 46);
            System.out.print(sequence[i] + " ");
        }
        System.out.println();

        showAmountAndCount(sequence); // wywolanie algorytmu z zadania 3
    }

    @Override
    public int getExampleNumber() {
        return 4;
    }

    @Override
    public int getLabNumber() {
        return 3;
    }

    @Override
    public Boolean isEnabled() {
        return false;
    }
}
