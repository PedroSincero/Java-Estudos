package alunos;

public class AlunoEncapsulado {
    private String login;

    private String cpf;

    private String nome;

    public AlunoEncapsulado(String login, String cpf, String nome) throws ValidationException {
        setLogin(login);
        setCpf(cpf);
        setNome(nome);
    }

    public void setLogin(String login) throws ValidationException {
        if(validateLogin(login)){
            this.login = login;
        }else {
            throw new ValidationException("Login inválido");
//            throw new RuntimeException();
//            System.out.printf("Login Inválido");
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

    public String getLogin() {
        return login;
    }

    public String getCpf() {
        return cpf;
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

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Login: " + login;
    }
}
