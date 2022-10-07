package se.nackademin.model;

public class Meatloaf implements Feedable {

    private double length;

    //Att använda konstruktör i polymorfism form därför att det ska finnas möjlighet för de växter som inte har en viss längd
    //Konstruktör av Meatloaf
    public Meatloaf() {
        this.length = 0.7;
    }

    public Meatloaf(double length) {
        this.length = length;
    }

    //feed metoden måsta använda här därför metoden finns i interface och
    //den här klassen har implementerat samma interface
    @Override
    public String feed() {//Likaså som har sagt i feed metoden i Palmen
        return DrinkType.PROTEIN_DRYCK.getLength() + (DrinkType.EXTRA_TILLSKOTT.getLength() * length) + " " + DrinkType.PROTEIN_DRYCK.getName() + "/dag";
    }
}
