package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
        if(tarefa != null && tarefa.obterTamanhoTarefa() <= 20) {
            tarefas.add(tarefa);
        }else{
            System.out.printf("A tarefa é inválida");
        }

    }

    public void adicionar(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        adicionar(tarefa);
    }

    public void remover(int posicao){
        if(posicao < this.tarefas.size()){
            tarefas.remove(posicao);
        }else{
            System.out.printf("A tarefa não existe");
        }
    }
// metodo pode ter assinaturas diferentes porem com o mesmo nome.

    public void remover(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }

    public Tarefa buscar(String descricao){
        for (Tarefa tarefa: tarefas) {
            if(descricao.equals(tarefa.descricao)){
                return tarefa;
            };
        }
        return null;
    }

    public void  exibirTarefas(){
        for (Tarefa tarefa: tarefas){
            tarefa.exibirTarefa();
        }
    }
}
