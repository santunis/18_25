package br.com.facil.dezoito.resultado;

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

public class ResultadoFechamentoMAISSAIU {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\hoje\\ResultadoSaiuHojeQUATORZEMAISSAIU.csv");
//		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources"
				+ "\\combinacoes\\15_25\\89_1416-MAISSAIU.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		int cont = 0;
		URL combinacao1825 = ResultadoFechamentoMAISSAIU.class.getClassLoader().getResource("combinacoes\\15_25\\89_1416.csv");
		if (Objects.nonNull(combinacao1825)) {
			
			Path caminho = Paths.get(combinacao1825.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacao;
			while (Objects.nonNull((linhaCombinacao = csvReader.readNext()))) {

				int[] linhaCombinacao1825 = new int[linhaCombinacao.length];
				for (int i = 0; i < linhaCombinacao.length; i++) {
					linhaCombinacao1825[i] = Integer.parseInt(String.valueOf(linhaCombinacao[i]));
				}

				String lista = null;
				int retorno = Resultado1825SAIU(linhaCombinacao1825);
				if (retorno > NumeroEnum.ZERO.getValor()) {
					System.out.println(
					lista = linhaCombinacao1825[0] + "," + linhaCombinacao1825[1] + "," + linhaCombinacao1825[2] + "," + linhaCombinacao1825[3] + ","
							+ linhaCombinacao1825[4] + "," + linhaCombinacao1825[5] + "," + linhaCombinacao1825[6] + "," + linhaCombinacao1825[7] + ","
							+ linhaCombinacao1825[8] + "," + linhaCombinacao1825[9] + "," + linhaCombinacao1825[10] + "," + linhaCombinacao1825[11] + ","
							+ linhaCombinacao1825[12] + "," + linhaCombinacao1825[13] + "," + linhaCombinacao1825[14] + "," + linhaCombinacao1825[15] + ","
							+ linhaCombinacao1825[16] + "," + linhaCombinacao1825[17] + "," + linhaCombinacao1825[18] + "," + linhaCombinacao1825[19] + ","
							+ linhaCombinacao1825[20] + "," + linhaCombinacao1825[21] + "," + retorno
					);
					gravarArqSaiu.printf("%s%n", lista);
				}
				
				System.out.println(cont++);
			}
			
			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	@SuppressWarnings({ "deprecation" })
	public static int Resultado1825SAIU(int[] linhaCombinacao1825) throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int qtdJogoSaiu = 0;
		URL resultado1825SAIU = ResultadoFechamentoMAISSAIU.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado1825SAIU)) {
			
			Path caminho = Paths.get(resultado1825SAIU.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado1825SAIU;
			while (Objects.nonNull((linhaResultado1825SAIU = csvReader.readNext()))) {

				contJogo = 0;
				int[] linhaResultado = new int[linhaResultado1825SAIU.length];
				for (int i = 0; i < linhaResultado1825SAIU.length; i++) {
					linhaResultado[i] = Integer.parseInt(String.valueOf(linhaResultado1825SAIU[i]));
				}

				for (int i = 0; i < linhaResultado.length; i++) {
					for (int j = 0; j < linhaCombinacao1825.length; j++) {
						if (linhaResultado[i] == linhaCombinacao1825[j]) {
							contJogo++;
						}
					}
				}
				
				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					qtdJogoSaiu++;
				}
			}
		} else {
			System.out.println("### [Resultado1825SAIU.csv] Arquivo nao encontrado... ###");
		}
		
		return qtdJogoSaiu;
	}




}
