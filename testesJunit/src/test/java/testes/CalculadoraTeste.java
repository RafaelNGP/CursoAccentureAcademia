package testes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {

    @Test
    public void somaDoisValores(){

        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(3, soma);
    }
}
