package br.com.facil.dezoito.resultado.hoje;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class ResultadoSaiuHoje {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		int cont = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;

//		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\hoje\\ResultadoSaiuHojeONZE2132_REP.csv");
//		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		URL combinacoes = ResultadoSaiuHoje.class.getClassLoader().getResource("dezoito\\fechamento\\Fechamento15_25_QUATORZE.csv");
//		URL combinacoes = ResultadoSaiuHoje.class.getClassLoader().getResource("combinacoes\\Fechamento15_25_QUATORZE.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				cont++;
				
				int[] linha = new int[linhaCombinacoes.length];
				for (int i = 0; i < linhaCombinacoes.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
				}
				
				int retorno = comparaNumeros(linha);
				String lista = null;
				if (retorno == NumeroEnum.ONZE.getValor()) {
//					lista = linha[0]+","+linha[1]+","+linha[2]+","+linha[3]+","+linha[4]+","+
//							linha[5]+","+linha[6]+","+linha[7]+","+linha[8]+","+linha[9]+","+
//							linha[10]+","+linha[11]+","+linha[12]+","+linha[13]+","+linha[14];
//					gravarArq.printf("%s%n",  lista);
					contonze++;
				}

				if (retorno == NumeroEnum.DOZE.getValor()) {
//					gravarArq.printf("%s%n", "Linha: " + cont + " Fez DOZE pontos");
					contdoze++;
				}

				if (retorno == NumeroEnum.TREZE.getValor()) {
//					gravarArq.printf("%s%n", "Linha: " + cont + " Fez TREZE pontos");
					conttreze++;
				}

				if (retorno == NumeroEnum.QUATORZE.getValor()) {
//					gravarArq.printf("%s%n", "Linha: " + cont + " Fez QUATORZE pontos");
					contquatorze++;
				}

				if (retorno == NumeroEnum.QUINZE.getValor()) {
//					gravarArq.printf("%s%n", "Linha: " + cont + " Fez QUINZE pontos");
					contquinze++;
				}
			}

			System.out.println("ONZE: " + contonze);
			System.out.println("DOZE: " + contdoze);
			System.out.println("TREZE: " + conttreze);
			System.out.println("QUATROZE: " + contquatorze);
			System.out.println("QUINZE: " + contquinze);
			System.out.println("TOTAL: " + cont);

//			arqSaiu.close();
//			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	public static int comparaNumeros(int[] linha) {

		int retorno = 0;
		int contJogo = 0;
		//jogo 2146
		int[] jogo = { 1,2,4,6,8,9,11,13,16,17,18,19,20,21,22 };
		
		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < linha.length; j++) {
				if (jogo[i] == linha[j]) {
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
