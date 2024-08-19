package org.lista01.questao03;

public class NumerosPrimos {

    public static void imprimirNumerosPrimos(int valor) {
        for (int i = valor; i > 1; i--) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
