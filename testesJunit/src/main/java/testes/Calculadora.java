package testes;

public class Calculadora {

    public Calculadora(){

    }

    public int soma(int a, int b){
        return a+b;
    }

    public int subtracao(int a, int b){
        return a-b;
    }

    public int divisao(int a, int b){
        return a/b;
    }

    public int multiplicacao(int a, int b){
        return a*b;
    }

    public int potencia(int a, int b){
        return (int) Math.pow(a, b);
    }
}
