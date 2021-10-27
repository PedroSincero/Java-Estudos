package disciplinas;

import Curso.Usuario;
import alunos.ValidationException;

public class Professor extends Usuario {

    public Professor(String login, String cpf, String nome) throws ValidationException {
        super(login, cpf, nome);
    }
}
