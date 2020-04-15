
// package codigo;

// public class Arvore {
    
//     NoArvore raiz;
    
//     public Arvore(){
//         raiz = null;
//     }
    
//     public void inserir( int valor ){
//         if( raiz == null )
//             raiz = new NoArvore( valor );
//         else
//             raiz.inserir( valor );
//     }
    
//     public void retirar( int valor ){
//         if( raiz != null ) raiz.retirar( valor );
//     }
    
//     public boolean buscar( int valor ){
//         return buscar_aux( raiz, valor  );
//     }
    
//     public boolean buscar_aux( NoArvore no, int valor ){
//         if( no == null ) return false;
//         if( no.info == valor ) return true;
//         if( valor < no.info )
//             return buscar_aux( no.esq, valor );
//         else
//             return buscar_aux( no.dir, valor );
//     }
    
//     public void prefixado(){
//         prefixado_aux( raiz );
//     }
    
//     public void prefixado_aux( NoArvore no ){
//         if( no == null ) return;
//         System.out.printf( "%d ", no.getValor() );
//         prefixado_aux( no.esq );
//         prefixado_aux( no.dir );
//     }
    
//     public void infixado(){
//         infixado_aux( raiz );
//     }
    
//     public void infixado_aux( NoArvore no ){
//         if( no == null ) return;
//         infixado_aux( no.esq );
//         System.out.printf( "%d ", no.getValor() );
//         infixado_aux( no.dir );
//     }
    
//     public void posfixado(){
//         posfixado_aux( raiz );
//     }
    
//     public void posfixado_aux( NoArvore no ){
//         if( no == null ) return;
//         posfixado_aux( no.esq );
//         posfixado_aux( no.dir );
//         System.out.printf( "%d ", no.getValor() );
//     }

//     // ex 1
//     public int contaNos() {
//         return contaNos_aux(raiz);
//       }

//       public int contaNos_aux(NoArvore no) {
//         if (no == null) return 0;
//         return contaNos_aux(no.esq) + contaNos_aux(no.dir) + 1;

//       }

//       // ex 2

//       public int contaNosNaoFolha() {
//           return contaNosNaoFolha_aux(raiz);
//       }

//       public int contaNosNaoFolha_aux(NoArvore no) {
//           if (no == null) return 0;
//           int total = contaNosNaoFolha_aux(no.esq) + contaNosNaoFolha_aux(no.dir);
//           return ((total != 0 ) ? 1 : total);
//       }

//       // ex 3

//       public int contaNosFolha() {
//         return contaNosFolha_aux(raiz);
//     }

//     public int contaNosFolha_aux(NoArvore no) {
//         if (no == null) return 0;
//         if (no.esq == null && no.dir == null ) return 1;
//         return contaNosFolha_aux(no.esq) + contaNosFolha_aux(no.dir);
//     }

//     // ex 4 

//     public int altura() {
//         return altura_aux(raiz);
//     }

//     public int altura_aux(NoArvore no) {
//         if (no == null) return 0;
//         int altEsq = altura_aux(no.esq);
//         int altDir = altura_aux(no.dir);
//         if (altEsq > altDir) {
//             return altEsq + 1;
//         }
//         return altDir + 1;
//     }

//     // ex 11



//     public boolean ehBinaria() {
//         return ehBinaria_aux(raiz);
//     }

//     public boolean ehBinaria_aux(NoArvore no) {
//         if (no == null || (no.esq == null && no.dir == null)) return true;

//         boolean ehBinaria = (no.esq == null || (no.getValor() > no.esq.getValor())) && (no.dir == null || (no.getValor() < no.dir.getValor()  
//         return ehBinaria(no.esq) && ehBinaria(no.dir) && ehBinaria;
        
//     }

//     public 

//     public NoArvore espelho_aux(NoArvore no) {
//         if (no == null ) return null;

//         NoArvore temp = espelho_aux(no.esq);
//         no.esq = espelho_aux(no.dir);
//         no.dir = temp;

//         return no;
//     }
// }

