package Examples.Lab4;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab4Example7 extends ExampleBase
{
    public Lab4Example7(Scanner scanner) { super(scanner); }

    @Override
    public void begin()
    {
        System.out.println("Zadanie porówna dwie tablice");

        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"a", "b", "c"};

        System.out.println("Tablice wyglądają następująco:");
        showArray(arr1);
        showArray(arr2);

        if (areEqual(arr1, arr2))
            System.out.println("Tablice są sobie równe");
        else
            System.out.println("Tablice się od siebie różnią");
    }

    private void showArray(String[] arr){
        for (var i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    private Boolean areEqual(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (var i = 0; i < arr1.length; i++)
            if (arr1[i] != arr2[i])
                return false;

        return true;
    }

    @Override
    public int getExampleNumber()
    {
        return 7;
    }

    @Override
    public int getLabNumber()
    {
        return 4;
    }

    @Override
    public Boolean isEnabled()
    {
        return false;
    }
}
