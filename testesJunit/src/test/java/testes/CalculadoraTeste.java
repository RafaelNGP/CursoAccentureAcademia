package testes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTeste {

    @Test
    public void somaDoisValores() {

        int valorA = 1;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);

        assertEquals(3, soma);
    }

    @Test
    public void subtraiDoisValores() {
        int valorA = 1;
        int valorB = 1;

        Calculadora calculadora = new Calculadora();
        int subtracao = calculadora.subtracao(valorA, valorB);

        assertEquals(0, subtracao);
    }

    @Test
    public void dividirDoisValores() {
        int valorA = 2;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int divisao = calculadora.divisao(valorA, valorB);

        assertEquals(1, divisao);
    }

    @Test(expected = ArithmeticException.class)
    public void dividirZeroValores() {
        int valorA = 2;
        int valorB = 0;

        Calculadora calculadora = new Calculadora();
        int zero = calculadora.divisao(valorA, valorB);

        assertEquals(0, zero);
    }

    @Test
    public void multiplicarDoisValores() {
        int valorA = 2;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int multiplicacao = calculadora.multiplicacao(valorA, valorB);

        assertEquals(4, multiplicacao);
    }

    @Test
    public void potenciarDoisValores() {
        int valorA = 2;
        int valorB = 2;

        Calculadora calculadora = new Calculadora();
        int potencializacao = calculadora.potencia(valorA, valorB);

        assertEquals(4, potencializacao);
    }
}
