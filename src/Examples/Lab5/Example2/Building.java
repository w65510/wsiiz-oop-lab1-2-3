package Examples.Lab5.Example2;

import java.time.LocalDate;

public class Building
{
    private LocalDate buildDate;
    private String name;
    private int floorsCount;

    public Building(String name, int floorsCount, LocalDate buildDate) {
        this.name = name;
        this.floorsCount = floorsCount;
        this.buildDate = buildDate;
    }

    public int calculateAge() {
        var difference = buildDate.until(LocalDate.now());

        return difference.getYears();
    }

    public void showAllInfo() {
        System.out.println("Budynek o nazwie " + name + " posiada " + floorsCount + " pięter i został zbudowany " +
                buildDate.getDayOfMonth() + "." + buildDate.getMonthValue() + "." + buildDate.getYear() + ".\n" +
                "To znaczy, że budynek ma już " + calculateAge() + " lat.");
    }
}
