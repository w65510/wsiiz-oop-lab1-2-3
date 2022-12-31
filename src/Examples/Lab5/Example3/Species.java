package Examples.Lab5.Example3;

public class Species
{
    private String speciesName;
    private String genusName;
    private int chromosomes2n;
    private int chromosomesX;
    private String description;

    public Species(String speciesName, String genusName, int chromosomes2n, int chromosomesX, String description) {
        setSpeciesName(speciesName);
        setGenusName(genusName);
        setChromosomes2n(chromosomes2n);
        setChromosomesX(chromosomesX);
        setDescription(description);
    }

    public String getFullName(){
        return speciesName + " " + genusName;
    }

    public double getHaploidChromosomes(){
        return chromosomes2n / 2;
    }

    public void writeAllData(){
        System.out.println("Informacje o stworzeniu");
        System.out.println("Pełna nazwa: " + getFullName());
        System.out.println("Rodzaj: " + getSpeciesName());
        System.out.println("Gatunek: " + getGenusName());
        System.out.println("Liczba chromosomów 2n: " + getChromosomes2n());
        System.out.println("Liczba chromosomów haploidalnych: " + getHaploidChromosomes());
        System.out.println("Ilość chromosomów x: " + getChromosomesX());
        System.out.println("Opis: " + getDescription());
    }

    public Species Clone() {
        return new Species(speciesName, genusName, chromosomes2n, chromosomesX, description);
    }

    public void setSpeciesName(String speciesName)
    {
        this.speciesName = speciesName;
    }

    public String getSpeciesName()
    {
        return speciesName;
    }

    public void setGenusName(String genusName)
    {
        this.genusName = genusName;
    }

    public String getGenusName()
    {
        return genusName;
    }

    public int getChromosomes2n()
    {
        return chromosomes2n;
    }

    public void setChromosomes2n(int chromosomes2n)
    {
        this.chromosomes2n = chromosomes2n;
    }

    public int getChromosomesX()
    {
        return chromosomesX;
    }

    public void setChromosomesX(int chromosomesX)
    {
        this.chromosomesX = chromosomesX;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
