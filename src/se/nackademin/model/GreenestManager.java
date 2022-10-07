package se.nackademin.model;

public class GreenestManager {
    public static Feedable getPlantInstance(String plantName) {//metoden tar en sträng och det är samma sträng som användare matat in
        try {
            PlantType plantType = PlantType.valueOf(plantName.toUpperCase());   //strängen omvandlar till storbokstäver,
                                                                                // retunerar en enum med namnet som angivits,
                                                                                // kontrollerar att det är exakt samma identiferare
            return switch (plantType) { //Switch case växlar mellan de case(erna), efter att kontrolerades matchningen, retunerar den som hittades
                case IGGE -> new Igge();
                case LAURA -> new Laura();
                case MEATLOAF -> new Meatloaf();
                case PUTTE -> new Putte();
            };
        } catch (Exception e) {     //Om matchningen härskar inte retunerar null
            return null;
        }
    }

}
