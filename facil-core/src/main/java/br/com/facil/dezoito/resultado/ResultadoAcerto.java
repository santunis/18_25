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

public class ResultadoAcerto {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\ResultadoAcertoTREZE.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		int cont = 0;
		URL combinacao = ResultadoAcerto.class.getClassLoader().getResource("combinacoes\\15_25.csv");
		if (Objects.nonNull(combinacao)) {
			
			Path caminho = Paths.get(combinacao.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacao;
			while (Objects.nonNull((linhaCombinacao = csvReader.readNext()))) {

				int[] linha1525 = new int[linhaCombinacao.length];
				for (int i = 0; i < linhaCombinacao.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaCombinacao[i]));
				}

				String lista = null;
				int retorno = ResultadoQuantidadeAcertos(linha1525);
				if (retorno > NumeroEnum.ZERO.getValor()) {
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
							+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
							+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14] + "," + retorno;
					gravarArqSaiu.printf("%s%n", lista);
				}
				
				System.out.println(cont++);
			}
			
			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### 15_25.csv Arquivo nao encontrado... ###");
		}
	}

	@SuppressWarnings({ "deprecation" })
	public static int ResultadoQuantidadeAcertos(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int qtdJogoSaiu = 0;
		URL resultado = ResultadoFechamentoMAISSAIU.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {

				contJogo = 0;
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linhaResultado.length; j++) {
						if (linha1525[i] == linha[j]) {
							contJogo++;
						}
					}
				}
				
				if (contJogo == NumeroEnum.TREZE.getValor()) {
					qtdJogoSaiu++;
				}
			}
		} else {
			System.out.println("### [Resultado.csv] Arquivo nao encontrado... ###");
		}
		
		return qtdJogoSaiu;
	}
}
