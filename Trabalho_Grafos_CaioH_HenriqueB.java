//CAIO H.
//HENRIQUE B.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Grafo {

    public static String tipoDoGrafo(int[][] matriz) {
        int n = matriz.length;
        boolean dirigido = false;
        boolean multigrafo = false;
        boolean completo = true;
        boolean nulo = true;
        boolean regular = true;
        int grauEsperado = -1;

        for (int i = 0; i < n; i++) {
            int grau = 0;
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    dirigido = true;
                }
                if (matriz[i][j] > 1) {
                    multigrafo = true;
                }
                if (i == j && matriz[i][j] > 0) {
                    multigrafo = true;
                }
                if (matriz[i][j] == 0 && i != j) {
                    completo = false;
                }
                if (matriz[i][j] != 0) {
                    nulo = false;
                }
                grau += matriz[i][j];
            }
            if (grauEsperado == -1) grauEsperado = grau;
            else if (grauEsperado != grau) regular = false;
        }

        StringBuilder tipo = new StringBuilder();
        tipo.append(dirigido ? "Dirigido" : "Não-Dirigido");
        tipo.append(multigrafo ? ", Multigrafo" : ", Simples");
        tipo.append(regular ? ", Regular" : "");
        tipo.append(completo ? ", Completo" : "");
        tipo.append(nulo ? ", Nulo" : "");

        return tipo.toString();
    }

    public static String arestasDoGrafo(int[][] matriz) {
        int n = matriz.length;
        List<String> arestas = new ArrayList<>();
        int total = 0;
        boolean dirigido = false;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (matriz[i][j] != matriz[j][i])
                    dirigido = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < matriz[i][j]; k++) {
                    if (dirigido || i < j) {
                        arestas.add("(" + i + "," + j + ")");
                        total++;
                    }
                }
            }
        }

        return "Quantidade de arestas: " + total + "\nArestas: " + arestas;
    }

    public static String grausDoVertice(int[][] matriz) {
        int n = matriz.length;
        int[] grauEntrada = new int[n];
        int[] grauSaida = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grauSaida[i] += matriz[i][j]; 
                grauEntrada[j] += matriz[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Graus dos vértices:\n");
        for (int i = 0; i < n; i++) {
            sb.append("Vértice ").append(i)
              .append(": Grau de saída = ").append(grauSaida[i])
              .append(", Grau de entrada = ").append(grauEntrada[i])
              .append("\n");
        }

        sb.append("Sequência de graus de saída: ");
        for (int g : grauSaida) sb.append(g).append(" ");
        sb.append("\nSequência de graus de entrada: ");
        for (int g : grauEntrada) sb.append(g).append(" ");

        return sb.toString();
    }

    public static String buscaEmProfundidadeRecursiva(int[][] matriz) {
        int n = matriz.length;
        boolean[] visitado = new boolean[n];
        List<Integer> ordem = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!visitado[i]) {
                dfs(i, matriz, visitado, ordem);
            }
        }

        return "Ordem de visita (DFS recursiva): " + ordem;
    }

    private static void dfs(int v, int[][] matriz, boolean[] visitado, List<Integer> ordem) {
        visitado[v] = true;
        ordem.add(v);
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[v][i] > 0 && !visitado[i]) {
                dfs(i, matriz, visitado, ordem);
            }
        }
    }

    public static String buscaEmProfundidadeIterativa(int[][] matriz) {
        int n = matriz.length;
        boolean[] visitado = new boolean[n];
        List<Integer> ordem = new ArrayList<>();
        Stack<Integer> pilha = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (!visitado[i]) {
                pilha.push(i);
                while (!pilha.isEmpty()) {
                    int v = pilha.pop();
                    if (!visitado[v]) {
                        visitado[v] = true;
                        ordem.add(v);
                        for (int j = n - 1; j >= 0; j--) {
                            if (matriz[v][j] > 0 && !visitado[j]) {
                                pilha.push(j);
                            }
                        }
                    }
                }
            }
        }

        return "Ordem de visita (DFS iterativa): " + ordem;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 0},
            {0, 1, 0, 0}
        };

        System.out.println("Tipo do Grafo: " + tipoDoGrafo(matriz));
        System.out.println(arestasDoGrafo(matriz));
        System.out.println(grausDoVertice(matriz));
        System.out.println(buscaEmProfundidadeRecursiva(matriz));
        System.out.println(buscaEmProfundidadeIterativa(matriz));
    }
}

