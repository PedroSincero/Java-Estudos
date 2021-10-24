package Curso;

import alunos.ValidationException;

public class Usuario {
    private String login;

    private String cpf;

    private String nome;


    public Usuario(String login, String cpf, String nome) throws ValidationException {
        setLogin(login);
        setCpf(cpf);
        setNome(nome);
    }
    public String getLogin() {
        return login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setLogin(String login) throws ValidationException {
        if(validateLogin(login)){
            this.login = login;
        }else {
            throw new ValidationException("Login inválido");
        }
    }

    public void setCpf(String cpf) {
        if(validateCPF(cpf)){
            this.cpf = cpf;
        }else {
            System.out.printf("CPF inválido");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private static boolean validateLogin(String login){
        return login != null && !login.isEmpty() &&  login.length() > 3 && login.length() < 20;
    }

    private boolean validateCPF (String cpf){
        return cpf != null && !cpf.isEmpty() && (cpf.length() == 11 || cpf.length() == 14);
    }
}
