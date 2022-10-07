package se.nackademin.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class GreenestManagerTest {

    @ParameterizedTest//Namnen som är giltig och acceptera som korrekt inmattning
    @ValueSource(strings = {"Igge","IGGE","igge","IGge","IggE","LAURA","laura","LaURA","meatloaf","MEATLOAF","PUTTE","putte",})
    void should_return_Feedable_instance_if_plantName_is_correct(String plantName) {
        Feedable plantInstance = GreenestManager.getPlantInstance(plantName);//Den methoden kommer att retunerar en objekt som är instanceOf Feedable
        assertNotNull(plantInstance);//Om det var inte null testet kommer bli grön
    }

    @ParameterizedTest//Method testen kommer att få en argument som heter plantName
    @ValueSource(strings = {"Ige","IGG","gge","bahar","LARA","laur","URA","meatlof","MEALOAF","PTTE","putt",})//varje gång testet körs med en av dessa strängar, altså med annat ord variable plantName kommer deklareras med dem
    void should_return_null_if_plantName_not_exist(String plantName) {
        Feedable plantInstance = GreenestManager.getPlantInstance(plantName);
        assertNull(plantInstance);//Om det var null testet kommer bli grön
    }

}