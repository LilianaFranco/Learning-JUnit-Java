import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonaTest {
    @Test
    public void hasLegalAge_validAge(){
        //Given
        Persona personaValidAge = new Persona("Anita", 21);

        //When
        boolean answerValidAge = personaValidAge.hasLegalAge();

        //Then
        assertTrue(answerValidAge);
    }

    @Test
    public void hasLegalAge_wrongAge(){
        //Given
        Persona personaWrongAge = new Persona("Anita", 12);

        //When
        boolean answerWrongAge = personaWrongAge.hasLegalAge();

        //Then
        assertFalse(answerWrongAge);
    }

    @Test
    public void hasValidLengthName_validName(){
        //Given
        Persona personaValidName = new Persona("Julian", 18);

        //When
        boolean answerValidName = personaValidName.hasValidLengthName();

        //Then
        assertTrue(answerValidName);
    }

    @Test
    public void hasValidLengthName_wrongName(){
        //Given
        Persona personaWrongName = new Persona("Ana", 18);

        //When
        boolean answerWrongName = personaWrongName.hasValidLengthName();

        //Then
        assertFalse(answerWrongName);
    }

    @Test
    public void hasValidCharactersInName_validCharacters(){
        //Given
        Persona personaValidCharacters = new Persona("Ana", 18);

        //When
        boolean answerValidCharacters = personaValidCharacters.hasValidCharactersInName();

        //Then
        assertTrue(answerValidCharacters);
    }

    @Test
    public void hasValidCharactersInName_wrongCharacters(){
        //Given
        Persona personaWrongCharacters = new Persona("N1c0las", 18);

        //When
        boolean answerWrongCharacters = personaWrongCharacters.hasValidCharactersInName();

        //Then
        assertFalse(answerWrongCharacters);
    }
}
