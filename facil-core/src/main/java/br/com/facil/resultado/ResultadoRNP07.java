package br.com.facil.resultado;

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
import br.com.facil.regras.pares.RNP07;

public class ResultadoRNP07 {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter(
				"D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoRNP07.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		int cont = 0;
		RNP07 rnp07 = new RNP07();
		URL resultado = ResultadoRNP07.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {

			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] saida;
			while (Objects.nonNull((saida = csvReader.readNext()))) {
				String lista = null;
				if (rnp07.aplicar(saida)) {
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					gravarArqSaiu.printf("%s%n", lista);

					System.out.println(cont + " - " + saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + ","
							+ saida[4] + "," + saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + ","
							+ saida[9] + "," + saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + ","
							+ saida[14]);
					cont++;
				}
			}

			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

}
