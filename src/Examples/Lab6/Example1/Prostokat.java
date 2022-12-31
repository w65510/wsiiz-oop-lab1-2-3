package Examples.Lab6.Example1;

class Prostokat extends Figura
{
    double wys=0, szer=0;

    Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;
    }

    Prostokat(double wys, double szer, String kolor)
    {
        super(kolor);

        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    void move(double x, double y)
    {
        punkt.setX(x);
        punkt.setY(y);
    }

    String opis(){
        return "Klasa Prostokąt. Kolor obiektu: "+kolor;
    }
}
