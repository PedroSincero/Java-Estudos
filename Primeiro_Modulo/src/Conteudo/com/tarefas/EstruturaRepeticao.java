package Conteudo.com.tarefas;

public class EstruturaRepeticao {
//    for é determinado
    public void imprimirNumeros(int limite){
        for (int i = 0; i < limite; i++) {
            System.out.printf("O numero é: " + i);
        }
    }
//while nao é determinado
    public void imprimirNumerosEnquanto(int numero){
        while(numero < 100){
            System.out.printf("O numero é menor que 100, vamos dobrar");
            numero *= 2;
        }
        System.out.printf("O numero agora é "+ numero);
    }
// 'do', executa pela primeira vez, depois vê a condicional, logo em seguida volta para o 'do' e checa novamente

    public void imprimirNumeroDoWhile(int numero){
        do{
            System.out.printf("O numero é "+ numero + ", vamos dobrar");
            numero *= 2;
        }while(numero < 100);
        System.out.printf("O numero agora é: " + numero);
    }
}
