package disciplinas;

import alunos.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("testelogin", "192.000.000-12", "teste");
        aluno1.imprimirDados();
        Aluno aluno2 = new Aluno("meulogin2", "191.000.000-12", "Teste de Souza");
        aluno2.imprimirDados();
    }
}
