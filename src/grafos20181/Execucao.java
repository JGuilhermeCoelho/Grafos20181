package grafos20181;

/**
 * Executará os casos de teste para cada exercício
 * proposto na disciplina de Teoria dos Grafos.
 * 
 * @author Abel, José Guilherme, Mariana, Siuanny
 */
public class Execucao {

	private static final String quebraDeLinha = System.lineSeparator();
	
	private static void cabecalho() {
		System.out.println("Universidade Federal de Campina Grande" + quebraDeLinha
				+ "Disciplina: Teoria dos Grafos"  + quebraDeLinha
				+ "Professora: Patrícia Duarte de Lima Machado" + quebraDeLinha
				+ "Grupo: Abel, José Guilherme, Mariana e Siuanny" + quebraDeLinha
				+ "Exercício Prático 01 - 2018.1");
	}
	
	private static void separador() {
		System.out.println(quebraDeLinha);
	}
	
	public static void main(String[] args) {
		cabecalho();
		separador();
		MatrizIncidencia.main(args);
		separador();
		MenorCaminho.main(args);
		separador();
		EhBipartido.main(args);
	}

}
