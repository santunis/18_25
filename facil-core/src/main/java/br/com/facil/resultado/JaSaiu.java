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

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		JaSaiu jaSaiu = new JaSaiu();
		jaSaiu.verificarLista();
	}
	
	@SuppressWarnings("deprecation")
	public void verificarLista() throws URISyntaxException, IOException, LotoException {
		int contTotal = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;	
		
		URL resultado1525 = JaSaiu.class.getClassLoader().getResource("combinacoes\\20_25-53130\\RNP05-MAIS-SAIU.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {	
					
				contTotal++;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}
				
				comparaNumeros(linha1525, contonze, contdoze, conttreze, contquatorze, contquinze);
				if (comparaNumerosQuinze(linha1525) == NumeroEnum.QUINZE.getValor()) {
					contquinze++;
					System.out.println("Linha: " + contTotal);
				}
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}

		
		System.out.println("ONZE: " + contonze);
		System.out.println("DOZE: " + contdoze);
		System.out.println("TREZE: " + conttreze);
		System.out.println("QUATROZE: " + contquatorze);
		System.out.println("QUINZE: " + contquinze);
		System.out.println("TOTAL: " + contTotal);
	}

	@SuppressWarnings("deprecation")
	public static void comparaNumeros(int[] linha1525, int contonze, int contdoze, int conttreze, int contquatorze, int contquinze) throws URISyntaxException, IOException, LotoException {

//		int retorno = 0;
		int contJogo = 0;
		
		URL combinacoes = JaSaiu.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				contJogo = 0;
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
//					retorno = NumeroEnum.ONZE.getValor();
					contonze++;
				}

				if (contJogo == NumeroEnum.DOZE.getValor()) {
//					retorno = NumeroEnum.DOZE.getValor();
					contdoze++;
				}

				if (contJogo == NumeroEnum.TREZE.getValor()) {
//					retorno = NumeroEnum.TREZE.getValor();
					conttreze++;
				}

				if (contJogo == NumeroEnum.QUATORZE.getValor()) {
//					retorno = NumeroEnum.QUATORZE.getValor();
					contquatorze++;
				}

				if (contJogo == NumeroEnum.QUINZE.getValor()) {
//					retorno = NumeroEnum.QUINZE.getValor();
					contquinze++;
				}
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}

//		return retorno;
	}
	
	public static int comparaNumerosQuinze(int[] linha1525) throws URISyntaxException, IOException, LotoException {

		int retorno = 0;
		int contJogo = 0;
		
		URL combinacoes = JaSaiu.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				contJogo = 0;
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
