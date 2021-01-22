package br.com.facil.dezoito.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;
import br.com.facil.enumerador.NumeroEnum;

public class Fechamento {

	public List<Integer> analiseFechamento1525_Quatorze(List<String> listaFechamento1525_QUATORZE, int[] linhaResultado) {

		
		int contJogo = 0;
		int contLinha = 1;
		int contPrimo = 0;
		int contAcertos = 0;
		List<Integer> listaPrimos = new ArrayList<Integer>();
		for (String linha : listaFechamento1525_QUATORZE) {
			contJogo = 0;
			String[] linha1525 = linha.split(",");
			int[] linhaCombinacoes = new int[linha1525.length];
			for (int i = 0; i < linha1525.length; i++) {
				linhaCombinacoes[i] = Integer.parseInt(String.valueOf(linha1525[i]));
			}
			
			for (int i = 0; i < linhaResultado.length; i++) {
				for (int j = 0; j < linhaCombinacoes.length; j++) {
					if (linhaResultado[i] == linhaCombinacoes[j]) {
						contJogo++;
					}
				}
			}
			
			if (contJogo == NumeroEnum.ONZE.getValor()) {
				if (ehPrimo(contLinha)) {
					listaPrimos.add(contLinha);
					contPrimo++;
				}
				contAcertos++;
			}
			contLinha++;
		}
//		System.out.println("Total de linhas: " + contLinha);
//		System.out.println("Total de acertos: " + contAcertos);
//		System.out.println("Total de Primos: " + contPrimo);
		
		return listaPrimos;
	}
	
	private static boolean ehPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}

	public static List<String> gerarFechamento(int[] linha) {
		int[] saida;
		List<String> listaGerarFechamento = new ArrayList<String>();
		Combinacoes comb1 = new Combinacoes(linha, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + saida[5] + ","
					+ saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + saida[10] + "," + saida[11]
					+ "," + saida[12] + "," + saida[13] + "," + saida[14];
			listaGerarFechamento.add(lista);
		}

		return listaGerarFechamento;
	}

	public static void fechamento14(String[] linha) {
		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;
		int contJogo = 0;
		int[] linhaNova = new int[linha.length];
		for (int i = 0; i < linha.length; i++) {
			linhaNova[i] = Integer.parseInt(String.valueOf(linha[i]));
		}
		List<String> listaGerarFechamento = gerarFechamento(linhaNova);
		System.out.println(listaGerarFechamento.size());
		for (String retorno : listaGerarFechamento) {
			String[] retornoNovo = new String[retorno.length()];
			retornoNovo = retorno.split(",");
			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(retornoNovo);
			}

			if (compararNumeros(listaNumeros, retornoNovo)) {
				listaNumeros.add(retornoNovo);
			}

			contCombinacoes++;
		}

		System.out.println("QTD FECHAMENTO14: " + listaNumeros.size());

//		for (String[] saida : listaNumeros) {
//			System.out.println( 
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}

	}

	public static boolean compararNumeros(List<String[]> listaNumeros, String[] linhaCombinacoes) {
		boolean retorno = false;
		int contJogo = 0;
		int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
		for (int i = 0; i < linhaCombinacoes.length; i++) {
			linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
		}

		for (String[] linha : listaNumeros) {
			contJogo = 0;
			int[] linhaInteiro = new int[linha.length];
			for (int i = 0; i < linha.length; i++) {
				linhaInteiro[i] = Integer.parseInt(String.valueOf(linha[i]));
			}

			for (int i = 0; i < linhaInteiro.length; i++) {
				for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
					if (linhaInteiro[i] == linhaCombinacoesInteiro[j]) {
						contJogo++;
					}
				}
			}

			if (contJogo < NumeroEnum.QUATORZE.getValor()) {
				retorno = true;
			} else {
				retorno = false;
				break;
			}
		}

		return retorno;
	}

}
