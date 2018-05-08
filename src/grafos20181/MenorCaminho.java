package grafos20181;

import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

/**
 * Determinará o menor caminho com base no grafo dado como teste.
 * 
 * @author Abel, José Guilherme, Mariana, Siuanny
 */
public class MenorCaminho {

	/**
	 * Define Arestas e Vértices e Peso para o Grafo Ponderado.
	 * 
	 * @return GrafoPonderado
	 */
	private static SimpleWeightedGraph<String, DefaultWeightedEdge> criaGrafo() {
		SimpleWeightedGraph<String, DefaultWeightedEdge> grafo = new SimpleWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);

		grafo.addVertex("a");
		grafo.addVertex("b");
		grafo.addVertex("c");
		grafo.addVertex("d");
		grafo.addVertex("e");
		grafo.addVertex("f");
		grafo.addVertex("g");
		grafo.addVertex("h");
		grafo.addVertex("i");

		grafo.setEdgeWeight(grafo.addEdge("a", "b"), 2);
		grafo.setEdgeWeight(grafo.addEdge("b", "c"), 4);
		grafo.setEdgeWeight(grafo.addEdge("c", "d"), 2);
		grafo.setEdgeWeight(grafo.addEdge("d", "e"), 1);
		grafo.setEdgeWeight(grafo.addEdge("e", "f"), 6);
		grafo.setEdgeWeight(grafo.addEdge("f", "a"), 7);
		grafo.setEdgeWeight(grafo.addEdge("a", "g"), 3);
		grafo.setEdgeWeight(grafo.addEdge("g", "i"), 1);
		grafo.setEdgeWeight(grafo.addEdge("g", "h"), 3);
		grafo.setEdgeWeight(grafo.addEdge("g", "b"), 6);
		grafo.setEdgeWeight(grafo.addEdge("h", "c"), 2);
		grafo.setEdgeWeight(grafo.addEdge("h", "d"), 8);
		grafo.setEdgeWeight(grafo.addEdge("h", "i"), 4);
		grafo.setEdgeWeight(grafo.addEdge("i", "f"), 5);
		grafo.setEdgeWeight(grafo.addEdge("i", "e"), 2);

		return grafo;
	}

	/**
	 * 
	 * 
	 * @param grafo
	 * @return menorCaminho (vértice "a" ao vértice "d")
	 */
	private static GraphPath<String, DefaultWeightedEdge> buscaMenorCaminho(SimpleWeightedGraph<String, DefaultWeightedEdge> grafo) {
		DijkstraShortestPath<String, DefaultWeightedEdge> caminho = new DijkstraShortestPath<String, DefaultWeightedEdge>(grafo);
		return caminho.getPath("a", "d");
	}

	/**
	 * Representação do menor caminho, o peso deste e a quantidade de arestas que possui.
	 * 
	 * @param caminho
	 */
	private static void Resposta(GraphPath<String, DefaultWeightedEdge> caminho) {
		System.out.println("Questão 2. Menor Caminho:" + System.lineSeparator());
		System.out.println("Caminho: " + caminho.toString());
		System.out.println("Peso do caminho: " + caminho.getWeight());
		System.out.println("Quantidade de arestas: " + caminho.getLength());
	}

	/**
	 * Invocação dos métodos que contrói o grafo e busca o menor caminho.
	 * Além disto, invoca o método responsável por exibir a reposta para a questão.
	 */
	public static void main(String[] args) {
		SimpleWeightedGraph<String, DefaultWeightedEdge> grafo = criaGrafo();
		GraphPath<String, DefaultWeightedEdge> caminho = buscaMenorCaminho(grafo);
		Resposta(caminho);
	}


}
