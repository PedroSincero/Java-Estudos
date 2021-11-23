package com.challenge.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//@Retention (RetentionPolicy.RUNTIME) significa que a anotação pode ser acessada por meio de reflexão em tempo de execução.
// Se você não definir esta diretiva, a anotação não será preservada em tempo de execução e, portanto, não estará disponível por meio de reflexão.

//@Target (ElementType.TYPE) significa que a anotação só pode ser usada em cima dos tipos (classes e interfaces normalmente).
// Você também pode especificar METHOD ou FIELD, ou pode deixar o alvo totalmente de fora para que a anotação possa ser usada para ambas as classes, métodos e campos.
// http://tutorials.jenkov.com/java-reflection/annotations.html
@Target(ElementType.FIELD)

@Retention(RetentionPolicy.RUNTIME)
// define em qual momento irá funcionar, no caso. Em tempo de execução .
public @interface Somar {
}
