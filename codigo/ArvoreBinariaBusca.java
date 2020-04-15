
// package codigo;

// import java.io.*;
// import java.util.*;

// public class ArvoreBinariaBusca {


//     public static void main(String[] args) {

//         Arvore raiz = new Arvore();
//         int opcao = 0, valor;
//         Scanner sc = new Scanner( System.in );
        
//         while( opcao != 10 ){
            
//             switch( opcao ){
//                 case 1 : 
//                         System.out.println( "Entre com o valor a inserir: " );
//                         valor = sc.nextInt();
//                         raiz.inserir( valor );
//                         opcao = 0;
//                         break;
//                 case 2 : 
//                         System.out.println( "Entre com o valor a retirar: " );
//                         valor = sc.nextInt();
//                         raiz.retirar( valor );
//                         opcao = 0;
//                         break;                    
//                 case 3 : 
//                         System.out.println( "Entre com o valor a buscar: " );
//                         valor = sc.nextInt();
//                         if( raiz.buscar( valor ) == true )
//                             System.out.println( "Valor encontrado" );
//                         else
//                             System.out.println( "Valor não está na árvore" );
//                         opcao = 0;
//                         break;
//                 case 4 : 
//                         System.out.println( "Caminhamento pré-fixado:  " );
//                         raiz.prefixado();
//                         opcao = 0;
//                         break;
//                 case 5 : 
//                         System.out.println( "Caminhamento infixado:  " );
//                         raiz.infixado();
//                         opcao = 0;
//                         break;
//                 case 6 : 
//                         System.out.println( "Caminhamento pós-fixado:  " );
//                         raiz.posfixado();
//                         opcao = 0;
//                         break;
//                 case 7 : 
//                         System.out.println( "Info: " );
//                         System.out.println("Conta no: " + raiz.contaNos());
//                         raiz.posfixado();
//                         opcao = 0;
//                         break;      
//                 case 8 : 
//                         System.out.println( "Info: " + raiz.contaNos());
//                         System.out.println("Conta no nao folha: " + raiz.contaNosNaoFolha());
//                         System.out.println("Conta no folha: " + raiz.contaNosFolha());
//                         System.out.println("Altura " + raiz.altura());
//                         System.out.println("E binario: " + raiz.ehBinaria());
//                         raiz.posfixado();
//                         opcao = 0;
//                         break;    
//                 case 9 :

//                         break;
//                 default : 
//                         System.out.println( "\n\nEntre com a opção ([1] inserir [2] retirar [3] buscar [4] Pré-fixado [5] Infixso [6] Pós-fixado [7] Conta-no [8] Fim?" );
//                         opcao = sc.nextInt();
//                         break;
//             }
            
//         }
       

//     }
    
// }
