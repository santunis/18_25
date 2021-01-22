package br.com.facil.dezoito.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.pares.RNP07;

public class Combinacoes1525 {
	
//	List<String> lista1525 = gerar1525();
//	System.out.println("TOTAL DE LINHAS 1525: " + lista1525.size());
//	List<String> lista1525NaoSaiu = new ArrayList<String>();
//	for (String lista : lista1525) {
//		String[] linha = lista.split(",");
//		if (!jaSaiu(linha)) {
//			lista1525NaoSaiu.add(lista);
//		}
//	}
//	System.out.println("TOTAL DE LINHAS 1525 NAO SAIU: " + lista1525NaoSaiu.size());
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 = 3268760
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1525() {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			lista1525.add(lista);
		}
		
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07() throws LotoException {
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			int[] saidaInt = new int[saida.length];
			for (int i = 0; i < saida.length; i++) {
				saidaInt[i] = Integer.parseInt(String.valueOf(saida[i]));
			}
			if (rnp07.aplicar(saidaInt)) {
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				lista1525.add(lista);
			}
		}
		
		return lista1525;
	}

}
