package br.com;

public class EstruturaCOndicional {

    public void imprimirNome(String nome){
        if(nome != null){
            System.out.println("O nome é "+ nome);
        }else{
            System.out.println("O nome é obrigatório");
        }
    }
//    Até 11 anos - Infantil
//    Entre 12 e 17 anos - Juvenil
//    Acima de 18 anos - Adulto
    public void definirGrupoPorIdade(int idade){
        if(idade <12){
            System.out.println("Grupo Infantil");
        }else if(idade <18){
            System.out.println("Grupo Juvenil");
        }else{
            System.out.println("Grupo Adulto");
        }
    }

    public void selecionarFruta(String fruta){
        switch (fruta){
            case "Maçã":
                imprimirFrutaSelecionada(fruta);
                break;
            case "Laranja":
                imprimirFrutaSelecionada(fruta);
                break;
            default:
                System.out.println("Fruta nao disponivel");
        }
    }

    private void imprimirFrutaSelecionada(String fruta) {
        System.out.println("Você selecionou a" + fruta);
    }
}
