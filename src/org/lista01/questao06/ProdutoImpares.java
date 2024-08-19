package org.lista01.questao06;

public class ProdutoImpares {
    public static int RetornoInt() {
        int produtoInt = 1;
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produtoInt *= i;
            }
        }
        return produtoInt;
    }

    public static float RetornoFloat() {
        float produtoFloat = 1.0f;
        for (int i = 15; i <= 30; i++) {
            if (i % 2 != 0) {
                produtoFloat *= i;
            }
        }
        return produtoFloat;
    }
}
