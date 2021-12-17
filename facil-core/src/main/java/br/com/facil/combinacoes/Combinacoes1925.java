package br.com.facil.combinacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;
import br.com.facil.excecao.LotoException;

public class Combinacoes1925 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		Combinacoes1925 combinacoes1925 = new Combinacoes1925();
		combinacoes1925.gerar1925();
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1925 = 177100
	 * 
	 * @return List<String>
	 * @throws IOException 
	 */
	public void gerar1925() throws IOException {
		FileWriter arquivo1925 = new FileWriter("C:\\projetos\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\19_25-177100.csv");
		PrintWriter gravarArquivo1925 = new PrintWriter(arquivo1925);
		int cont = 0;
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 19);
		while (comb1.hasNext()) {
			cont++;
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
					saida[15] + "," + saida[16] + "," + saida[17] + "," + saida[18];
			gravarArquivo1925.printf("%s%n", lista);
		}
		arquivo1925.close();
		gravarArquivo1925.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 19_25: " + cont);
	}
	
	/**
	 * Metodo responsavel por gerar a lista de combinacoes 1925 = 177100
	 * 
	 * @return List<String>
	 */
	public static List<String> get1925() {
		List<String> lista1925 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 19);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
					saida[15] + "," + saida[16] + "," + saida[17] + "," + saida[18];
			lista1925.add(lista);
		}
		
		return lista1925;
	}

}
