package grafos20181;

import java.util.List;
import org.jgrapht.Graph;
import org.jgrapht.alg.cycle.PatonCycleBase;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

/**
 * Determinará com base nos grafos de teste se estes são bipartidos ou não.
 * 
 * @author Abel, José Guilherme, Mariana, Siuanny
 */
public class EhBipartido {
	
	/**
	 * O método define Vértices e Arestas do primeiro grafo dado para teste.
	 * 
	 * @return um grafo
	 */
	private static Graph<String, DefaultEdge> teste1() {
		Graph<String, DefaultEdge> graph = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		graph.addVertex("d");
		graph.addVertex("e");
		graph.addVertex("f");
		graph.addVertex("g");
		
		graph.addEdge("a", "b");
		graph.addEdge("a", "c");
		graph.addEdge("c", "d");
		graph.addEdge("b", "d");
		graph.addEdge("d", "e");
		graph.addEdge("d", "f");
		graph.addEdge("f", "g");
		graph.addEdge("e", "g");

		return graph;
	}	
	
	/**
	 * O método define Vértices e Arestas do segundo grafo dado para teste.
	 * 
	 * @return um grafo
	 */
	private static Graph<String, DefaultEdge> teste2() {
		Graph<String, DefaultEdge> graph = new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);

		graph.addVertex("a");
		graph.addVertex("b");
		graph.addVertex("c");
		graph.addVertex("d");
		graph.addVertex("e");
		graph.addVertex("f");
		
		graph.addEdge("a", "b");
		graph.addEdge("a", "c");
		graph.addEdge("b", "e");
		graph.addEdge("b", "c");
		graph.addEdge("b", "d");
		graph.addEdge("e", "f");
		graph.addEdge("e", "c");
		graph.addEdge("e", "d");
		graph.addEdge("f", "d");
		graph.addEdge("d", "c");

		return graph;
	}
	
	/**
	 * Verifica se há ciclos impares no grafo, para determinar se o grafo é ou não bipartido.
	 * 
	 * @param grafo
	 * @return uma string
	 */
	private static String analisaSeEhBipartido(Graph<String, DefaultEdge> grafo) {
		PatonCycleBase<String, DefaultEdge> base = new PatonCycleBase<String, DefaultEdge>(grafo);
		List<List<String>> circulos = base.findCycleBase();

		if ((circulos.size() % 2) == 0) {
			return "É bipartido";
		} else {
			return "Não é bipartido";
		}
		
	}

	/**
	 * Representação determinando cada grafo como sendo bipartido ou não. 
	 * 
	 * @param grafo1
	 * @param grafo2
	 */
	private static void Respostas(Graph<String, DefaultEdge> grafo1, Graph<String, DefaultEdge> grafo2) {
		System.out.println("Questão 3. Analisa se é bipartido:" + System.lineSeparator());
		System.out.println("Grafo 1 - " + analisaSeEhBipartido(grafo1));
		System.out.println("Grafo 2 - " + analisaSeEhBipartido(grafo2));
	}
	
	/**
	 * São invocados métodos para criação dos grafos que serão testados.
	 * Também é dada a resposta quanto a classificação dos grafos, podendo 
	 * ser bipartido ou não.
	 */
	public static void main(String[] args)  {
		Graph<String, DefaultEdge> grafo1 = teste1();
		Graph<String, DefaultEdge> grafo2 = teste2();
		Respostas(grafo1, grafo2);
	}
	
}
