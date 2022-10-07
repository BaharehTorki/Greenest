package se.nackademin.model;

//enum som är en klass
public enum DrinkType {
    //Fyra typer av enum med värden som är konstanta i programmet.
    KRAN_VATTEN(0.5, "kranvatten"),
    PROTEIN_DRYCK(0.1, "proteindryck"),
    EXTRA_TILLSKOTT(0.2,"extra tillskott"),
    MINERAL_VATTEN(0.2, "mineralvatten");

    //Två privata variabler for att ta deras värde i fyra typer av enumeratorer
    private double length;
    private String name;

    //Konstruktör av klass enum DrinkType med två input
    DrinkType(double length, String name){
        this.length = length;
        this.name = name;
    }

    //Skappa Getter for att retunera värdena från length och name
    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }
}
