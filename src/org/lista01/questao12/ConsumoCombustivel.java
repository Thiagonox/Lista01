package org.lista01.questao12;

public class ConsumoCombustivel {
    private int quilometragemTotal;
    private int litrosTotal;

    public ConsumoCombustivel() {
        quilometragemTotal = 0;
        litrosTotal = 0;
    }

    public double calcularConsumo(int quilometragem, int litros) {
        if (litros == 0) {
            throw new IllegalArgumentException("O número de litros não pode ser zero.");
        }
        return (double) quilometragem / litros;
    }

    public void adicionarDados(int quilometragem, int litros) {
        quilometragemTotal += quilometragem;
        litrosTotal += litros;
    }

    public int getQuilometragemTotal() {
        return quilometragemTotal;
    }

    public int getLitrosTotal() {
        return litrosTotal;
    }
}
