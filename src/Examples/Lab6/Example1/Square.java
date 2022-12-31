package Examples.Lab6.Example1;

public class Square extends Prostokat
{
    Square(double edge)
    {
        super(edge, edge);
    }

    double getEdge()
    {
        return wys;
    }

    String opis(){
        return "Klasa Kwadrat. Kolor obiektu: "+kolor;
    }
}
