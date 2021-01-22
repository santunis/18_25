package br.com.facil.dezoito.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;

public class Combinacoes1825 {
	
//	Combinacoes1825 combinacoes1825 = new Combinacoes1825();
//	List<String> lista1825 = combinacoes1825.gerar1825();
//	System.out.println("TOTAL DE LINHAS 1825: " + lista1825.size());
//	for(String lista : lista1825) {
//		String[] linha = lista.split(",");
//		fechamento14(linha);
//		
//	}

	/**
	 * Metodo responsavel por gerar as combinacoes 1825 = 480700
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1825() {
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
