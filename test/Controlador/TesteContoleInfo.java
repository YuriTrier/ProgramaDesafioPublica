/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Jogador;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yuri
 */
public class TesteContoleInfo {
    
    public TesteContoleInfo() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void testRetornarUltimoJogo() {
        System.out.println("retornarUltimoJogo");
        ControleInformacoes instance = new ControleInformacoes();
        Jogador expResult = new Jogador("Maria", 1, 33, 0, 0);
        instance.novoJogo(expResult);
        Jogador result = instance.retornarUltimoJogo();
        assertEquals(expResult, result);
    }

    @Test
    public void testAdicionarJogo() {
        System.out.println("adicionarJogo");
        Jogador jogo = new Jogador("Maria", 1, 33, 0, 0);
        ControleInformacoes instance = new ControleInformacoes();
        instance.novoJogo(jogo);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
