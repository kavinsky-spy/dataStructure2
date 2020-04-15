package arvoreB;

public class Pagina {

    short ordem;
    int[] chaves;
    Pagina[] filhas;
    short qtdChaves;
    boolean folha;
    
    public Pagina(short ordem) {
        this.ordem = ordem;
        chaves = new int[ordem*2];
        filhas = new Pagina[(ordem*2)+1];
        qtdChaves = 0;
        folha = true;
    }
}