
package codigo;

public class Arvore {
    
    NoArvore raiz;
    
    public Arvore(){
        raiz = null;
    }
    
    public void inserir( int valor ){
        if( raiz == null )
            raiz = new NoArvore( valor );
        else
            raiz.inserir( valor );
    }
    
    public void retirar( int valor ){
        if( raiz != null ) raiz.retirar( valor );
    }
    
    public boolean buscar( int valor ){
        return buscar_aux( raiz, valor  );
    }
    
    public boolean buscar_aux( NoArvore no, int valor ){
        if( no == null ) return false;
        if( no.info == valor ) return true;
        if( valor < no.info )
            return buscar_aux( no.esq, valor );
        else
            return buscar_aux( no.dir, valor );
    }
    
    public void prefixado(){
        prefixado_aux( raiz );
    }
    
    public void prefixado_aux( NoArvore no ){
        if( no == null ) return;
        System.out.printf( "%d ", no.getValor() );
        prefixado_aux( no.esq );
        prefixado_aux( no.dir );
    }
    
    public void infixado(){
        infixado_aux( raiz );
    }
    
    public void infixado_aux( NoArvore no ){
        if( no == null ) return;
        infixado_aux( no.esq );
        System.out.printf( "%d ", no.getValor() );
        infixado_aux( no.dir );
    }
    
    public void posfixado(){
        posfixado_aux( raiz );
    }
    
    public void posfixado_aux( NoArvore no ){
        if( no == null ) return;
        posfixado_aux( no.esq );
        posfixado_aux( no.dir );
        System.out.printf( "%d ", no.getValor() );
    }
}
