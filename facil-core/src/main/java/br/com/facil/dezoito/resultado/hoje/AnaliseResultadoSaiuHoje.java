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

import br.com.facil.excecao.LotoException;

public class AnaliseResultadoSaiuHoje {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\hoje\\ResultadoSaiuHoje_Repetidos.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		URL resultado1525 = AnaliseResultadoSaiuHoje.class.getClassLoader().getResource("dezoito\\resultado\\hoje\\ResultadoSaiuHoje.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				if (combinacoes1825(linha1525)) {
					System.out.println(linha1525[0]);
					gravarArq.printf("%s%n", linha1525[0]);
				}
			}
			
			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		System.out.println("FIM");
	}

	@SuppressWarnings({ "deprecation" })
	public static boolean combinacoes1825(int[] linha1525)
			throws URISyntaxException, NumberFormatException, IOException {

		boolean retorno = false;
		URL combinacoes1825 = AnaliseResultadoSaiuHoje.class.getClassLoader().getResource("dezoito\\resultado\\hoje\\ResultadoSaiuHoje1.csv");
		if (Objects.nonNull(combinacoes1825)) {
			Path caminho = Paths.get(combinacoes1825.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes1825;
			while (Objects.nonNull((linhaCombinacoes1825 = csvReader.readNext()))) {

				int[] linha1825 = new int[linhaCombinacoes1825.length];
				for (int i = 0; i < linhaCombinacoes1825.length; i++) {
					linha1825[i] = Integer.parseInt(String.valueOf(linhaCombinacoes1825[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linha1825.length; j++) {
						if (linha1525[i] == linha1825[j]) {
							retorno = true;
						}
					}
				}
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}

		return retorno;
	}
}
