package org;

public class ArvoreBinariaBusca {
    public static void main(String[] args) {
        
        Arvore raiz = new Arvore();

        raiz.inserir(50);
        raiz.inserir(30);
        raiz.inserir(70);

        raiz.prefixado();

    }
}