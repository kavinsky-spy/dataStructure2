package codigo;

public class NoArvore {
    
    NoArvore esq;
    int info;
    NoArvore dir;
    
    public NoArvore( int valor ){
        esq = dir = null;
        info = valor;
    }
    
    public int getValor(){
        return info;
    }
    
    public void inserir( int valor ){
        if( valor < info ){ // deve ser inserido na sub-árvore da esquerda
            if( esq == null )
                esq = new NoArvore( valor );
            else
                esq.inserir( valor );
        }
        else{
            if( dir == null )
                dir = new NoArvore( valor );
            else
                dir.inserir(valor);
        }
    }
    
    public NoArvore retirar( int valor ){
        if( valor == info ){ // Estou no valor a ser retirado
            if( esq == null && dir == null ){   // É no folha
                return null;
            }
            if( esq != null && dir == null ){   // Só tem o filho a esquerda
                return esq;
            }
            if( esq == null && dir != null ){   // Só tem filho a direita
                return dir;
            }
            // Tem dois filhos
            int maior = esq.buscar_maior_valor();
            info = maior;
            esq = esq.retirar( maior );
            return this;
        }
        if( valor < info ){
            if( esq != null )
                esq = esq.retirar( valor );
            else
                return null;
        }
        else{
            if( dir != null )
                dir = dir.retirar( valor );
            else
                return null;
        }
        return this;
    }
    
    public int buscar_maior_valor(){
        if( dir == null )
            return info;
        else
            return dir.buscar_maior_valor();
    }
    
}
