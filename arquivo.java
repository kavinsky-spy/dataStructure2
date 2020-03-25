
// public class arquivo {

//     class NoArvore {

//         char info;
//         NoArvore esq, dir;

//         public NoArvore(NoArvore e, char i, NoArvore d) {
//             char info = i;
//             NoArvore esq = e;
//             NoArvore dir = d;

//         }

//         public void Prefixo(NoArvore raiz) {
//             if (raiz == null)
//                 return;
//             System.out.println(" " + raiz.info);

//             Prefixo(raiz.esq);
//             Prefixo(raiz.dir);
//         }

//     }

//     public static void main(String[] args) {
//         NoArvore n1 = new NoArvore(null, 'A', null);
//         NoArvore n2 = new NoArvore(null, 'C', null);
//         NoArvore n3 = new NoArvore(null, 'F', null);
//         NoArvore n4 = new NoArvore(n1, 'E', n2);
//         NoArvore n5 = new NoArvore(null, 'D', n3);
//         NoArvore raiz = new NoArvore(n4, 'B', n5);

//         raiz.Prefixo(raiz);

//     }

// }