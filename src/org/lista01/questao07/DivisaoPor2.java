package org.lista01.questao07;

public class DivisaoPor2 {
    public static void ImprimeInt() {
        for (int i = 1; i < 100; i++) {
            int multiplo = i * 3;

            if (multiplo > 100) {
                break;
            }

            System.out.println(multiplo / 2);
        }
    }
    public static void ImprimeDouble() {
        for (int i = 1; i < 100; i++) {
            double multiplo = i * 3;

            if (multiplo > 100) {
                break;
            }

            System.out.println(multiplo / 2);
        }
    }
}
