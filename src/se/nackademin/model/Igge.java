package se.nackademin.model;

public class Igge implements Feedable {

    private double length;

    //Att använda polymorfism därför att det ska finnas möjlighet för de växter som inte har en viss längd
    //Konstraktor av Igge
    public Igge() {
        this.length = 0.2;
    }

    public Igge(double length) {
        this.length = length;
    }

    //Feed metoden måsta använda här därför metoden finns i interface och
    //den här klassen har implementerat samma interface
    @Override
    public String feed() {//Likaså som har sagt i feed metoden i Palmen
        return DrinkType.MINERAL_VATTEN.getLength() + " liter " + DrinkType.MINERAL_VATTEN.getName() + "/dag";
    }
}
