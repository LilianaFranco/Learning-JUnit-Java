import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupTest {

    @Test
    public void addPersona_ValidDataTwoPersonasInGroup(){
        //Given
        Persona personaTest1 = new Persona("Juan", 18);
        Persona personaTest2 = new Persona("Pedro", 17);
        Persona personaTest3 = new Persona("Ana", 22);
        Persona personaTest4 = new Persona("Luz", 14);
        Persona personaTest5 = new Persona("Julian", 32);
        Group groupOne = new Group();

        //When
        groupOne.addPersona(personaTest1);
        groupOne.addPersona(personaTest2);
        groupOne.addPersona(personaTest3);
        groupOne.addPersona(personaTest4);
        groupOne.addPersona(personaTest5);
        int groupSize = groupOne.getListLength();

        //Then
        assertEquals(2, groupSize);
    }

    @Test
    public void addPersona_UnvalidDataZeroPersonasInGroup(){
        //Given
        Persona personaTest1 = new Persona("(N1c0las", 18);
        Persona personaTest2 = new Persona("Tomas", 0);
        Persona personaTest3 = new Persona(" 3steban", 22);
        Persona personaTest4 = new Persona("Carlos\\sV", 14);
        Persona personaTest5 = new Persona(" Francisco\\sII", 32);
        Group groupOne = new Group();

        //When
        groupOne.addPersona(personaTest1);
        groupOne.addPersona(personaTest2);
        groupOne.addPersona(personaTest3);
        groupOne.addPersona(personaTest4);
        groupOne.addPersona(personaTest5);
        int groupSize = groupOne.getListLength();

        //Then
        assertEquals(0, groupSize);
    }
}
