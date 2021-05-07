package br.com.facil.vinte;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.combinacoes.Combinacoes2025;
import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class Principal {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		
		Principal principal = new Principal();
//		principal.maisSaiu2025();
		principal.gerar2025();

	}
	
	@SuppressWarnings("deprecation")
	public void maisSaiu2025() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources"
				+ "\\combinacoes\\20_25-MAISSAIU.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		int cont = 0;
		int quinze = 0;
		URL combinacao = Principal.class.getClassLoader().getResource("combinacoes\\20_25.csv");
		if (Objects.nonNull(combinacao)) {
			
			Path caminho = Paths.get(combinacao.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				quinze = 0;
				int[] linha2025 = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					linha2025[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				compararResultado(gravarArqSaiu, linha2025, quinze);
				System.out.println(cont++);
			}
			
			arqSaiu.close();
			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo [20_25.csv] nao encontrado... ###");
		}
	}
	
	@SuppressWarnings({ "deprecation" })
	public static void compararResultado(PrintWriter gravarArqSaiu, int[] linha2025, int quinze) throws URISyntaxException, NumberFormatException, IOException {
		
		int contador = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
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

				for (int i = 0; i < resultado1525.length; i++) {
					for (int j = 0; j < linha2025.length; j++) {
						if (resultado1525[i] == linha2025[j]) {
							contador++;
						}
					}
				}
				
				if (contador == NumeroEnum.QUINZE.getValor()) {
					quinze++;
				}
			}
			
			lista = linha2025[0]+","+linha2025[1]+","+linha2025[2]+","+linha2025[3]+","+linha2025[4]+","+
					linha2025[5]+","+linha2025[6]+","+linha2025[7]+","+linha2025[8]+","+linha2025[9]+","+
					linha2025[10]+","+linha2025[11]+","+linha2025[12]+","+linha2025[13]+","+linha2025[14]+","+
					linha2025[15]+","+linha2025[16]+","+linha2025[17]+","+linha2025[18]+","+linha2025[19]+","+quinze;
			gravarArqSaiu.printf("%s%n", lista);
		} else {
			System.out.println("### Arquivo [resultado.csv] nao encontrado... ###");
		}
	}
	
	public void gerar2025() throws URISyntaxException, IOException, LotoException {
		Combinacoes2025 combinacoes2025 = new Combinacoes2025();
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources"
				+ "\\combinacoes\\20_25-MAISSAIU-30VEZES.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		List<String> lista2025 = combinacoes2025.gerar2025();
		for (String linha : lista2025) {
			gravarArqSaiu.printf("%s%n", linha);
		}
		
		arqSaiu.close();
		gravarArqSaiu.close();
	}

}
