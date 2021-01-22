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
import br.com.facil.regras.pares.RNP06;

public class ResultadoRNP06 {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter(
				"D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoRNP06.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		int cont = 0;
		RNP06 rnp06 = new RNP06();
		URL resultado = ResultadoRNP06.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {

			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				String lista = null;
				int[] saida = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					saida[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				
				if (rnp06.aplicar(saida)) {
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
