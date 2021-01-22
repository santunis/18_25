package br.com.facil.resultado;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.excecao.LotoException;
import br.com.facil.regras.pares.RNP02;
import br.com.facil.regras.pares.RNP03;
import br.com.facil.regras.pares.RNP04;
import br.com.facil.regras.pares.RNP05;
import br.com.facil.regras.pares.RNP06;
import br.com.facil.regras.pares.RNP07;
import br.com.facil.regras.pares.RNP08;
import br.com.facil.regras.pares.RNP09;
import br.com.facil.regras.pares.RNP10;
import br.com.facil.regras.pares.RNP11;
import br.com.facil.regras.pares.RNP12;

public class ResultadoParesImpares {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

//		FileWriter arqSaiu = new FileWriter(
//				"D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoParesImpares.csv");
//		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		URL resultadoOrdenado = ResultadoParesImpares.class.getClassLoader().getResource("resultado.csv");
		int contTotalLinhaArquivo = 0;
		RNP02 rnp02 = new RNP02();
		RNP03 rnp03 = new RNP03();
		RNP04 rnp04 = new RNP04();
		RNP05 rnp05 = new RNP05();
		RNP06 rnp06 = new RNP06();
		RNP07 rnp07 = new RNP07();
		RNP08 rnp08 = new RNP08();
		RNP09 rnp09 = new RNP09();
		RNP10 rnp10 = new RNP10();
		RNP11 rnp11 = new RNP11();
		RNP12 rnp12 = new RNP12();

		int cont02 = 0;
		int cont03 = 0;
		int cont04 = 0;
		int cont05 = 0;
		int cont06 = 0;
		int cont07 = 0;
		int cont08 = 0;
		int cont09 = 0;
		int cont10 = 0;
		int cont11 = 0;
		int cont12 = 0;

		if (Objects.nonNull(resultadoOrdenado)) {

			Path caminho = Paths.get(resultadoOrdenado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha15;
			while (Objects.nonNull((linha15 = csvReader.readNext()))) {
				contTotalLinhaArquivo++;
				int[] linha = new int[linha15.length];
				for (int i = 0; i < linha15.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linha15[i]));
				}
				
				if (rnp02.aplicar(linha)) {
					cont02++;
				} else if (rnp03.aplicar(linha)) {
					cont03++;
				} else if (rnp04.aplicar(linha)) {
					cont04++;
				} else if (rnp05.aplicar(linha)) {
					cont05++;
				} else if (rnp06.aplicar(linha)) {
					cont06++;
				} else if (rnp07.aplicar(linha)) {
					cont07++;
				} else if (rnp08.aplicar(linha)) {
					cont08++;
				} else if (rnp09.aplicar(linha)) {
					cont09++;
				} else if (rnp10.aplicar(linha)) {
					cont10++;
				} else if (rnp11.aplicar(linha)) {
					cont11++;
				} else if (rnp12.aplicar(linha)) {
					cont12++;
				} else {
					System.out.println("#### FUDEU... ####");
				}
			}
			
			System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
//			gravarArqSaiu.printf("%s%n", "TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
			System.out.println("TOTAL RNP02: " + cont02);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP02: " + cont02);
			System.out.println("TOTAL RNP03: " + cont03);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP03: " + cont03);
			System.out.println("TOTAL RNP04: " + cont04);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP04: " + cont04);
			System.out.println("TOTAL RNP05: " + cont05);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP05: " + cont05);
			System.out.println("TOTAL RNP06: " + cont06);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP06: " + cont06);
			System.out.println("TOTAL RNP07: " + cont07);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP07: " + cont07);
			System.out.println("TOTAL RNP08: " + cont08);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP08: " + cont08);
			System.out.println("TOTAL RNP09: " + cont09);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP09: " + cont09);
			System.out.println("TOTAL RNP10: " + cont10);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP10: " + cont10);
			System.out.println("TOTAL RNP11: " + cont11);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP11: " + cont11);
			System.out.println("TOTAL RNP12: " + cont12);
//			gravarArqSaiu.printf("%s%n", "TOTAL RNP12: " + cont12);
			
//			arqSaiu.close();
//			gravarArqSaiu.close();
		} else {
			System.out.println("#### Arquivo nao encontrado... ####");
		}
	}
}
