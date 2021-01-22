package br.com.facil.dezoito.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;

public class Combinacoes2025 {
	
	/**
	 * Metodo responsavel por gerar as combinacoes 2025 = 53130
	 * 
	 * @return List<String>
	 */
	public List<String> gerar2025() {
		List<String> lista2025 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 20);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14] + "," + 
					saida[15] + "," + saida[16] + "," + saida[17] + "," + saida[18] + "," + saida[19];
			lista2025.add(lista);
		}
		
		return lista2025;
	}

}
