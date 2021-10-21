package Exercicios;


public class CalculadoraSalario {

	public static double discountINSS(double salario, double percentual) {
		return salario -= (salario * percentual);
	}

	private double calcularINSS(double salarioBase) {
		double result;
		if ( salarioBase < 3000){
			result = salarioBase;
		} else if ( salarioBase > 3000 && salarioBase <= 6000){
			salarioBase = discountINSS(salarioBase, 0.075);
			result = salarioBase;
		} else {
			salarioBase = discountINSS(salarioBase, 0.15);
			result = salarioBase;
		}
		return result;
	}

	public long calcularSalarioLiquido(double salarioBase) {
		double discont = 0;
		if(salarioBase <= 1039){
			return 0;
		}else if (salarioBase <= 1500){
			discont = discountINSS(salarioBase, 0.08);
		}else if (salarioBase > 1500 && salarioBase <= 4000){
			discont = discountINSS(salarioBase, 0.09);
		} else if (salarioBase > 4000) {
			discont = discountINSS(salarioBase, 0.11);
		}
		double result =  calcularINSS(discont);
		return  Math.round(result);
	}



}

//Use o Math.round apenas no final do método para arredondar o valor final.
//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-