package Conteudo.com;

public class Primitivos {
// Separa 1 byte na memoria para a variavel. - min -128 max 127
    byte byteVar = 127;
// Separa 16 byte na memoria para a variavel. - min -32.768 max 32.767
    short curto = 10000;
// Separa 32 bytes na memoria para a variavel. - min -2.147.483.648 max 2.147.483.647
    int inteiro = 100000000;
// Separa 64 bytes na memoria para a variavel. - min -9.223.372.036.854.775.808 max 9.223.372.036.854.775.807
// O 'L' no final diz ao compilador que o valor é do tipo 'long'
// public, deixa a variavel livre para utilização em outro lugar
    public long longo = 1000000000000000000L;

   Integer inteiroWrapper = 1000000000;

    Short curtoWrapper = 1000;

//    Por padrao ele precisa o 'F' para o compilador entender que é um ponto flutuante
    float pontoFlutuante = 10.10F;

    double pontoFlutuanteDobro = 100000000000000000.299;
// Armazena o valor de apenas 1 caractere
    char character = 'S';
// Guarda valores boleanos
    boolean booleano = true;
}
