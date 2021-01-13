package br.com.facil.resultado;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class JaSaiu {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

//		int[] jogo = { 1,2,3,4,6,9,10,12,13,14,15,17,18,19,20 };
//		int[] jogo = { 1,2,3,4,6,9,10,12,13,14,21,22,23,24,25 };
//		int[] jogo = { 1,2,3,4,6,15,17,18,19,20,21,22,23,24,25 };
		int[] jogo = { 9,10,12,13,14,15,17,18,19,20,21,22,23,24,25 };
		
		//1,3,4,6,7,8,10,11,14,15,19,20,21,22,24

		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;

		URL combinacoes = JaSaiu.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.ONZE.getValor()) {
					contonze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.DOZE.getValor()) {
					contdoze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.TREZE.getValor()) {
					conttreze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.QUATORZE.getValor()) {
					contquatorze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.QUINZE.getValor()) {
					contquinze++;
				}
			}

			System.out.println("ONZE: " + contonze);
			System.out.println("DOZE: " + contdoze);
			System.out.println("TREZE: " + conttreze);
			System.out.println("QUATROZE: " + contquatorze);
			System.out.println("QUINZE: " + contquinze);

		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	public static int comparaNumeros(String[] linhaCombinacoes, int[] jogo) {

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

		if (contJogo == NumeroEnum.ONZE.getValor()) {
			retorno = NumeroEnum.ONZE.getValor();
		}

		if (contJogo == NumeroEnum.DOZE.getValor()) {
			retorno = NumeroEnum.DOZE.getValor();
		}

		if (contJogo == NumeroEnum.TREZE.getValor()) {
			retorno = NumeroEnum.TREZE.getValor();
		}

		if (contJogo == NumeroEnum.QUATORZE.getValor()) {
			retorno = NumeroEnum.QUATORZE.getValor();
		}

		if (contJogo == NumeroEnum.QUINZE.getValor()) {
			retorno = NumeroEnum.QUINZE.getValor();
		}

		return retorno;
	}

}