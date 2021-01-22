package br.com.facil.dezoito.resultado.hoje;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.Combinacoes;
import br.com.facil.dezoito.resultado.Resultado1825;
import br.com.facil.enumerador.NumeroEnum;

public class Resultado1825Hoje {

	public static void main(String[] args) throws NumberFormatException, URISyntaxException, IOException {

		int contJogo = 0;
		int[] resultadoHoje = { 2, 4, 6, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 21, 23 };
		List<String> resultado120 = combinacoes1825(resultadoHoje);
		System.out.println("Resultado Combinacoes: " + resultado120.size());
		for (String linha : resultado120) {
			String[] retorno = linha.split(",");
			List<String[]> resultado816 = fechamento14(retorno);
			System.out.println("Resultado Fechamento: " + resultado816.size());
			for (String[] nova : resultado816) {
				int[] linha15 = new int[nova.length];
				for (int i = 0; i < nova.length; i++) {
					linha15[i] = Integer.parseInt(String.valueOf(nova[i]));
				}

				contJogo = 0;
				for (int i = 0; i < resultadoHoje.length; i++) {
					for (int j = 0; j < linha15.length; j++) {
						if (resultadoHoje[i] == linha15[j]) {
							contJogo++;
						}
					}
				}
				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					System.out.println("BINGO!!!");
				}
				if (contJogo == NumeroEnum.QUATORZE.getValor()) {
					System.out.println("QUATORZE");
				}
			}
		}

	}

	@SuppressWarnings({ "deprecation" })
	public static List<String> combinacoes1825(int[] linhaResultado)
			throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		List<String> listaResultado1825 = new ArrayList<String>();
		URL combinacoes1825 = Resultado1825.class.getClassLoader().getResource("combinacoes\\18_25.csv");
		if (Objects.nonNull(combinacoes1825)) {

			Path caminho = Paths.get(combinacoes1825.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacoes1825;
			while (Objects.nonNull((linhaCombinacoes1825 = csvReader.readNext()))) {

				contJogo = 0;
				int[] linha1825 = new int[linhaCombinacoes1825.length];
				for (int i = 0; i < linhaCombinacoes1825.length; i++) {
					linha1825[i] = Integer.parseInt(String.valueOf(linhaCombinacoes1825[i]));
				}

				for (int i = 0; i < linhaResultado.length; i++) {
					for (int j = 0; j < linha1825.length; j++) {
						if (linhaResultado[i] == linha1825[j]) {
							contJogo++;
						}
					}
				}

				String lista = null;
				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					lista = linha1825[0] + "," + linha1825[1] + "," + linha1825[2] + "," + linha1825[3] + ","
							+ linha1825[4] + "," + linha1825[5] + "," + linha1825[6] + "," + linha1825[7] + ","
							+ linha1825[8] + "," + linha1825[9] + "," + linha1825[10] + "," + linha1825[11] + ","
							+ linha1825[12] + "," + linha1825[13] + "," + linha1825[14] + "," + linha1825[15] + ","
							+ linha1825[16] + "," + linha1825[17];
					listaResultado1825.add(lista);
				}
			}
		} else {
			System.out.println("### 18_25.csv Arquivo nao encontrado... ###");
		}

		return listaResultado1825;
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

	public static List<String[]> fechamento14(String[] linha) {
		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;

		int[] linhaNova = new int[linha.length];
		for (int i = 0; i < linha.length; i++) {
			linhaNova[i] = Integer.parseInt(String.valueOf(linha[i]));
		}

		List<String> listaGerarFechamento = gerarFechamento(linhaNova);
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

		return listaNumeros;
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
