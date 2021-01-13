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

public class Resultado2025MAISSAIU {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter(
				"D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\Resultado2025MAISSAIU.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);

		int cont = 0;
		URL combinacao2025 = Resultado2025MAISSAIU.class.getClassLoader().getResource("combinacoes\\20_25.csv");
		if (Objects.nonNull(combinacao2025)) {

			Path caminho = Paths.get(combinacao2025.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacao;
			while (Objects.nonNull((linhaCombinacao = csvReader.readNext()))) {

				int[] linhaCombinacao2025 = new int[linhaCombinacao.length];
				for (int i = 0; i < linhaCombinacao.length; i++) {
					linhaCombinacao2025[i] = Integer.parseInt(String.valueOf(linhaCombinacao[i]));
				}

				String lista = null;
				int retorno = ResultadoMAISSAIU(linhaCombinacao2025);
				if (retorno > NumeroEnum.ZERO.getValor()) {
					lista = linhaCombinacao2025[0] + "," + linhaCombinacao2025[1] + "," + linhaCombinacao2025[2] + ","
							+ linhaCombinacao2025[3] + "," + linhaCombinacao2025[4] + "," + linhaCombinacao2025[5] + ","
							+ linhaCombinacao2025[6] + "," + linhaCombinacao2025[7] + "," + linhaCombinacao2025[8] + ","
							+ linhaCombinacao2025[9] + "," + linhaCombinacao2025[10] + "," + linhaCombinacao2025[11] + "," 
							+ linhaCombinacao2025[12] + "," + linhaCombinacao2025[13] + "," + linhaCombinacao2025[14] + "," 
							+ linhaCombinacao2025[15] + "," + linhaCombinacao2025[16] + "," + linhaCombinacao2025[17] + "," 
							+ linhaCombinacao2025[18] + "," + linhaCombinacao2025[19] + "," + retorno;
					gravarArq.printf("%s%n", lista);
				}

				System.out.println(cont++);
			}

			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	@SuppressWarnings({ "deprecation" })
	public static int ResultadoMAISSAIU(int[] linhaCombinacao2025)
			throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int qtdJogoSaiu = 0;
		URL resultado = Resultado2025MAISSAIU.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {

			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {

				contJogo = 0;
				int[] linhaResultadoNova = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linhaResultadoNova[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linhaResultadoNova.length; i++) {
					for (int j = 0; j < linhaCombinacao2025.length; j++) {
						if (linhaResultadoNova[i] == linhaCombinacao2025[j]) {
							contJogo++;
						}
					}
				}

				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					qtdJogoSaiu++;
				}
			}
		} else {
			System.out.println("### [Resultado2025SAIU.csv] Arquivo nao encontrado... ###");
		}

		return qtdJogoSaiu;
	}

}
