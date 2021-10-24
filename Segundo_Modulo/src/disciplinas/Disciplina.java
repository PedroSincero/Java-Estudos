package disciplinas;

import alunos.AlunoEncapsulado;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private static final byte LIMITE = 10;

    private String nome;

    private List<AlunoEncapsulado> alunos = new ArrayList<>();

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    private Professor professor;

    public void matricular(AlunoEncapsulado aluno) throws LimitAlunoException {
        if(this.alunos.size() < LIMITE){
            this.alunos.add(aluno);
        }else {
            throw new LimitAlunoException("Extendeu o limite");
        }
    }

    public void mostrarAlunos(){
        this.alunos.stream().forEach(aluno -> System.out.print(aluno.getNome()));
    }
}
