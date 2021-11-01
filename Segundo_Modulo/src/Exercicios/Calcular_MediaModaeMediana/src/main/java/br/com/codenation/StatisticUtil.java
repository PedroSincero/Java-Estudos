package Exercicios.Calcular_MediaModaeMediana.src.main.java.br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		int result = 0;

		for(int i = 0; i < elements.length; i++){
			result += elements[i];
		}

		return result / elements.length;
	}

	public static int mode(int[] elements) {
		int comparator = 0;
		int counter1 = 0;
		int counter2 = 0;

			for(int i = 0; i < elements.length; i++){
				counter1 = 0;
				comparator = elements[i];

					for(int i2 = 0; i2 < elements.length; i2++){
						if(comparator == elements[i2]){
							counter1 += 1;
						}
					}

				if (counter1 > counter2) {
					counter2 = counter1;
				}

			}
		return comparator;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int middle = elements.length/2;
		System.out.println("Middle Raiz do Length: " + middle);

		if (elements.length%2 == 1) {
			System.out.println("Middle Potencializado: " + elements[middle]);
			return elements[middle];
		} else {
			System.out.println("Middle Somado e Dividido: " + (elements[middle-1] + elements[middle]) / 2);
			return (elements[middle-1] + elements[middle]) / 2;
		}
	}
}

// Agradecimentos a https://www.ti-enxame.com/pt/java/como-calcular-media-mediana-modo-e-intervalo-de-um-conjunto-de-numeros/970350439/
// Por ter me dado um auxilio em quais ferramentas utilizar para elaborar o "median"