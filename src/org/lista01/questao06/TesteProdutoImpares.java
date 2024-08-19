package org.lista01.questao06;

public class TesteProdutoImpares {
    public static void main(String[] args) {

        int produtoInt = ProdutoImpares.RetornoInt();
        float produtoFloat = ProdutoImpares.RetornoFloat();

        System.out.println("Produto dos números ímpares (int): " + produtoInt);
        System.out.println("Produto dos números ímpares (float): " + produtoFloat);
    }
}
