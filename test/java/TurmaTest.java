import org.example.Pessoa;
import org.example.Turma;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurmaTest {
    Turma newTurmaTest = new Turma();

    @Test
    @DisplayName("Deve criar uma nova pessoa e cair na primeira exceção")
    public void createNewPersonAndFallIntoTheFirstException() {
        Pessoa newPeopleTest = new Pessoa(-15, null);
        try {
            newTurmaTest.adicionarPessoa(newPeopleTest);
        } catch (Exception e) {
            assertEquals("Objeto pessoa inválido", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve criar novas pessoas com o mesmo id e cair na segunda exceção")
    public void createNewPersonAndFallIntoTheSecondException() {
        Pessoa newPeopleTest = new Pessoa(2, "Cleide");
        Pessoa newPeopleTest2 = new Pessoa(2, "Jessica");
        try {
            newTurmaTest.adicionarPessoa(newPeopleTest);
            newTurmaTest.adicionarPessoa(newPeopleTest2);
        } catch (Exception e) {
            assertEquals("Objeto pessoa já está atribuido a turma", e.getMessage());
        }
    }

    @Test
    @DisplayName("Deve criar novas pessoas e adicioná-las na lista")
    public void createNewPersonAndAddThemToList() throws Exception {
        Pessoa newPeopleTest = new Pessoa(1, "Geovana");
        Pessoa newPeopleTest2 = new Pessoa(2, "Julia");
        newTurmaTest.adicionarPessoa(newPeopleTest);
        newTurmaTest.adicionarPessoa(newPeopleTest2);
        assertEquals(2, newTurmaTest.getPessoas().size());
    }

    @Test
    @DisplayName("Deve criar novas pessoas e removê-las da lista")
    public void removeAllPeople() throws Exception {
        Pessoa newPeopleTest = new Pessoa(1, "Cleide");
        Pessoa newPeopleTest2 = new Pessoa(2, "Jessica");
        Pessoa newPeopleTest3 = new Pessoa(3, "Fernando");
        newTurmaTest.adicionarPessoa(newPeopleTest);
        newTurmaTest.adicionarPessoa(newPeopleTest2);
        newTurmaTest.adicionarPessoa(newPeopleTest3);

       assertEquals(newTurmaTest.getPessoas().size(), 3);
       newTurmaTest.removerTodasPessoas();
      assertEquals(newTurmaTest.getPessoas().size(), 0);
    }

}
