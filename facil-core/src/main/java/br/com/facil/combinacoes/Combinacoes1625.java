package br.com.facil.combinacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;
import br.com.facil.excecao.LotoException;

public class Combinacoes1625 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		Combinacoes1625 combinacoes1625 = new Combinacoes1625();
		combinacoes1625.gerar1625();
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1625 = 2042975
	 * 
	 * @return List<String>
	 * @throws IOException 
	 */
	public void gerar1625() throws IOException {
		FileWriter arquivo1625 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\16_25-2042975.csv");
		PrintWriter gravarArquivo1625 = new PrintWriter(arquivo1625);
		int cont = 0;
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		while (comb1.hasNext()) {
			cont++;
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
					saida[15];
			gravarArquivo1625.printf("%s%n", lista);
		}
		arquivo1625.close();
		gravarArquivo1625.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 16_25: " + cont);
	}
	
	/**
	 * Metodo responsavel por gerar a lista de combinacoes 1625 = 2042975
	 * 
	 * @return List<String>
	 */
	public static List<String> get1625() {
		List<String> lista1625 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 16);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
					saida[15];
			lista1625.add(lista);
		}
		
		return lista1625;
	}

}
