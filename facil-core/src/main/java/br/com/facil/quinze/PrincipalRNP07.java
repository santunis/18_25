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

public class PrincipalRNP07 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		PrincipalRNP07 principalRNP07 = new PrincipalRNP07();
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
		List<String> listaCombinacoesRNP07 = combinacoes1525.gerar1525RNP07();
		System.out.println("Lista Combinacoes RNP07: " + listaCombinacoesRNP07.size());
		principalRNP07.saiu(listaCombinacoesRNP07);
		
		List<String> listaZero = principalRNP07.resultadoNumerosMenorQueDezRNP05ZERO(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes ZERO: " + listaZero.size());
		principalRNP07.saiu(listaZero);
		
		List<String> listaUm = principalRNP07.resultadoNumerosMenorQueDezRNP05UM(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes UM: " + listaUm.size());
		principalRNP07.saiu(listaUm);
		
		List<String> listaDois = principalRNP07.resultadoNumerosMenorQueDezRNP05DOIS(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes DOIS: " + listaDois.size());
		principalRNP07.saiu(listaDois);

		List<String> listaTres = principalRNP07.resultadoNumerosMenorQueDezRNP05TRES(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes TRES: " + listaTres.size());
		principalRNP07.saiu(listaTres);

		List<String> listaQuatro = principalRNP07.resultadoNumerosMenorQueDezRNP05QUATRO(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes QUATRO: " + listaQuatro.size());
		principalRNP07.saiu(listaQuatro);
//		List<String> listaFechamento = principalRNP07.fechamento14(listaQuatro);
//		System.out.println("Lista Fechamento QUATRO: " + listaFechamento.size());
//		principalRNP07.saiu(listaFechamento);

		List<String> listaCinco = principalRNP07.resultadoNumerosMenorQueDezRNP05CINCO(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes CINCO: " + listaCinco.size());
		principalRNP07.saiu(listaCinco);
//		List<String> listaFechamentoCinco = principalRNP07.fechamento14(listaCinco);
//		System.out.println("Lista Fechamento CINCO: " + listaFechamentoCinco.size());
//		principalRNP07.saiu(listaFechamentoCinco);

		List<String> listaSeis = principalRNP07.resultadoNumerosMenorQueDezRNP05SEIS(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes SEIS: " + listaSeis.size());
		principalRNP07.saiu(listaSeis);

		List<String> listaSete = principalRNP07.resultadoNumerosMenorQueDezRNP05SETE(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes SETE: " + listaSete.size());
		principalRNP07.saiu(listaSete);

		List<String> listaOito = principalRNP07.resultadoNumerosMenorQueDezRNP05OITO(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes OITO: " + listaOito.size());
		principalRNP07.saiu(listaOito);

		List<String> listaNove = principalRNP07.resultadoNumerosMenorQueDezRNP05NOVE(listaCombinacoesRNP07);
		System.out.println("Lista Combinacoes NOVE: " + listaNove.size());
		principalRNP07.saiu(listaNove);
		
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

			if (contJogo < NumeroEnum.QUATORZE.getValor()) {
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
//		int contquinze = 0;

		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");

			int[] jogo = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				jogo[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}

			URL combinacoes = PrincipalRNP05.class.getClassLoader().getResource("hoje.csv");
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
//						System.out.println("Linha: " + contLinha);
					}

//					if (comparaNumerosSaiu(linhaCombinacoes, jogo) == NumeroEnum.QUINZE.getValor()) {
//						contquinze++;
//					}
				}

//				System.out.println("ONZE: " + contonze);
//				System.out.println("DOZE: " + contdoze);
//				System.out.println("TREZE: " + conttreze);
//				if (contquatorze > NumeroEnum.ZERO.getValor()) {
//					System.out.println("QUATROZE: " + contquatorze);
//					contquatorze = 0;
//				}
//				System.out.println("QUINZE: " + contquinze);

			} else {
				System.out.println("### Arquivo nao encontrado... ###");
			}
		}

		System.out.println("QUATROZE: " + contquatorze);
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

//		if (contJogo == NumeroEnum.QUINZE.getValor()) {
//			retorno = NumeroEnum.QUINZE.getValor();
//		}

		return retorno;
	}
	
	public List<String> retirarSaiu15(List<String> listaCombinacoesRNP05) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoesRNP05) {
			String lista = null;
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (!resultadoRNP05(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
						+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
						+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
						+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
				listaRNP05.add(lista);
			}
		}
		
		return listaRNP05;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP05(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP05.class.getClassLoader().getResource("resultado\\ResultadoRNP05.csv");
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
	
	public List<String> retirarSaiu13(List<String> listaCombinacoes) throws URISyntaxException, IOException, LotoException {
		List<String> listaRNP05 = new ArrayList<String>();
		for (String lista15 : listaCombinacoes) {
			String lista = null;
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (resultadoRNP0513(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
						+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
						+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
						+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
				listaRNP05.add(lista);
			}
		}
		
		return listaRNP05;
	}

	@SuppressWarnings("deprecation")
	public boolean resultadoRNP0513(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = PrincipalRNP05.class.getClassLoader().getResource("resultado\\ResultadoRNP05.csv");
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
			System.out.println("### [ResultadoRNP05.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public void maisSaiu(List<String> listaDados) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\quinze\\RNP05-MAISSAIU.csv");
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
		URL resultado = PrincipalRNP05.class.getClassLoader().getResource("resultado.csv");
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

}
