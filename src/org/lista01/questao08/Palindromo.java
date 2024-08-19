package org.lista01.questao08;

public class Palindromo {
    public static boolean isPalindromo(String palavra) {
        String limpaPalavra = palavra.replaceAll("\\s+", "").toLowerCase();

        String palavraAoContrario = new StringBuilder(limpaPalavra).reverse().toString();

        return limpaPalavra.equals(palavraAoContrario);
    }
}
