package br.com.tarefas;

public class Tarefa {
//    Metodos = Comportamentos

    String descricao;

//    Construtor que recebe o parametro da tarefa
    public Tarefa(String descricao) {
//  A utilização do 'this' serve para eu me referenciar a variavel global 'descrição, o seu novo valor
        this.descricao = descricao;
    }
// Metodo que exibe a tarefa
// 'Void'> Tipo de retorno do Metodo, void tem como significado 'nada', oq quer dizer que o tipo de retorno é 'nada'

    public void exibirTarefa(){
        System.out.println(descricao);
    }
//    1- Modificador de Acesso, 2- Tipo de Retorno, 3 - Indentificador, (dentro) 4 - Conjunto de Parametros
    public int obterTamanhoTarefa(){
        return descricao.length();
    }
//    Private só pode ser acessado dentro da mesma classe
//    private void teste(){
//        System.out.println(descricao);
//    }
}
