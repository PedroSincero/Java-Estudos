package alunos;

import Curso.Usuario;

public class AlunoHerança extends Usuario {

    private  Integer numeroMatricula;

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public AlunoHerança(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }
}
