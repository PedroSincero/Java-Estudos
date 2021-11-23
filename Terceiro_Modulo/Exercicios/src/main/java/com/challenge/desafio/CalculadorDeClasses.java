package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;

public class CalculadorDeClasses implements Calculavel {

    public static BigDecimal calculationValue(Object obj, Class value) {
        BigDecimal result = BigDecimal.ZERO;
// ======Não entendi direito, consultar: Maurício Viegas Rodrigues =======
        Field[] fieldList = obj.getClass().getDeclaredFields();

        for (Field field : fieldList) {
//  O método setAccessible () da classe Field define o sinalizador acessível para este objeto refletido para o valor booleano indicado.
//  Um valor verdadeiro indica que o objeto refletido deve suprimir as verificações do controle de acesso da linguagem Java quando for usado.
            field.setAccessible(true);
// O método getDeclaredAnnotation () da classe java Class retorna a anotação deste elemento para o tipo especificado se qualquer anotação estiver diretamente presente, caso contrário, nula.
            Annotation annotation = field.getDeclaredAnnotation(value);

            if (annotation != null) {
                try {
// Não entendi a importancia deste if
                    if (BigDecimal.class == field.getType()) {
                        result = result.add(new BigDecimal(field.get(obj).toString()));
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
// ======================================================================
        return result;
    }

    @Override
    public BigDecimal somar(Object obj) {
        return calculationValue(obj, Somar.class);
    }

    @Override
    public BigDecimal subtrair(Object obj) {
        return calculationValue(obj, Subtrair.class);
    }

//    não entendi mt esta parte
//    entega o objeto e chama o metodo,
    @Override
    public BigDecimal totalizar(Object obj) {
        BigDecimal soma = somar(obj);
        BigDecimal subtracao = subtrair(obj);
// soma - sub
        return soma.subtract(subtracao);
    }
}

// Agradecimentos a Mauricio Viegas - Turma 10 Tribo A, pela explicação do funcionamento do codigo.