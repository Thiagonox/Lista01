package org.lista01.questao09;

import java.util.Scanner;

public class TesteAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio do círculo: ");
        float raio = scanner.nextFloat();

        float area = AreaCirculo.valorRaio(raio);

        System.out.printf("A área deste círculo é de aproximadamente %.2f unidades quadradas%n", area);
    }
}
