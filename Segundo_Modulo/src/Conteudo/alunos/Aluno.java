package alunos;

public class Aluno {

    private String login;

    private String cpf;

    private String nome;

    public Aluno(String login, String cpf, String nome) {
        this.nome = nome;
        if(validateLogin(login)){
            this.login = login;
        }else {
            System.out.println("Login Invalido");
        }
        this.cpf = cpf;
    }

    public void imprimirDados() {
        System.out.println("Nome" + nome + ", CPF: " + cpf);
    }
    public String getCpf() {
        return cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (validateLogin(login)) {
            this.login = login;
        } else {
            System.out.println("Login inválido");
        }
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    private boolean validarCpf() { return this.cpf != null && this.cpf.length() == 13; }

    private boolean validateLogin(String login){
            return login != null && !login.isEmpty() && login.length() < 20 && login.contains(nome);
        }
}
