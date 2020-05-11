package grafo;

public class GrafoDirigido {

    private int[][] adjacencias;
    private int qtdArestas;
    private int qtdVertices;

    public GrafoDirigido(int qtdVertices) {

        this.qtdArestas = 0;
        this.qtdVertices = qtdVertices;
        this.adjacencias = new int[qtdVertices][qtdVertices];
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                adjacencias[i][j] = 0;
            }
        }

    }

    public void inserirAresta(int vo, int vd, int peso) {
        if (vo >= 0 && vo < qtdVertices && vd >= 0 && vd < qtdVertices) {
            adjacencias[vo][vd] = peso;
            this.qtdArestas++;
        }
    }

    public void removerAresta(int vo, int vd, int peso) {
        if (vo >= 0 && vo < qtdVertices && vd >= 0 && vd < qtdVertices) {

            if (adjacencias[vo][vd] > 0) {
                adjacencias[vo][vd] = 0;
                this.qtdArestas--;
            }
        }
    }

    public int contarArestas() {
        return this.qtdArestas;
    }

    public void imprimir() {
        for (int i = 0; i < qtdVertices; i++) {
            String linha = " ";
            for (int j = 0; j < qtdVertices; j++) {
                linha += adjacencias[i][j] + " | ";
            }
            System.out.println(linha);
        }
    }

}