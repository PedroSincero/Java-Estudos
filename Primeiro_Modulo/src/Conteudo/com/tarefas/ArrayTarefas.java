package Conteudo.com.tarefas;
//Criamos um ARRAY
public class ArrayTarefas {

    Tarefa[] tarefas;
    int contador = 0;
    public ArrayTarefas(int tamanho) {
        tarefas = new Tarefa[tamanho];
    }

    public void adicionar(Tarefa tarefa){
        tarefas[contador] = tarefa;
        contador++;
    }

    public void removerTarefa(int posicao){
        tarefas[posicao] = null;
    }

    public void exibirTarefas(){
//        estrutura de repetição
        for(Tarefa tarefa: tarefas){
            tarefa.exibirTarefa();
        }
    }
}
