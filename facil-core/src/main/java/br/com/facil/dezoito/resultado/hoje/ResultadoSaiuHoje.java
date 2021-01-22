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
//		URL combinacoes = ResultadoSaiuHoje.class.getClassLoader().getResource("dezoito\\fechamento\\Fechamento15_25_QUATORZE.csv");
		URL combinacoes = ResultadoSaiuHoje.class.getClassLoader().getResource("combinacoes\\Fechamento15_25_QUATORZE.csv");
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
		//jogo 2131
		int[] jogo = { 1,3,6,9,10,11,12,15,17,19,20,21,22,23,24 };
		//jogo 2131
//		int[] jogo = { 1,2,3,7,8,9,10,11,13,14,16,17,19,23,25 };
		//jogo 2130
//		int[] jogo = { 3,4,6,7,9,10,11,12,13,14,15,16,18,20,23 };
		//jogo 2129
//		int[] jogo = { 1,3,4,6,7,8,10,11,14,15,19,20,21,22,24 };
		//jogo 2128
//		int[] jogo = { 2,3,4,6,7,9,10,11,14,16,17,18,22,23,25 };
		//jogo 2127
//		int[] jogo = { 2,3,4,5,6,10,11,13,14,15,16,18,20,23,24 };
		
		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < linha.length; j++) {
				if (jogo[i] == linha[j]) {
					contJogo++;
				}
			}
		}
		
		System.out.println(contJogo);

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
