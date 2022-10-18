import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {
    @Test
    public void hasLegalAge_shouldReturnTrue(){
        //Given
        Persona personaTest = new Persona("Anita", 21);

        //When
        boolean respuesta = personaTest.hasLegalAge();

        //Then
        assertTrue(respuesta);
    }

    @Test
    public void hasLegalAge_shouldReturnFalse(){
        //Given
        Persona personaTest = new Persona("Anita", 12);

        //When
        boolean respuesta = personaTest.hasLegalAge();

        //Then
        assertFalse(respuesta);
    }
}
