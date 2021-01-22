package br.com.facil.resultado;

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

public class ResultadoAcertos {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		int contLinha = 0;
		int totalAcertos = 0;

		URL resultado = ResultadoAcertos.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contLinha++;
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				
				int retorno = comparaNumeros(linha);
				
				if (retorno > NumeroEnum.ZERO.getValor()) {
					totalAcertos++;
				}
			}

			System.out.println("QUINZE: " + totalAcertos);
			System.out.println("TOTAL LINHA: " + contLinha);

		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	public static int comparaNumeros(int[] linhaCompara) throws URISyntaxException, NumberFormatException, IOException {
		
		int contJogo = 0;
		int qtdJogoSaiu = 0;
		URL resultado = ResultadoAcertos.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {

				contJogo = 0;
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linhaCompara.length; i++) {
					for (int j = 0; j < linhaResultado.length; j++) {
						if (linhaCompara[i] == linha[j]) {
							contJogo++;
						}
					}
				}
				
				if (contJogo == NumeroEnum.TREZE.getValor()) {
					qtdJogoSaiu++;
				}
			}
		} else {
			System.out.println("### [Resultado.csv] Arquivo nao encontrado... ###");
		}
		
		return qtdJogoSaiu;
	}
}
