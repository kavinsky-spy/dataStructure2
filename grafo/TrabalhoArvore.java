// ex 5
    int impar;
    public void buscaImpar(){
        impar=raiz.getValor();
         buscaImpar_aux( raiz );
    }
    
    public void buscaImpar_aux( NoArvore no ){
        NoArvore raizAux=no;
        while(no!= null){
           if(no.getValor()%2 != 0){
            impar=no.getValor();
            System.out.println("Foi"+impar);
            return;   
           }
           no=no.esq;
        }
        no=raizAux;
        while(no!= null){
           if(no.getValor()%2 != 0){
            impar=no.getValor();
            System.out.println("Foi"+impar);
            return;   
           }
           no=no.dir;
        }
    }
     //ex6
    int maior;
    public void buscaMaior(){
        maior=raiz.getValor();
         buscaMaior_aux( raiz );
    }
    
    public void buscaMaior_aux( NoArvore no ){
        if( no == null ) return;
        buscaMaior_aux( no.esq );
        if(maior<no.getValor())maior=no.getValor();
        buscaMaior_aux( no.dir );
    }
    
    //ex 10
    int maximo;
    public void buscaMaximo(){
        maximo=raiz.getValor();
         buscaMaximo_aux( raiz );
    }
    
    public void buscaMaximo_aux( NoArvore no ){
        if( no == null ) return;
        buscaMaior_aux( no.esq );
        if(maximo<no.getValor())maximo=no.getValor();
        buscaMaior_aux( no.dir );
    }
    //ex 13
    boolean igual=true;
    NoArvore raiz2;
    public void simetrico(){
        simetricoAux(raiz, raiz2);
    }
    public void simetricoAux(NoArvore no1, NoArvore no2){
        if( no1 == null && no2==null) return;
        simetricoAux(no1.esq,no2.esq);
        if(no1.getValor()!=no2.getValor()) igual=false;
        simetricoAux(no1.dir,no2.dir);
    }
    //ex 14
    boolean binaria=true;
    public void binaria(){
        binariaAux(raiz);
    }
    public void binariaAux(NoArvore no){
        if( no == null){
            binaria=false;
            return;
        }
        binariaAux(no.esq);
        if((no.dir== null && no.esq!=null)||(no.esq==null && no.dir!=null)) binaria=false;
        binariaAux(no.dir);
    }

}



    