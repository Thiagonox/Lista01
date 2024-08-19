package org.lista01.questao08;

import java.util.Scanner;

public class TestePalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a palavra: ");
        String palavra = scanner.nextLine();

        boolean palindromo = Palindromo.isPalindromo(palavra);
        if (palindromo){
            System.out.println("A palavra " + palavra + " é um palindromo");
        } else {
            System.out.println("A palavra " + palavra + " não é um palindromo");
        }
    }
}
