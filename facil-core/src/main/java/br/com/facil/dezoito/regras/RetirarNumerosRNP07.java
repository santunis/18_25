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

public class RetirarNumerosRNP07 {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\regras\\RetirarNumerosRNP07.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);

		int cont = 0;
		int naoquero = 0;
		int quero = 0;
		URL resultado = RetirarNumerosRNP07.class.getClassLoader().getResource("18_25.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				cont = 0;
				naoquero = 0;
				quero = 0;
				int[] linha1825rnp07 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha1825rnp07[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				
				String lista = null;
				for (int i = 0; i < linha1825rnp07.length; i++) {
					if (linha1825rnp07[i] == NumeroEnum.CINCO.getValor() || linha1825rnp07[i] == NumeroEnum.VINTE_TRES.getValor()) {
						naoquero++;
					}
					
					if (linha1825rnp07[i] == NumeroEnum.DOZE.getValor()) {
						quero++;
					}
					
					if (linha1825rnp07[i] < NumeroEnum.DEZ.getValor()) {
						cont++;
					}
				}
				
				if (naoquero == NumeroEnum.ZERO.getValor()) {
					if (quero > NumeroEnum.ZERO.getValor()) {
						if (cont == NumeroEnum.SETE.getValor()) {
							lista = linha1825rnp07[0] + "," + linha1825rnp07[1] + "," + linha1825rnp07[2] + "," + linha1825rnp07[3] + "," + linha1825rnp07[4] + "," + 
									linha1825rnp07[5] + "," + linha1825rnp07[6] + "," + linha1825rnp07[7] + "," + linha1825rnp07[8] + "," + linha1825rnp07[9] + "," + 
									linha1825rnp07[10] + "," + linha1825rnp07[11] + "," + linha1825rnp07[12] + "," + linha1825rnp07[13] + "," + linha1825rnp07[14] + "," + 
									linha1825rnp07[15] + "," + linha1825rnp07[16] + "," + linha1825rnp07[17];
							gravarArq.printf("%s%n", lista);
						}
					}
				}
			}
			
			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}
}
