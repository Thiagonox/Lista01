package org.lista01.questao04;

import java.util.Scanner;

public class TesteConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em milhas: ");
        double milhas = scanner.nextDouble();

        double quilometros = Conversao.MilhasParaKm(milhas);
        System.out.println("Valor em quilômetros: " + quilometros);
    }
}