package br.com.facil.dezoito.regras;

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
import br.com.facil.regras.sequencia.RNS0105;
import br.com.facil.regras.sequencia.RNS0610;
import br.com.facil.regras.sequencia.RNS1115;
import br.com.facil.regras.sequencia.RNS1620;
import br.com.facil.regras.sequencia.RNS2125;

public class GerarNumerosMenorQueDez {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter(
				"D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\regras\\GerarNumerosMenorQueDez.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);

		int cont = 0;
		int menorquedez = 0;
		RNS0105 rns0105 = new RNS0105();
		RNS0610 rns0610 = new RNS0610();
		RNS1115 rns1115 = new RNS1115();
		RNS1620 rns1620 = new RNS1620();
		RNS2125 rns2125 = new RNS2125();
		URL resultado = GerarNumerosMenorQueDez.class.getClassLoader().getResource("18_25.csv");
		if (Objects.nonNull(resultado)) {

			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				
				cont++;
				menorquedez = 0;
				if (!rns0105.aplicar(linhaResultado) && !rns0610.aplicar(linhaResultado)
						&& !rns1115.aplicar(linhaResultado) && !rns1620.aplicar(linhaResultado)
						&& !rns2125.aplicar(linhaResultado)) {

					int[] linha1825rnp07 = new int[linhaResultado.length];
					for (int i = 0; i < linhaResultado.length; i++) {
						linha1825rnp07[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
					}

					String lista = null;
					for (int i = 0; i < linha1825rnp07.length; i++) {
						if (linha1825rnp07[i] < NumeroEnum.DEZ.getValor()) {
							menorquedez++;
						}
					}
					
					if (menorquedez == NumeroEnum.SEIS.getValor()) {
						lista = linha1825rnp07[0] + "," + linha1825rnp07[1] + "," + linha1825rnp07[2] + ","
								+ linha1825rnp07[3] + "," + linha1825rnp07[4] + "," + linha1825rnp07[5] + ","
								+ linha1825rnp07[6] + "," + linha1825rnp07[7] + "," + linha1825rnp07[8] + ","
								+ linha1825rnp07[9] + "," + linha1825rnp07[10] + "," + linha1825rnp07[11] + ","
								+ linha1825rnp07[12] + "," + linha1825rnp07[13] + "," + linha1825rnp07[14] + ","
								+ linha1825rnp07[15] + "," + linha1825rnp07[16] + "," + linha1825rnp07[17];
						gravarArq.printf("%s%n", lista);
					}
					
					System.out.println("Linha: " + cont);
				}
			}

			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

}
