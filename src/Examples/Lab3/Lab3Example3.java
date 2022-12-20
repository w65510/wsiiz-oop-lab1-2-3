package Examples.Lab3;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab3Example3 extends ExampleBase {
    public Lab3Example3(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Zliczymy ile liczb w ciagu jest parzystych oraz ich sume.");
        var sequenceLen = getSeqLen();

        var sequence = new int[sequenceLen];
        for (int i = 0; i < sequenceLen; i++)
            sequence[i] = getIntPrompt("Podaj " + (i+1) + " liczbe z sekwencji");

        showAmountAndCount(sequence);
    }

    protected void showAmountAndCount(int[] sequence) {
        int amount = 0;
        int sum = 0;

        for (var number: sequence) {
            if (number % 2 == 0){
                amount++;
                sum += number;
            }
        }

        System.out.println("W ciagu znalazlo sie " + amount + " liczb parzystych, a ich suma to " + sum);
    }

    protected int getSeqLen() {
        while (true){
            var len = getIntPrompt("Ile liczb ma sie znalezc w ciagu? (1-20)");

            if (len > 0 && len <= 20)
                return len;

            System.out.println("Podana liczba jest niepoprawna.");
        }
    }

    @Override
    public int getExampleNumber() {
        return 3;
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
