package br.com.facil.quinze;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.pares.RNP07;
import br.com.facil.regras.pares.RNP08;

public class Principal {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		Principal principal = new Principal();
//		principal.retirarSaiu15();

		List<String> listaDados = principal.buscarDados();
		System.out.println("Total: " + listaDados.size());
		List<String> listaDadosRNP07 = principal.buscarRNP07(listaDados);
		System.out.println("Total: " + listaDadosRNP07.size());
		List<String> listaDadosRNP08 = principal.buscarRNP08(listaDados);
		System.out.println("Total: " + listaDadosRNP08.size());
		principal.retirarSaiu14(listaDadosRNP08);

//		principal.retirarSaiu13();
//		principal.maisSaiu1525RNP07();

	}
	
	@SuppressWarnings("deprecation")
	public List<String> buscarDados() throws URISyntaxException, IOException, LotoException {
		List<String> listaBuscarDados = new ArrayList<String>();
		String lista = null;
		URL combinacao = Principal.class.getClassLoader().getResource("quinze\\15-NAOSAIU-CONC2225.csv");
		if (Objects.nonNull(combinacao)) {
			Path caminho = Paths.get(combinacao.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha1525;
			while (Objects.nonNull((linha1525 = csvReader.readNext()))) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
						+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
						+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
						+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
				listaBuscarDados.add(lista);
			}
		} else {
			System.out.println("### Arquivo [15_25.csv] nao encontrado... ###");
		}
		
		return listaBuscarDados;
	}

	@SuppressWarnings("deprecation")
	public void retirarSaiu15() throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources"
				+ "\\quinze\\15_25-NAOSAIU.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		String lista = null;
		URL combinacao = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25.csv");
		if (Objects.nonNull(combinacao)) {
			Path caminho = Paths.get(combinacao.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				int[] linha1525 = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				if (!resultado15(linha1525)) {
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
							+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
							+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArqSaiu.printf("%s%n", lista);
				}
			}

			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo [15_25.csv] nao encontrado... ###");
		}
	}

	@SuppressWarnings("deprecation")
	public boolean resultado15(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
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

				if (contador == NumeroEnum.QUINZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [Resultado.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}
	
	public List<String> buscarRNP07(List<String> listaDados) throws URISyntaxException, IOException, LotoException {
		List<String> listaBuscarRNP07 = new ArrayList<String>();
		
		RNP07 rnp07 = new RNP07();
		for (String lista15 : listaDados) {
			String lista = null;
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (rnp07.aplicar(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4] + ","
						+ linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + "," + linha1525[9] + ","
						+ linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
				listaBuscarRNP07.add(lista);
			}
		}
		
		return listaBuscarRNP07;
	}
	
	public List<String> buscarRNP08(List<String> listaDados) throws URISyntaxException, IOException, LotoException {
		List<String> listaBuscarRNP08 = new ArrayList<String>();
		
		RNP08 rnp08 = new RNP08();
		for (String lista15 : listaDados) {
			String lista = null;
			String[] linha15 = lista15.split(",");
			
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			
			if (rnp08.aplicar(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4] + ","
						+ linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + "," + linha1525[9] + ","
						+ linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
				listaBuscarRNP08.add(lista);
			}
		}
		
		return listaBuscarRNP08;
	}

	public void retirarSaiu14(List<String> listaDados) throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\quinze\\14-SAIU-RNP08.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		FileWriter arqNaoSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\quinze\\14-NAOSAIU-RNP08.csv");
		PrintWriter gravarArqNaoSaiu = new PrintWriter(arqNaoSaiu);
		
		int cont = 0;
		String lista = null;
		for (String lista15 : listaDados) {
			cont++;
			String[] linha15 = lista15.split(",");
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			if (resultado14(linha1525)) {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
						+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
						+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
						+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
				gravarArqSaiu.printf("%s%n", lista);
			} else {
				lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
						+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
						+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
						+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
				gravarArqNaoSaiu.printf("%s%n", lista);
			}
			System.out.println("Contador: " + cont);
		}
		
		arqSaiu.close();
		gravarArqSaiu.close();
		arqNaoSaiu.close();
		gravarArqNaoSaiu.close();
	}

	@SuppressWarnings("deprecation")
	public boolean resultado14(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
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

				if (contador == NumeroEnum.QUATORZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [Resultado.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}

	@SuppressWarnings("deprecation")
	public void retirarSaiu13() throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter(
				"D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources" + "\\quinze\\13-SAIU.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		FileWriter arqNaoSaiu = new FileWriter(
				"D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources" + "\\quinze\\13-NAOSAIU.csv");
		PrintWriter gravarArqNaoSaiu = new PrintWriter(arqNaoSaiu);

		int cont = 0;
		String lista = null;
		URL combinacao = Principal.class.getClassLoader().getResource("quinze\\15-NAOSAIU-CONC2022.csv");
		if (Objects.nonNull(combinacao)) {
			Path caminho = Paths.get(combinacao.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				cont++;
				int[] linha1525 = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				if (resultado13(linha1525)) {
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
							+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
							+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArqSaiu.printf("%s%n", lista);
				} else {
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + ","
							+ linha1525[4] + "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + ","
							+ linha1525[8] + "," + linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArqNaoSaiu.printf("%s%n", lista);
				}
				System.out.println("Contador: " + cont);
			}

			arqSaiu.close();
			gravarArqSaiu.close();
			arqNaoSaiu.close();
			gravarArqNaoSaiu.close();
		} else {
			System.out.println("### Arquivo [15_25.csv] nao encontrado... ###");
		}
	}

	@SuppressWarnings("deprecation")
	public boolean resultado13(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {
		boolean retorno = false;
		int contador = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
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

				if (contador == NumeroEnum.TREZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### [Resultado.csv] Arquivo nao encontrado... ###");
		}

		return retorno;
	}

	@SuppressWarnings("deprecation")
	public void maisSaiu1525RNP07() throws URISyntaxException, IOException, LotoException {

		int cont = 0;
		int onze = 0;
		int doze = 0;
		int treze = 0;
		int quatorze = 0;
		int quinze = 0;
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources"
				+ "\\combinacoes\\15_25\\15_25-MAISSAIU.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

		URL combinacao = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25.csv");
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
	public static void compararResultado(PrintWriter gravarArqSaiu, int[] linha1525, int onze, int doze, int treze,
			int quatorze, int quinze) throws URISyntaxException, NumberFormatException, IOException {

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

			lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4]
					+ "," + linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
					+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + ","
					+ linha1525[13] + "," + linha1525[14] + "," + onze + "," + doze + "," + treze + "," + quatorze + ","
					+ quinze;
			gravarArqSaiu.printf("%s%n", lista);
		} else {
			System.out.println("### [Resultado1825SAIU.csv] Arquivo nao encontrado... ###");
		}
	}
}
