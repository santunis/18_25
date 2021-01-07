package br.com.facil.dezoito.resultado.rnp07.analise;

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

public class AnaliseResultadoRNP07 {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arq = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\regras\\GerarRNP07_CINCO.csv");
		PrintWriter gravarArq = new PrintWriter(arq);

//		int cont = 0;
		int contUM = 0;
		int contDOIS = 0;
		int contTRES = 0;
		int contQUATRO = 0;
		int contCINCO = 0;
		int contSEIS = 0;
		int contSETE = 0;
		int contOITO = 0;
		int contNOVE = 0;
		int contMenorDez = 0;
		URL resultado = AnaliseResultadoRNP07.class.getClassLoader().getResource("regras\\GerarRNP07.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				String lista = null;
				contMenorDez = 0;
				
				int[] linha1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				
				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contMenorDez++;
					}
				}
				
				if (contMenorDez == NumeroEnum.UM.getValor()) {
					contUM++;
				} else if (contMenorDez == NumeroEnum.DOIS.getValor()) {
					contDOIS++;
				} else if (contMenorDez == NumeroEnum.TRES.getValor()) {
					contTRES++;
				} else if (contMenorDez == NumeroEnum.QUATRO.getValor()) {
					contQUATRO++;
				} else if (contMenorDez == NumeroEnum.CINCO.getValor()) {
					System.out.println(
						lista = linhaResultado[0] + "," + linhaResultado[1] + "," + linhaResultado[2] + "," + linhaResultado[3] + "," + linhaResultado[4] + "," + 
								linhaResultado[5] + "," + linhaResultado[6] + "," + linhaResultado[7] + "," + linhaResultado[8] + "," + linhaResultado[9] + "," + 
								linhaResultado[10] + "," + linhaResultado[11] + "," + linhaResultado[12] + "," + linhaResultado[13] + "," + linhaResultado[14]
					);
					gravarArq.printf("%s%n", lista);
					contCINCO++;
				} else if (contMenorDez == NumeroEnum.SEIS.getValor()) {
					contSEIS++;
				} else if (contMenorDez == NumeroEnum.SETE.getValor()) {
					contSETE++;
				} else if (contMenorDez == NumeroEnum.OITO.getValor()) {
					contOITO++;
				} else if (contMenorDez == NumeroEnum.NOVE.getValor()) {
					contNOVE++;
				}
				
				// linhas igual a UM
//				if (linha1525[0] == 1) {
//					System.out.println(
//						lista = linhaResultado[0] + "," + linhaResultado[1] + "," + linhaResultado[2] + "," + linhaResultado[3] + "," + linhaResultado[4] + "," + 
//								linhaResultado[5] + "," + linhaResultado[6] + "," + linhaResultado[7] + "," + linhaResultado[8] + "," + linhaResultado[9] + "," + 
//								linhaResultado[10] + "," + linhaResultado[11] + "," + linhaResultado[12] + "," + linhaResultado[13] + "," + linhaResultado[14]
//					);
////					gravarArq.printf("%s%n", lista);
//					cont++;
//				}
			}
            arq.close();
            gravarArq.close();
		} else {
			System.out.println("### [resultado.csv] - Arquivo nao encontrado... ###");
		}
//		System.out.println("Total: " + cont);
		
		System.out.println("TotalUM: " + contUM);
		System.out.println("TotalDOIS: " + contDOIS);
		System.out.println("TotalTRES: " + contTRES);
		System.out.println("TotalQUATRO: " + contQUATRO);
		System.out.println("TotalCINCO: " + contCINCO);
		System.out.println("TotalSEIS: " + contSEIS);
		System.out.println("TotalSETE: " + contSETE);
		System.out.println("TotalOITO: " + contOITO);
		System.out.println("TotalNOVE: " + contNOVE);
	}
}
