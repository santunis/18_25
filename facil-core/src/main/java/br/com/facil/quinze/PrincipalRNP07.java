package br.com.facil.quinze;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.combinacoes.Combinacoes1525;
import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;
import br.com.facil.fechamento.Fechamento;

public class PrincipalRNP07 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNP07 principalRNP07 = new PrincipalRNP07();
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
//		Combinacoes2025 combinacoes2025 = new Combinacoes2025();
		Fechamento fechamento = new Fechamento(); 
//		JaSaiu jaSaiu = new JaSaiu();
		
		
		List<String> listaCombinacoesRNP07 = combinacoes1525.gerar1525RNP07();
		System.out.println("Lista Combinacoes RNP07: " + listaCombinacoesRNP07.size());
//		principalRNP07.maisSaiu(listaCombinacoesRNP07);
		
		
//		principalRNP07.gravaPraMim(listaFechamento, "listaFechamento.csv");
//		System.out.println("Lista Combinacoes RNP07: " + listaCombinacoesRNP07.size());
//		principalRNP07.saiu(listaCombinacoesRNP07);
//		
		// ZERO
//		List<String> listaZero = principalRNP07.resultadoNumerosMenorQueDezRNP05ZERO(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes ZERO: " + listaZero.size());
//		principalRNP07.saiu(listaZero);
//		
		// UM
//		List<String> listaUm = principalRNP07.resultadoNumerosMenorQueDezRNP05UM(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes UM: " + listaUm.size());
//		principalRNP07.saiu(listaUm);
//		
		// DOIS
//		List<String> listaDois = principalRNP07.resultadoNumerosMenorQueDezRNP05DOIS(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes DOIS: " + listaDois.size());
//		principalRNP07.saiu(listaDois);
//
		// TRES
//		List<String> listaTres = principalRNP07.resultadoNumerosMenorQueDezRNP05TRES(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes TRES: " + listaTres.size());
//		principalRNP07.saiu(listaTres);

		// QUATRO
		List<String> listaQuatro = principalRNP07.resultadoNumerosMenorQueDezRNP05QUATRO(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes QUATRO: " + listaQuatro.size());
//		principalRNP07.saiu(listaQuatro);
		
		// Lista 14 acertos
		List<String> listaQuatorze = principalRNP07.selecionarSaiu14(listaQuatro);
		System.out.println("Lista Quatorze: " + listaQuatorze.size());
		fechamento.fechamento14(listaQuatorze);
		principalRNP07.saiu(listaQuatorze);
		
		// Lista 13 acertos
//		List<String> listaTreze = principalRNP07.selecionarSaiu13(listaQuatro);
//		System.out.println("Lista Treze: " + listaTreze.size());
//		principalRNP07.saiu(listaTreze);
//		principalRNP07.contrarNumerosNaLista(listaTreze);
//		
//		List<String> listaSemNumero25 = principalRNP07.retirarNumeroDaLista(listaQuatorze);
//		System.out.println("Lista Treze: " + listaSemNumero25.size());
		
		// fechamento
//		fechamento.fechamento11(listaSemNumero25);
		
		// maisSaiu
//		principalRNP07.maisSaiu(listaQuatro);
//		
//		
//		List<String> listaSemQuinze = principalRNP07.retirarSaiu15(listaQuatro);
//		System.out.println("Lista Combinacoes QUATRO SEM15: " + listaSemQuinze.size());
//		List<String> listaSemQuatorze = principalRNP07.retirarSaiu14(listaQuatro);
//		System.out.println("Lista Combinacoes QUATRO SEM14: " + listaSemQuatorze.size());
////		jaSaiu.verificarLista(listaSemQuatorze);
////		List<String> listaFechamento = principalRNP07.fechamento14(listaSemQuatorze);
////		jaSaiu.verificarLista(listaFechamento);
//		List<String> listaSemTreze = principalRNP07.retirarSaiu13(listaQuatro);
//		System.out.println("Lista Combinacoes QUATRO 13: " + listaSemTreze.size());
//		List<String> listaFechamento2 = principalRNP07.fechamento14(listaSemTreze);
//		System.out.println("Lista Fechamento QUATRO: " + listaFechamento2.size());
//		principalRNP07.gravaPraMim(listaFechamento2, "testando2.csv");

		// CINCO
//		List<String> listaCinco = principalRNP07.resultadoNumerosMenorQueDezRNP05CINCO(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes CINCO: " + listaCinco.size());
//		principalRNP07.saiu(listaCinco);
//		List<String> listaFechamentoCinco = principalRNP07.fechamento14(listaCinco);
//		System.out.println("Lista Fechamento CINCO: " + listaFechamentoCinco.size());
//		principalRNP07.saiu(listaFechamentoCinco);
//
		// SEIS
//		List<String> listaSeis = principalRNP07.resultadoNumerosMenorQueDezRNP05SEIS(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes SEIS: " + listaSeis.size());
//		principalRNP07.saiu(listaSeis);

		// SETE
//		List<String> listaSete = principalRNP07.resultadoNumerosMenorQueDezRNP05SETE(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes SETE: " + listaSete.size());
//		principalRNP07.saiu(listaSete);
//
		// OITO
//		List<String> listaOito = principalRNP07.resultadoNumerosMenorQueDezRNP05OITO(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes OITO: " + listaOito.size());
//		principalRNP07.saiu(listaOito);
//
		// NOVE
//		List<String> listaNove = principalRNP07.resultadoNumerosMenorQueDezRNP05NOVE(listaCombinacoesRNP07);
//		System.out.println("Lista Combinacoes NOVE: " + listaNove.size());
//		principalRNP07.saiu(listaNove);
		
//		List<String> listaRetirarSaiu15 = principalRNP05.retirarSaiu15(listaCombinacoesRNP05);
//		System.out.println("Lista Retirar Saiu 15 e 14: " + listaRetirarSaiu15.size());
//		
//		List<String> listaSaiu13 = principalRNP07.retirarSaiu13(listaCombinacoesRNP07);
//		System.out.println("Lista Saiu 13: " + listaSaiu13.size());
//		
//		principalRNP05.maisSaiu(listaCombinacoesRNP05);
	}
	
	public List<String> resultadoNumerosMenorQueDezRNP05ZERO(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.ZERO.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}
	
	public List<String> resultadoNumerosMenorQueDezRNP05UM(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.UM.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}
	
	public List<String> resultadoNumerosMenorQueDezRNP05DOIS(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.DOIS.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}

	public List<String> resultadoNumerosMenorQueDezRNP05TRES(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.TRES.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}

	public List<String> resultadoNumerosMenorQueDezRNP05QUATRO(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.QUATRO.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}

	public List<String> resultadoNumerosMenorQueDezRNP05CINCO(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.CINCO.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}

	public List<String> resultadoNumerosMenorQueDezRNP05SEIS(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.SEIS.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}

	public List<String> resultadoNumerosMenorQueDezRNP05SETE(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.SETE.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}

	public List<String> resultadoNumerosMenorQueDezRNP05OITO(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.OITO.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}

	public List<String> resultadoNumerosMenorQueDezRNP05NOVE(List<String> listaCombinacoesRNP05)
			throws URISyntaxException, IOException, LotoException {

		List<String> listaResultadoNumerosMenorQueDezRNP05 = new ArrayList<String>();

		for (String lista15 : listaCombinacoesRNP05) {
			int contlinha = 0;
			String lista = null;
			String[] linha15 = lista15.split(",");

			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
					contlinha++;
				}
			}

			if (contlinha == NumeroEnum.NOVE.getValor()) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
						+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
						+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
						+ linha1525[13] + "," + linha1525[14];
				listaResultadoNumerosMenorQueDezRNP05.add(lista);
			}
		}

		return listaResultadoNumerosMenorQueDezRNP05;
	}
	
	public List<String> fechamento14(List<String> lista) throws URISyntaxException, IOException, LotoException {

		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;
//		int contFechamento = 0;
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");

			if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
				listaNumeros.add(linha15);
			}

			if (comparaNumerosfechamento14(listaNumeros, linha15)) {
				listaNumeros.add(linha15);
			}

			contCombinacoes++;
		}

		String listaNova = null;
		List<String> listaqualquer = new ArrayList<String>();
		for (String[] linha1525 : listaNumeros) {
			listaNova = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14];
			listaqualquer.add(listaNova);
		}

		System.out.println("Numero de Combinacoes: " + contCombinacoes);
		System.out.println("Numero  de Fechamentos: " + listaNumeros.size());

		return listaqualquer;
	}
	
	public static boolean comparaNumerosfechamento14(List<String[]> listaNumeros, String[] linhaCombinacoes) {

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
	
	@SuppressWarnings("deprecation")
	public void saiu(List<String> lista) throws URISyntaxException, IOException, LotoException {
//		int contLinha = 0;
//		int contTotal = 0;
//		int contonze = 0;
//		int contdoze = 0;
//		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;

		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");

			int[] jogo = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			URL combinacoes = PrincipalRNP07.class.getClassLoader().getResource("hoje.csv");
			if (Objects.nonNull(combinacoes)) {
				Path caminho = Paths.get(combinacoes.toURI());
				CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

				String[] linhaCombinacoes;
				while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
//					contLinha++;
//					contTotal++;
//					if (comparaNumerosSaiu(linhaCombinacoes, jogo) == NumeroEnum.ONZE.getValor()) {
//						contonze++;
//					}

//					if (comparaNumerosSaiu(linhaCombinacoes, jogo) == NumeroEnum.DOZE.getValor()) {
//						contdoze++;
//					}

//					if (comparaNumerosSaiu(linhaCombinacoes, jogo) == NumeroEnum.TREZE.getValor()) {
//						conttreze++;
//					}

					if (comparaNumerosSaiu(linhaCombinacoes, jogo) == NumeroEnum.QUATORZE.getValor()) {
						contquatorze++;
					}

					if (comparaNumerosSaiu(linhaCombinacoes, jogo) == NumeroEnum.QUINZE.getValor()) {
						contquinze++;
					}
				}

//				System.out.println("ONZE: " + contonze);
//				System.out.println("DOZE: " + contdoze);
//				System.out.println("TREZE: " + conttreze);
//				System.out.println("QUATROZE: " + contquatorze);
//				System.out.println("QUINZE: " + contquinze);

			} else {
				System.out.println("### Arquivo nao encontrado... ###");
			}
		}

		System.out.println("QUATROZE: " + contquatorze);
		System.out.println("QUINZE: " + contquinze);
	}
	
	public static int comparaNumerosSaiu(String[] linhaCombinacoes, int[] jogo) {

		int retorno = 0;
		int contJogo = 0;
		int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
		for (int i = 0; i < linhaCombinacoes.length; i++) {
			linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
		}

		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
				if (jogo[i] == linhaCombinacoesInteiro[j]) {
					contJogo++;
				}
			}
		}

//		if (contJogo == NumeroEnum.ONZE.getValor()) {
//			retorno = NumeroEnum.ONZE.getValor();
//		}

//		if (contJogo == NumeroEnum.DOZE.getValor()) {
//			retorno = NumeroEnum.DOZE.getValor();
//		}

//		if (contJogo == NumeroEnum.TREZE.getValor()) {
//			retorno = NumeroEnum.TREZE.getValor();
//		}

		if (contJogo == NumeroEnum.QUATORZE.getValor()) {
			retorno = NumeroEnum.QUATORZE.getValor();
		}

		if (contJogo == NumeroEnum.QUINZE.getValor()) {
			retorno = NumeroEnum.QUINZE.getValor();
		}

		return retorno;
	}
	
	@SuppressWarnings("deprecation")
	public List<String> saiu14(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String> listaSaiu14 = new ArrayList<String>();
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");

			int[] jogo = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			URL combinacoes = PrincipalRNP07.class.getClassLoader().getResource("resultado.csv");
			if (Objects.nonNull(combinacoes)) {
				Path caminho = Paths.get(combinacoes.toURI());
				CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

				String[] linhaCombinacoes;
				while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
					if (comparaNumerosSaiu14(linhaCombinacoes, jogo) != NumeroEnum.QUATORZE.getValor()) {
						listaSaiu14.add(lista15);
					}
				}
			} else {
				System.out.println("### Arquivo nao encontrado... ###");
			}
		}
		
		return listaSaiu14;
	}
	
	public static int comparaNumerosSaiu14(String[] linhaCombinacoes, int[] jogo) {

		int retorno = 0;
		int contJogo = 0;
		int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
		for (int i = 0; i < linhaCombinacoes.length; i++) {
			linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
		}

		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
				if (jogo[i] == linhaCombinacoesInteiro[j]) {
					contJogo++;
				}
			}
		}

		if (contJogo == NumeroEnum.QUATORZE.getValor()) {
			retorno = NumeroEnum.QUATORZE.getValor();
		}

		return retorno;
	}
	
	public List<String> retirarSaiu15(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP07 = new ArrayList<String>();
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (!resultadoRetirarSaiu15(linha1525)) {
				listaRNP07.add(lista15);
			}
		}
		
		return listaRNP07;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRetirarSaiu15(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP07.class.getClassLoader().getResource("resultado\\ResultadoRNP07.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}
				
				if (contador == NumeroEnum.QUINZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP05.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> retirarSaiu14(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP07 = new ArrayList<String>();
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (!resultadoRetirarSaiu14(linha1525)) {
				listaRNP07.add(lista15);
			}
		}
		
		return listaRNP07;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRetirarSaiu14(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP07.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}
				
				if (contador == NumeroEnum.QUATORZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP07.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> retirarSaiu13(List<String> listaCombinacoes) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoes) {
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (resultadoRetirarSaiu13(linha1525)) {
				listaRNP05.add(lista15);
			}
		}
		
		return listaRNP05;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRetirarSaiu13(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP07.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}

				if (contador == NumeroEnum.TREZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP07.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public void maisSaiu(List<String> listaDados) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\quinze\\rnp07\\quatro\\RNP07-QUATRO-MAISSAIU.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		int cont = 0;
		int onze = 0;
		int doze = 0;
		int treze = 0;
		int quatorze = 0;
		int quinze = 0;
		for (String lista15 : listaDados) {
			String[] linha15 = lista15.split(",");
			onze = 0;
			doze = 0;
			treze = 0;
			quatorze = 0;
			quinze = 0;
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			compararResultado(gravarArqSaiu, linha1525, onze, doze, treze, quatorze, quinze);
			System.out.println("Contador: " + cont++);
		}
		
		arqSaiu.close();
		gravarArqSaiu.close();
	}

	@SuppressWarnings({ "deprecation" })
	public static void compararResultado(PrintWriter gravarArqSaiu, int[] linha1525, 	int onze, int doze, int treze, int quatorze, int quinze) 
			throws URISyntaxException, NumberFormatException, IOException {

		int contador = 0;
		URL resultado = PrincipalRNP07.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			String lista = null;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {

				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}
				
				if (contador == NumeroEnum.ONZE.getValor()) {
					onze++;
				} else if (contador == NumeroEnum.DOZE.getValor()) {
					doze++;
				} else if (contador == NumeroEnum.TREZE.getValor()) {
					treze++;
				} else if (contador == NumeroEnum.QUATORZE.getValor()) {
					quatorze++;
				} else if (contador == NumeroEnum.QUINZE.getValor()) {
					quinze++;
				}
			}
			
			lista = linha1525[0]+","+linha1525[1]+","+linha1525[2]+","+linha1525[3]+","+linha1525[4]+","+
					linha1525[5]+","+linha1525[6]+","+linha1525[7]+","+linha1525[8]+","+linha1525[9]+","+
					linha1525[10]+","+linha1525[11]+","+linha1525[12]+","+linha1525[13]+","+linha1525[14]+","+
					onze+","+doze+","+treze+","+quatorze+","+quinze;
			gravarArqSaiu.printf("%s%n", lista);
		} else {
			System.out.println("### [resultado.csv] Arquivo nao encontrado... ###");
		}
	}
	
	public List<String> selecionarSaiu14(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP07 = new ArrayList<String>();
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (resultadoSelecionarSaiu14(linha1525)) {
				listaRNP07.add(lista15);
			}
		}
		
		return listaRNP07;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoSelecionarSaiu14(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP07.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}
				
				if (contador == NumeroEnum.QUATORZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP07.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> selecionarSaiu13(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP07 = new ArrayList<String>();
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (resultadoSelecionarSaiu13(linha1525)) {
				listaRNP07.add(lista15);
			}
		}
		
		return listaRNP07;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoSelecionarSaiu13(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP07.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}
				
				if (contador == NumeroEnum.TREZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [ResultadoRNP07.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> retirarNumeroDaLista(List<String> lista) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP07 = new ArrayList<String>();
		boolean compara = false;
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			compara = false;
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] == NumeroEnum.VINTE_CINCO.getValor() 
						|| linha1525[i] == NumeroEnum.TREZE.getValor()
						|| linha1525[i] == NumeroEnum.SEIS.getValor()) {
					compara = true;
				}
			}
			
			if (!compara) {
				listaRNP07.add(lista15);
			}
		}
		
		return listaRNP07;
	}
	
	public void contrarNumerosNaLista(List<String> lista) throws URISyntaxException, IOException, LotoException {
		
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		int dez = 0;
		
		int onze = 0;
		int doze = 0;
		int treze = 0;
		int quatorze = 0;
		int quinze = 0;
		int dezeseis = 0;
		int dezesete = 0;
		int dezoito = 0;
		int dezenove = 0;
		int vinte = 0;
		
		int vinteum = 0;
		int vintedois = 0;
		int vintetres = 0;
		int vintequatro = 0;
		int vintecinco = 0;
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			for (int i = 0; i < linha1525.length; i++) {
				if (linha1525[i] == NumeroEnum.UM.getValor()) {
					um++;
				} else if (linha1525[i] == NumeroEnum.DOIS.getValor()) {
					dois++;
				} else if (linha1525[i] == NumeroEnum.TRES.getValor()) {
					tres++;
				} else if (linha1525[i] == NumeroEnum.QUATRO.getValor()) {
					quatro++;
				} else if (linha1525[i] == NumeroEnum.CINCO.getValor()) {
					cinco++;
				} else if (linha1525[i] == NumeroEnum.SEIS.getValor()) {
					seis++;
				} else if (linha1525[i] == NumeroEnum.SETE.getValor()) {
					sete++;
				} else if (linha1525[i] == NumeroEnum.OITO.getValor()) {
					oito++;
				} else if (linha1525[i] == NumeroEnum.NOVE.getValor()) {
					nove++;
				} else if (linha1525[i] == NumeroEnum.DEZ.getValor()) {
					dez++;
				} else if (linha1525[i] == NumeroEnum.ONZE.getValor()) {
					onze++;
				} else if (linha1525[i] == NumeroEnum.DOZE.getValor()) {
					doze++;
				} else if (linha1525[i] == NumeroEnum.TREZE.getValor()) {
					treze++;
				} else if (linha1525[i] == NumeroEnum.QUATORZE.getValor()) {
					quatorze++;
				} else if (linha1525[i] == NumeroEnum.QUINZE.getValor()) {
					quinze++;
				} else if (linha1525[i] == NumeroEnum.DEZESSEIS.getValor()) {
					dezeseis++;
				} else if (linha1525[i] == NumeroEnum.DEZESSETE.getValor()) {
					dezesete++;
				} else if (linha1525[i] == NumeroEnum.DEZOITO.getValor()) {
					dezoito++;
				} else if (linha1525[i] == NumeroEnum.DEZENOVE.getValor()) {
					dezenove++;
				} else if (linha1525[i] == NumeroEnum.VINTE.getValor()) {
					vinte++;
				} else if (linha1525[i] == NumeroEnum.VINTE_UM.getValor()) {
					vinteum++;
				} else if (linha1525[i] == NumeroEnum.VINTE_DOIS.getValor()) {
					vintedois++;
				} else if (linha1525[i] == NumeroEnum.VINTE_TRES.getValor()) {
					vintetres++;
				} else if (linha1525[i] == NumeroEnum.VINTE_QUATRO.getValor()) {
					vintequatro++;
				} else if (linha1525[i] == NumeroEnum.VINTE_CINCO.getValor()) {
					vintecinco++;
				}
			}
		}
		
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		System.out.println("DEZ: " + dez);
		System.out.println("ONZE: " + onze);
		System.out.println("DOZE: " + doze);
		System.out.println("TREZE: " + treze);
		System.out.println("QUATORZE: " + quatorze);
		System.out.println("QUINZE: " + quinze);
		System.out.println("DEZESEIS: " + dezeseis);
		System.out.println("DEZESETE: " + dezesete);
		System.out.println("DEZOITO: " + dezoito);
		System.out.println("DEZENOVE: " + dezenove);
		System.out.println("VINTE: " + vinte);
		System.out.println("VINTEUM: " + vinteum);
		System.out.println("VINTEDOIS: " + vintedois);
		System.out.println("VINTETRES: " + vintetres);
		System.out.println("VINTEQUATRO: " + vintequatro);
		System.out.println("VINTECINCO: " + vintecinco);
	}
	
	public void gravaPraMim(List<String> lista, String nomeArquivo) throws IOException {
		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\" + nomeArquivo);
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		for (String lista15 : lista) {
			gravarArquivo.printf("%s%n", lista15);
			System.out.println(lista15);
		}
		arquivo.close();
		gravarArquivo.close();
	}

}
