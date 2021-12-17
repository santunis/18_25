package br.com.facil.combinacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;
import br.com.facil.excecao.LotoException;

public class Combinacoes1825 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		Combinacoes1825 combinacoes1825 = new Combinacoes1825();
		combinacoes1825.gerar1825();
	}
	

	/**
	 * Metodo responsavel por gerar as combinacoes 1825 = 480700
	 * 
	 * @return List<String>
	 * @throws IOException 
	 */
	public void gerar1825() throws IOException {
		FileWriter arquivo1825 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\18_25-480700.csv");
		PrintWriter gravarArquivo1825 = new PrintWriter(arquivo1825);
		int cont = 0;
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 18);
		while (comb1.hasNext()) {
			cont++;
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5] + ","
					+ saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + saida[10] + "," + saida[11]
					+ "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + saida[15] + "," + saida[16] + ","
					+ saida[17];
			gravarArquivo1825.printf("%s%n", lista);
		}
		arquivo1825.close();
		gravarArquivo1825.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 18_25: " + cont);
	}
	
	/**
	 * Metodo responsavel por gerar a lista de combinacoes 1825 = 480700
	 * 
	 * @return List<String>
	 */
	public List<String> get1825() {
		List<String> lista1825 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 18);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5] + ","
					+ saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + saida[10] + "," + saida[11]
					+ "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + saida[15] + "," + saida[16] + ","
					+ saida[17];
			lista1825.add(lista);
		}

		return lista1825;
	}

}
