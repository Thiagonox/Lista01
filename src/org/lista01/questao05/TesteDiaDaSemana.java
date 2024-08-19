package org.lista01.questao05;

import java.util.Scanner;

public class TesteDiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        int dia = scanner.nextInt();

        System.out.println(DiaDaSemana.Converte(dia));
    }
}
