package org.lista01.questao11;

public class OrdenaPalavras {
    public static Object[] compare(String palavra1, String palavra2) {
        String[] compare;
        if (palavra1.compareTo(palavra2) < 0) {
            compare = new String[] { palavra1, palavra2 };
        } else {
            compare = new String[] { palavra2, palavra1 };
        }

        // Determinar qual palavra tem o maior número de caracteres
        String resultadoMaior;
        if (palavra1.length() > palavra2.length()) {
            resultadoMaior = palavra1;
        } else if (palavra2.length() > palavra1.length()) {
            resultadoMaior = palavra2;
        } else {
            resultadoMaior = "Ambas as palavras têm o mesmo número de caracteres.";
        }

        // Retornar resultados em um array de Object
        return new Object[] {compare, resultadoMaior };
    }
}
