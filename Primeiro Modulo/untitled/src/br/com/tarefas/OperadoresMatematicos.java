package br.com.tarefas;

public class OperadoresMatematicos {

    public int somar(int n1, int n2) { return n1 + n2; }

    public int subtrair(int n1, int n2) { return n1 - n2; }

    public int multiplicar(int n1, int n2) {return n1 * n2; }

    public int dividir(int n1, int n2) { return n1 / n2; }

    public int modulo(int n1, int n2) { return n1 % n2; }

    public int incremento(int n1) { return n1*=10; }

    public void decremento(int n1) {
        n1--;
        --n1;
        n1-=2;
    }
}
