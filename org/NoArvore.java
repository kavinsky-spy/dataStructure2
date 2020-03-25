package org;

public class NoArvore {
    
    NoArvore esq;
    int info;
    NoArvore dir;

    public NoArvore (int valor) {
        

    }

    public int getValor() {
        return info;
    }

    public void inserir( int valor) {
        if( valor < info ) { // deve ser inserido na sub arvore da esquerda
            if( esq == null ) {
                new NoArvore(valor);
            }else {
                esq.inserir(valor);
            }
        }else { // senao deve ser na direita
            if( dir == null) {  
                dir = new NoArvore (valor);

            }else {
                dir.inserir(valor);
            }
        }
    }

    public NoArvore retirar( int valor ) {
        if( valor == info ) { // estou no valor a ser retirado
            if( esq == null && dir == null ) { // no folha
             return null;
            }
            if( esq != null && dir == null ) { // so tem filho a esquerda 
            return esq;
            }
            if( esq == null && dir !=null ) { // so tem filho a direita
            return dir;
            }
            // tem dois filhos
            int maior = esq.buscar_maior_valor();
            info = maior;
            esq = esq.retirar( maior );
            return this;
        }
        if( valor < info ) { // esta a esquerda 
            if( esq != null ) {
                esq = esq.retirar(valor);
            }else {
                return null;
            }
        }else {
            if (dir != null ) {
                dir = dir.retirar ( valor );
            }else {
                return null;
            }
        }
        return this;

    }

    public int buscar_maior_valor() {
        if( dir == null) {
            return info;
        }else {
            return dir.buscar_maior_valor();
        }
    }
}