import org.example.Pessoa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    Pessoa newPeopleTest = new Pessoa();

    @Test
    @DisplayName("Deve criar uma nova pessoa e retornar seu objeto")
    public void createNewPersonAndReturnObj() {
        Pessoa newPeopleTest = new Pessoa(45, "Moana");
        assertEquals(newPeopleTest, newPeopleTest);
    }

    @Test
    @DisplayName("Deve setar as informações de uma nova pessoa e retornar seu id")
    public void createNewPersonAndReturnId() {
        newPeopleTest.setId(75);
        newPeopleTest.setNome("Leticia");
        assertEquals(75, newPeopleTest.getId());
    }

    @Test
    @DisplayName("Deve setar as informações de uma nova pessoa e retornar seu nome")
    public void createNewPersonAndReturnName() {
        newPeopleTest.setId(75);
        newPeopleTest.setNome("Leticia");
        assertEquals("Leticia", newPeopleTest.getNome());
    }

    @Test
    @DisplayName("Deve setar as informações de uma nova pessoa e retornar verdadeiro")
    public void createNewPersonAndReturnTrue() {
        newPeopleTest.setNome("Madu");
        newPeopleTest.setId(24);
        assertTrue(newPeopleTest.valido());
    }

    @Test
    @DisplayName("Deve setar as informações de uma nova pessoa e retornar verdadeiro")
    public void createNewPersonAndReturnFalse() {
        newPeopleTest.setNome(null);
        newPeopleTest.setId(-15);
        assertFalse(newPeopleTest.valido());
    }
}
