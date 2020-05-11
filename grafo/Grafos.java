package grafo;

public class Grafos {

    public static void main(String[] args) {
        
        GrafoDirigido gd = new GrafoDirigido(5);
        gd.inserirAresta(0, 1, 3);
        gd.inserirAresta(1, 2, 8);
        gd.inserirAresta(2, 0, 5);
        gd.inserirAresta(2, 4, 9);
        gd.inserirAresta(3, 1, 7);
        gd.inserirAresta(4, 3, 10);
        
        gd.removerAresta(0, 0, peso);

        gd.imprimir();
        System.out.println("Quantidade de arestas: " + gd.contarArestas());

    }

}