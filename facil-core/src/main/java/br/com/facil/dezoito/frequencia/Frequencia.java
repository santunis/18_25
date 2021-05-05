package br.com.facil.dezoito.frequencia;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class Frequencia {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

//		FileWriter arq = new FileWriter("D:\\projetos_loto\\loto\\loto-core\\src\\main\\resources\\quinze\\regras\\rnp07\\foco\\Numeros1825quemaissaiu.csv");
//		PrintWriter gravarArq = new PrintWriter(arq);

		int cont = 0;
		URL numeros1_25 = Frequencia.class.getClassLoader().getResource("numeros1_25.csv");
		if (Objects.nonNull(numeros1_25)) {
			Path caminho = Paths.get(numeros1_25.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaNumeros1_25;
			while (Objects.nonNull((linhaNumeros1_25 = csvReader.readNext()))) {
				cont++;
				int[] linhaNumeros1_25Nova = new int[linhaNumeros1_25.length];
				for (int i = 0; i < linhaNumeros1_25.length; i++) {
					linhaNumeros1_25Nova[i] = Integer.parseInt(String.valueOf(linhaNumeros1_25[i]));
				}

				int retorno = resultado(linhaNumeros1_25Nova, cont);
				System.out.println("Nao sau numero: " + cont + ": " + retorno);
			}
//            arq.close();
//            gravarArq.close();
		} else {
			System.out.println("### [numeros1_25.csv] - Arquivo nao encontrado... ###");
		}
	}

	@SuppressWarnings({ "deprecation" })
	public static int resultado(int[] linhaNumeros1_25Nova, int cont)
			throws URISyntaxException, NumberFormatException, IOException {

		int saiu = 0;
		int saiusim = 0;
		int naosaiu = 0;
		URL resultado = Frequencia.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {

			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				saiu = 0;
				int[] linhaResultadoNova = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linhaResultadoNova[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linhaNumeros1_25Nova.length; i++) {
					for (int j = 0; j < linhaResultadoNova.length; j++) {
						if (linhaNumeros1_25Nova[i] == linhaResultadoNova[j]) {
							saiu++;
						}
					}
				}

				if (saiu == NumeroEnum.UM.getValor()) {
					saiusim++;
					naosaiu = 0;
				} else {
					naosaiu++;
					saiusim = 0;
				}
			}
		} else {
			System.out.println("### [resultado.csv] - Arquivo nao encontrado... ###");
		}
		System.out.println("Saiu Numero: " + cont + ": " + saiusim);
		return naosaiu;
	}
}
