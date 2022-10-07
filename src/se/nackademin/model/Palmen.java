package se.nackademin.model;

//Palmen klass som implementerar feedable interface
public class Palmen implements Feedable {
    private double length;        //Deklarera privat variable

    public Palmen(double length) {//Palmen Konstruktör med en double length som input
        this.length = length;
    }       //konstruktör av palmen class

    //feed metoden som tar length och name. Den här metoden måsta implementera här därför metoden finns i interface
    // och den här klassen har implementerat samma interface
    @Override
    public String feed() {      //feed metoden som har implementerat genom interface
        //retunera length (med uträkning) och name värdena från enumeratorer i Drinktype.
        return (DrinkType.KRAN_VATTEN.getLength() * length) + " " + DrinkType.KRAN_VATTEN.getName() + "/dag";
    }
}
