package Conteudo.com;
// Public > Essa classe pode ser acessada por qual quer pacote

import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

public class Principal2 {

    public static void main(String[] args) {
// Diferencial do 'print' e do 'println' é que o ln pula 1 linha.
        System.out.println("Minhas Tarefas");

        System.out.println("---------------------------------");
//        ArrayTarefas tarefas = new ArrayTarefas(3);
        ListaTarefas tarefas = new ListaTarefas();
        Tarefa tarefa1 = new Tarefa("regar as plantas");
        Tarefa tarefa2 = new Tarefa("banho de sol");
        Tarefa tarefa3 = new Tarefa("trabalho");
        tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        tarefas.exibirTarefas();
//        System.out.println("A tarefa tem " + tarefa1.obterTamanhoTarefa() + " Caracteres");
    }
}
