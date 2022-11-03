package Examples.Lab3;

import Examples.ExampleBase;

import java.util.Scanner;

public class Lab3Example1 extends ExampleBase
{
    public Lab3Example1(Scanner scanner)
    {
        super(scanner);
    }

    @Override
    public void begin()
    {
        var studentsNumber = getStudentsCount();
        var grades = getGrades(studentsNumber);
        showAverage(grades);
    }

    private void showAverage(double[] grades)
    {
        double average = 0;
        var i = 0;
        while (i < grades.length)
            average += grades[i++] / grades.length;

        System.out.println("Srednia wszystkich uczniow to: " + average);
    }

    private double[] getGrades(int studentsNumber)
    {
        var grades = new double[studentsNumber];
        for (int i = 0; i < studentsNumber; i++)
            grades[i] = getGrade(i+1);

        return grades;
    }

    private double getGrade(int studentNumber)
    {
        do
        {
            var number = getDoublePrompt("Podaj ocene ucznia nr " + studentNumber);

            if (number > 5)
                System.out.println("Nie za wysoka ta ocena? Podaj poprawna.");
            else if (number < 2)
                System.out.println("Nie za niska ta ocena? Podaj poprawna.");
            else return number;

        } while (true);
    }

    private int getStudentsCount()
    {
        do
        {
            var number = getIntPrompt("Podaj ilosc uczniow");

            if (number > 10)
                System.out.println("Troche za duzo.. Podaj mniej...");
            else if (number < 1)
                System.out.println("Wypadaloby miec co najmniej jednego...");
            else return number;

        } while (true);
    }

    @Override
    public int getExampleNumber()
    {
        return 1;
    }

    @Override
    public int getLabNumber()
    {
        return 3;
    }

    @Override
    public Boolean isEnabled()
    {
        return true;
    }
}
