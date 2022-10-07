package se.nackademin.model;

//Putte är en typ av Palmen som ärver av det
public class Putte extends Palmen {

    //Att använda konstruktör i polymorfism form därför att det ska finnas möjlighet för de växter som inte har en viss längd
    //Konstruktör av putte
    public Putte() {//Chera inja super estefade shode?_____________________
        super(1);
    }

    public Putte(double length) {
        super(length);
    }
}

