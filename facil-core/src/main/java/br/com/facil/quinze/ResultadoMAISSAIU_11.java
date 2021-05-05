package br.com.facil.quinze;

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

public class ResultadoMAISSAIU_11 {


	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		int onze = 0;
		int doze = 0;
		int treze = 0;
		int quatorze = 0;
		int quinze = 0;
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources"
				+ "\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_SEIS-71760-MAISSAIU.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		URL combinacao = ResultadoMAISSAIU_11.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_SEIS-71760.csv");
		if (Objects.nonNull(combinacao)) {
			
			Path caminho = Paths.get(combinacao.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				onze = 0;
				doze = 0;
				treze = 0;
				quatorze = 0;
				quinze = 0;
				int[] linha1525 = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				compararResultado(gravarArqSaiu, linha1525, onze, doze, treze, quatorze, quinze);
				System.out.println(cont++);
			}
			
			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	@SuppressWarnings({ "deprecation" })
	public static void compararResultado(PrintWriter gravarArqSaiu, int[] linha1525, 	int onze, int doze, int treze, int quatorze, int quinze) throws URISyntaxException, NumberFormatException, IOException {

		int contador = 0;
		URL resultado = ResultadoMAISSAIU_11.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			String lista = null;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {

				contador = 0;
				int[] resultado1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					resultado1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < resultado1525.length; j++) {
						if (linha1525[i] == resultado1525[j]) {
							contador++;
						}
					}
				}
				
				if (contador == NumeroEnum.ONZE.getValor()) {
					onze++;
				} else if (contador == NumeroEnum.DOZE.getValor()) {
					doze++;
				} else if (contador == NumeroEnum.TREZE.getValor()) {
					treze++;
				} else if (contador == NumeroEnum.QUATORZE.getValor()) {
					quatorze++;
				} else if (contador == NumeroEnum.QUINZE.getValor()) {
					quinze++;
				}
			}
			
			lista = linha1525[0]+","+linha1525[1]+","+linha1525[2]+","+linha1525[3]+","+linha1525[4]+","+
					linha1525[5]+","+linha1525[6]+","+linha1525[7]+","+linha1525[8]+","+linha1525[9]+","+
					linha1525[10]+","+linha1525[11]+","+linha1525[12]+","+linha1525[13]+","+linha1525[14]+","+
					onze+","+doze+","+treze+","+quatorze+","+quinze;
			gravarArqSaiu.printf("%s%n", lista);
		} else {
			System.out.println("### [Resultado1825SAIU.csv] Arquivo nao encontrado... ###");
		}
	}






}
