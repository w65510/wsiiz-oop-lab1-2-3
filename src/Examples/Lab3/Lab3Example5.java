package Examples.Lab3;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab3Example5 extends ExampleBase {
    public Lab3Example5(Scanner scanner) { super(scanner); }

    @Override
    public void begin() {
        System.out.println("Sprawdzimy czy Twoj tekst jest palindromem.");
        var text = getStringPrompt("Podaj jakis ciag znakow, a go sprawdzimy");

        var isPalindrome = checkPalindrome(text);

        if (isPalindrome)
            System.out.println("Podany tekst jest palindromem!");
        else
            System.out.println("Podany tekst nie jest palindromem.");
    }

    private boolean checkPalindrome(String text) {
        text = text.replaceAll("[^A-Za-z0-9żźćńółęąśŻŹĆĄŚĘŁÓŃ]", ""); // pozostawienie tylko znakow alfanumerycznych uzywajac regex
        var textLen = text.length();

        for (var i = 0; i < Math.ceil((double)text.length()/2.0); i++) {
            var char1 = Character.toLowerCase(text.charAt(i));
            var char2 = Character.toLowerCase(text.charAt(textLen-1-i));

            if (char1 != char2)
                return false;
        }

        return true;
    }

    @Override
    public int getExampleNumber() {
        return 5;
    }

    @Override
    public int getLabNumber() {
        return 3;
    }

    @Override
    public Boolean isEnabled() {
        return true;
    }
}
