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

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class ResultadoNumerosMenorQueDez {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter(
				"D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_CINCO.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		
		URL resultado1525 = ResultadoNumerosMenorQueDez.class.getClassLoader().getResource("resultado.csv");

		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

				String lista = null;
				if (contlinha == NumeroEnum.ZERO.getValor()) {
					zero++;
				} else if (contlinha == NumeroEnum.UM.getValor()) {
					um++;
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArq.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					nove++;
				}

			}
			
			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}

		System.out.println("LINHAS: " + cont);
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
	}

}
