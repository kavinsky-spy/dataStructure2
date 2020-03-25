package org;

public class Arvore {

    NoArvore raiz;


    public Arvore() {
        raiz = null;
    }

    public void inserir( int valor) {
        if( raiz == null) {
            raiz = new NoArvore(valor);
        }else {
            raiz.inserir(valor);
        }
    }

    public void prefixado() {
        prefixado_aux(raiz);

    }

    public void prefixado_aux( NoArvore no){
        if(no == null) return;
        System.out.printf("" + no.info);
        prefixado_aux( no.esq);
        prefixado_aux(no.dir);
    }

    public void retirar ( int valor) {
        if ( raiz != null) raiz.retirar(valor);
    }
}