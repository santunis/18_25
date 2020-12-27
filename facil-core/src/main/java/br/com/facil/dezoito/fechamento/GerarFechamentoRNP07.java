package br.com.facil.dezoito.fechamento;

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

import br.com.facil.dezoito.frequencia.FrequenciaRNP07;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.pares.RNP07;

public class GerarFechamentoRNP07 {
	



	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

//		FileWriter arq = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\fechamento\\jogo\\GerarFechamento20-rnp07.csv");
//		PrintWriter gravarArq = new PrintWriter(arq);

		RNP07 rnp07 = new RNP07();
		int cont = 0;
		int contrnp07 = 0;
		URL resultado = FrequenciaRNP07.class.getClassLoader().getResource("fechamento\\jogo\\GerarFechamento20.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				String lista = null;
				if (rnp07.aplicar(linhaResultado)) {
					System.out.println(
					lista = linhaResultado[0] + "," + linhaResultado[1] + "," + linhaResultado[2] + "," + linhaResultado[3] + "," + linhaResultado[4] + "," + 
							linhaResultado[5] + "," + linhaResultado[6] + "," + linhaResultado[7] + "," + linhaResultado[8] + "," + linhaResultado[9] + "," + 
							linhaResultado[10] + "," + linhaResultado[11] + "," + linhaResultado[12] + "," + linhaResultado[13] + "," + linhaResultado[14]
							);
//					gravarArq.printf("%s%n", lista);
					contrnp07++;
				}
			}
//            arq.close();
//            gravarArq.close();
		} else {
			System.out.println("### [resultado.csv] - Arquivo nao encontrado... ###");
		}
		System.out.println("Linha" + cont + ":" + contrnp07);
	}


}
