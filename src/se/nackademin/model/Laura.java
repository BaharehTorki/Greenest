package se.nackademin.model;

//Laura är en typ av Palmen som ärver av det
public class Laura extends Palmen {

    //Att använda konstruktör i polymorfism form därför att det ska finnas möjlighet för de växter som inte har en viss längd
    //Konstraktor av Laura
    public Laura() {
        super(5);
    }

    public Laura(double length){
        super(length);
    }
}
