package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {
    
  @Test
    void testGetVazio() {
        String retornoEsperado = "Sistema de Informação";
        Aluno aluno = new Aluno();
        String retornoFeito = aluno.getCurso();
        assertEquals(retornoEsperado, retornoFeito, "");
    }
    
}
