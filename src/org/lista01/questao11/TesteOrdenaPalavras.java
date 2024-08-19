package org.lista01.questao11;

import java.util.Scanner;

public class TesteOrdenaPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        Object[] resultado = OrdenaPalavras.compare(palavra1, palavra2);
        String[] palavrasOrdenadas = (String[]) resultado[0];
        String resultadoMaior = (String) resultado[1];

        System.out.println("Ordem alfabética: " + palavrasOrdenadas[0] + ", " + palavrasOrdenadas[1]);
        System.out.println("A palavra com o maior número de caracteres é: " + resultadoMaior);

        scanner.close();
    }
}
