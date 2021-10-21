package Exercicios.challenge;

import java.util.ArrayList;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {
    private void checkText(String text) {
        if (text.isEmpty()) throw new IllegalArgumentException();
        if (text == null) throw new NullPointerException();
    }

    public String Criptografia(String texto, String mod) {
        checkText(texto);
        String text = texto.toLowerCase();
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char charText = text.charAt(i);
            if (charText >= 'a' && charText <= 'z') {
                int operator = mod == "encrypt" ? charText + 3 : charText - 3;
                result += (char) operator;
            } else {
                result += charText;
            }
        }
        return result;
    }

    @Override
    public String criptografar(String texto) {
        return Criptografia(texto, "encrypt");
    }

    @Override
    public String descriptografar(String texto) {
        return Criptografia(texto, "decrypt");
    }
}

// Agradecimentos a Antenor Ferreira Mendes Neto - Maurício Viegas Rodrigues | Pelo auxilio no entendimento do funcionamento do char e do ternario