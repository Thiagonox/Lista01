package org.lista01.questao03;

import java.util.Scanner;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int valor = scanner.nextInt();

        NumerosPrimos.imprimirNumerosPrimos(valor);
    }
}
