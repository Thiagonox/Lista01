package org.lista01.questao10;

import java.util.Scanner;

public class TesteContagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a cadeia de caracteres que desejar: ");
        String cadeiaCaracteres = scanner.nextLine();

        int[] total = Contagem.caracteres(cadeiaCaracteres);

        int countVogais = total[0];
        int countEspacos = total[1];
        int countConsoantes = total[2];

        int totalCaracteres = cadeiaCaracteres.length();

        // Imprimindo os resultados
        System.out.println("Número de vogais: " + countVogais);
        System.out.println("Número de espaços: " + countEspacos);
        System.out.println("Número de consoantes: " + countConsoantes);
        System.out.println("Número total de caracteres: " + totalCaracteres);

        scanner.close();
    }
}
