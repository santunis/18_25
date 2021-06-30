package br.com.facil.fechamento;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import br.com.facil.Combinacoes;
import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class Fechamento {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		Fechamento fechamento = new Fechamento();
		List<String> listaFechamento1625 = fechamento.gerar1625();
		System.out.println("Lista fechamento 1625: " + listaFechamento1625.size());
		fechamento.fechamento14(listaFechamento1625);
		fechamento.fechamento13(listaFechamento1625);
		fechamento.fechamento12(listaFechamento1625);
		fechamento.fechamento11(listaFechamento1625);
		List<String> listaFechamento1725 = fechamento.gerar1725();
		System.out.println("Lista fechamento 1725: " + listaFechamento1725.size());
		fechamento.fechamento14(listaFechamento1725);
		fechamento.fechamento13(listaFechamento1725);
		fechamento.fechamento12(listaFechamento1725);
		fechamento.fechamento11(listaFechamento1725);
		List<String> listaFechamento1825 = fechamento.gerar1825();
		System.out.println("Lista fechamento 1825: " + listaFechamento1825.size());
		fechamento.fechamento14(listaFechamento1825);
		fechamento.fechamento13(listaFechamento1825);
		fechamento.fechamento12(listaFechamento1825);
		fechamento.fechamento11(listaFechamento1825);
		List<String> listaFechamento1925 = fechamento.gerar1925();
		System.out.println("Lista fechamento 1925: " + listaFechamento1925.size());
		fechamento.fechamento14(listaFechamento1925);
		fechamento.fechamento13(listaFechamento1925);
		fechamento.fechamento12(listaFechamento1925);
		fechamento.fechamento11(listaFechamento1925);
		List<String> listaFechamento2025 = fechamento.gerar2025();
		System.out.println("Lista fechamento 2025: " + listaFechamento2025.size());
		fechamento.fechamento14(listaFechamento2025);
		fechamento.fechamento13(listaFechamento2025);
		fechamento.fechamento12(listaFechamento2025);
		fechamento.fechamento11(listaFechamento2025);
		
	}
	
	public List<String> gerar1625() throws URISyntaxException, IOException, LotoException {
		List<String> lista1625 = new ArrayList<String>();
		int[] str = { 1, 3, 6, 7, 8, 10, 12, 13, 14, 16, 18, 19, 20, 22, 23, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			lista1625.add(lista);
		}
		return lista1625;
	}
	
	public List<String> gerar1725() throws URISyntaxException, IOException, LotoException {
		List<String> lista1725 = new ArrayList<String>();
		int[] str = { 1, 3, 6, 7, 8, 10, 12, 13, 14, 16, 18, 19, 20, 21, 22, 23, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			lista1725.add(lista);
		}
		return lista1725;
	}
	
	public List<String> gerar1825() throws URISyntaxException, IOException, LotoException {
		List<String> lista1825 = new ArrayList<String>();
		int[] str = { 1, 3, 6, 7, 8, 10, 11, 12, 13, 14, 16, 18, 19, 20, 21, 22, 23, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			lista1825.add(lista);
		}
		return lista1825;
	}
	
	public List<String> gerar1925() throws URISyntaxException, IOException, LotoException {
		List<String> lista1925 = new ArrayList<String>();
		int[] str = { 1, 3, 4, 6, 7, 8, 10, 11, 12, 13, 15, 16, 18, 19, 20, 21, 22, 23, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			lista1925.add(lista);
		}
		return lista1925;
	}
	
	public List<String> gerar2025() throws URISyntaxException, IOException, LotoException {
		List<String> lista2025 = new ArrayList<String>();
		int[] str = { 1, 3, 4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 22, 23, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			lista2025.add(lista);
		}
		return lista2025;
	}

	public void fechamento14(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;

		for (String lista15 : lista) {
			String[] linhaCombinacoes = lista15.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linhaCombinacoes);
			}

			if (comparaNumerosFechamento14(listaNumeros, linhaCombinacoes)) {
				listaNumeros.add(linhaCombinacoes);
			}

			contCombinacoes++;
//			System.out.println(contCombinacoes);
		}


		System.out.println("Combinacoes 14: " + contCombinacoes);
		System.out.println("Fechamentos 14: " + listaNumeros.size());
//		for (String[] saida : listaNumeros) {
//			System.out.println("Lista 14: " +
//					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
//					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
//					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
//			);
//		}
		System.out.println("FIM");
	}

	public static boolean comparaNumerosFechamento14(List<String[]> listaNumeros, String[] linhaCombinacoes) {

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
	
	public void fechamento13(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;

		for (String lista15 : lista) {
			String[] linhaCombinacoes = lista15.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linhaCombinacoes);
			}

			if (comparaNumerosFechamento13(listaNumeros, linhaCombinacoes)) {
				listaNumeros.add(linhaCombinacoes);
			}

			contCombinacoes++;
		}


		System.out.println("Combinacoes 13: " + contCombinacoes);
		System.out.println("Fechamentos 13: " + listaNumeros.size());
		for (String[] saida : listaNumeros) {
			System.out.println("Lista 13: " + 
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
			
		}
		System.out.println("FIM");
	}

	public static boolean comparaNumerosFechamento13(List<String[]> listaNumeros, String[] linhaCombinacoes) {

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

			if (contJogo < NumeroEnum.TREZE.getValor()) {
				retorno = true;
			} else {
				retorno = false;
				break;
			}
		}

		return retorno;
	}
	
	public void fechamento12(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;

		for (String lista15 : lista) {
			String[] linhaCombinacoes = lista15.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linhaCombinacoes);
			}

			if (comparaNumerosFechamento12(listaNumeros, linhaCombinacoes)) {
				listaNumeros.add(linhaCombinacoes);
			}

			contCombinacoes++;
		}


		System.out.println("Combinacoes 12: " + contCombinacoes);
		System.out.println("Fechamentos 12: " + listaNumeros.size());
		for (String[] saida : listaNumeros) {
			System.out.println("Lista 12: " + 
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("FIM");
	}

	public static boolean comparaNumerosFechamento12(List<String[]> listaNumeros, String[] linhaCombinacoes) {

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

			if (contJogo < NumeroEnum.DOZE.getValor()) {
				retorno = true;
			} else {
				retorno = false;
				break;
			}
		}

		return retorno;
	}
	
	public void fechamento11(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;

		for (String lista15 : lista) {
			String[] linhaCombinacoes = lista15.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linhaCombinacoes);
			}

			if (comparaNumerosFechamento11(listaNumeros, linhaCombinacoes)) {
				listaNumeros.add(linhaCombinacoes);
			}

			contCombinacoes++;
		}

		System.out.println("Combinacoes 11: " + contCombinacoes);
		System.out.println("Fechamentos 11: " + listaNumeros.size());
		for (String[] saida : listaNumeros) {
			System.out.println("Lista 11: " + 
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("FIM");
	}

	public static boolean comparaNumerosFechamento11(List<String[]> listaNumeros, String[] linhaCombinacoes) {

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

			if (contJogo < NumeroEnum.ONZE.getValor()) {
				retorno = true;
			} else {
				retorno = false;
				break;
			}
		}

		return retorno;
	}
}
