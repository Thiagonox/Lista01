package org.lista01.questao12;

import java.util.Scanner;

public class TesteConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsumoCombustivel consumo = new ConsumoCombustivel();

        while (true) {
            System.out.print("Digite o total de quilometros dirigidos (ou -1 para encerrar): ");
            int quilometragem = scanner.nextInt();
            if (quilometragem == -1) break;

            System.out.print("Digite a quantidade de combustível em litros: ");
            int litros = scanner.nextInt();

            double consumoAtual = consumo.calcularConsumo(quilometragem, litros);
            consumo.adicionarDados(quilometragem, litros);

            System.out.printf("Consumo para o tanque atual: %.2f km/l%n", consumoAtual);
            System.out.printf("Quilometragem combinada até agora: %d km%n", consumo.getQuilometragemTotal());
            System.out.printf("Total de litros consumidos até agora: %d l%n", consumo.getLitrosTotal());
        }

        scanner.close();
    }
}
