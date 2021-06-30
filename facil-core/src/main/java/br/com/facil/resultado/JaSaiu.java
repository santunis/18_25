package br.com.facil.resultado;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class JaSaiu {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
//		JaSaiu jaSaiu = new JaSaiu();
//		jaSaiu.verificarLista(lista);
	}
	
//	public void teste() throws URISyntaxException, IOException, LotoException {
//		int contTotal = 0;
//		int contonze = 0;
//		int contdoze = 0;
//		int conttreze = 0;
//		int contquatorze = 0;
//		int contquinze = 0;
//		
//		int[] jogo = { 2,3,6,9,10,11,12,14,15,16,17,19,20,21,23 };
//		URL combinacoes = JaSaiu.class.getClassLoader().getResource("hoje.csv");
//		if (Objects.nonNull(combinacoes)) {
//			Path caminho = Paths.get(combinacoes.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//
//			String[] linhaCombinacoes;
//			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
//				contTotal++;
//				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.ONZE.getValor()) {
//					contonze++;
//				}
//
//				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.DOZE.getValor()) {
//					contdoze++;
//				}
//
//				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.TREZE.getValor()) {
//					conttreze++;
//				}
//
//				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.QUATORZE.getValor()) {
//					contquatorze++;
//				}
//
//				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.QUINZE.getValor()) {
//					contquinze++;
//				}
//			}
//
//			System.out.println("ONZE: " + contonze);
//			System.out.println("DOZE: " + contdoze);
//			System.out.println("TREZE: " + conttreze);
//			System.out.println("QUATROZE: " + contquatorze);
//			System.out.println("QUINZE: " + contquinze);
//			System.out.println("TOTAL: " + contTotal);
//
//		} else {
//			System.out.println("### Arquivo nao encontrado... ###");
//		}
//	}
	
	public void verificarLista(List<String> lista) throws URISyntaxException, IOException, LotoException {
		int contTotal = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		
		for (String lista15 : lista) {
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			contTotal++;
			if (comparaNumeros(linha1525) == NumeroEnum.ONZE.getValor()) {
				contonze++;
			}

			if (comparaNumeros(linha1525) == NumeroEnum.DOZE.getValor()) {
				contdoze++;
			}

			if (comparaNumeros(linha1525) == NumeroEnum.TREZE.getValor()) {
				conttreze++;
			}

			if (comparaNumeros(linha1525) == NumeroEnum.QUATORZE.getValor()) {
				contquatorze++;
			}

			if (comparaNumeros(linha1525) == NumeroEnum.QUINZE.getValor()) {
				contquinze++;
			}
		}
		System.out.println("ONZE: " + contonze);
		System.out.println("DOZE: " + contdoze);
		System.out.println("TREZE: " + conttreze);
		System.out.println("QUATROZE: " + contquatorze);
		System.out.println("QUINZE: " + contquinze);
		System.out.println("TOTAL: " + contTotal);
	}

	@SuppressWarnings("deprecation")
	public static int comparaNumeros(int[] linha1525) throws URISyntaxException, IOException, LotoException {

		int retorno = 0;
		int contJogo = 0;
		
		URL combinacoes = JaSaiu.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
				for (int i = 0; i < linhaCombinacoes.length; i++) {
					linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
						if (linha1525[i] == linhaCombinacoesInteiro[j]) {
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
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}

		return retorno;
	}

}
