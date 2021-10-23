package disciplinas;

public class MainProcedural {

    public static void main(String[] args) {
        String loginAluno = "meulogin";
        if (validateLogin(loginAluno)){
            System.out.printf("Login Válido");
        }else{
            System.out.printf("Login Inválido");
        }
    }

    private static boolean validateLogin(String login){
        return login != null && !login.isEmpty() && login.length() < 20;
    }
}
