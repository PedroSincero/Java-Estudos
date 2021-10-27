package disciplinas;

import alunos.Aluno;
import alunos.AlunoEncapsulado;
import alunos.ValidationException;

public class Main {
    public static void main(String[] args) {
//        Aluno aluno1 = new Aluno("testelogin", "192.000.000-12", "teste");
//        aluno1.imprimirDados();
//        Aluno aluno2 = new Aluno("meulogin2", "191.000.000-12", "Teste de Souza");
//        aluno2.imprimirDados();

//        AlunoEncapsulado aluno1 = new AlunoEncapsulado("123","12345678911","teste da silva");
        AlunoEncapsulado aluno1 = null;
//        aluno1.setCpf("1232400000000");
//        System.out.println(aluno1.getLogin());
//        System.out.println(aluno1.getCpf());
//        System.out.print(aluno1);

        try {
            aluno1 = new AlunoEncapsulado("123","12345678911","teste da silva");
        }catch (ValidationException e){
            System.out.printf("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
