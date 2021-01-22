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

		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\hoje\\ResultadoSaiuHojeONZE2131_REP.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		URL comparaUM = AnaliseResultadoSaiuHoje.class.getClassLoader().getResource("dezoito\\resultado\\hoje\\ResultadoSaiuHojeONZE2127.csv");
		if (Objects.nonNull(comparaUM)) {
			Path caminho = Paths.get(comparaUM.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCompara;
			while (Objects.nonNull((linhaCompara = csvReader.readNext()))) {
				int[] linha = new int[linhaCompara.length];
				for (int i = 0; i < linhaCompara.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaCompara[i]));
				}

				if (combinacoes1825(linha)) {
					System.out.println(linha[0]);
					gravarArq.printf("%s%n", linha[0]);
				}
			}
			
			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo UM nao encontrado... ###");
		}
		System.out.println("FIM");
	}

	@SuppressWarnings({ "deprecation" })
	public static boolean combinacoes1825(int[] linha) throws URISyntaxException, NumberFormatException, IOException {

		boolean retorno = false;
		URL comparaDOIS = AnaliseResultadoSaiuHoje.class.getClassLoader().getResource("dezoito\\resultado\\hoje\\ResultadoSaiuHojeONZE2131.csv");
		if (Objects.nonNull(comparaDOIS)) {
			Path caminho = Paths.get(comparaDOIS.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCompara;
			while (Objects.nonNull((linhaCompara = csvReader.readNext()))) {

				int[] linhaComparaDOIS = new int[linhaCompara.length];
				for (int i = 0; i < linhaCompara.length; i++) {
					linhaComparaDOIS[i] = Integer.parseInt(String.valueOf(linhaCompara[i]));
				}

				for (int i = 0; i < linha.length; i++) {
					for (int j = 0; j < linhaComparaDOIS.length; j++) {
						if (linha[i] == linhaComparaDOIS[j]) {
							retorno = true;
						}
					}
				}
			}
		} else {
			System.out.println("### Arquivo DOIS nao encontrado... ###");
		}

		return retorno;
	}
}
