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

public class ResultadoHoje {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\hoje\\ResultadoNumerosMenorQueDez_CINCO.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		URL resultado1525 = ResultadoHoje.class.getClassLoader().getResource("resultado\\ResultadoNumerosMenorQueDez_CINCO.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				combinacoes1825(linha1525, gravarArqSaiu);
			}

			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		System.out.println("FIM");
	}

	@SuppressWarnings({ "deprecation" })
	public static boolean combinacoes1825(int[] linha1525, PrintWriter gravarArqSaiu)
			throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		boolean retorno = false;
		URL combinacoes1825 = ResultadoHoje.class.getClassLoader().getResource("18_25.csv");
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

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linha1825.length; j++) {
						if (linha1525[i] == linha1825[j]) {
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
					gravarArqSaiu.printf("%s%n", lista);

				}
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}

		return retorno;
	}

}
