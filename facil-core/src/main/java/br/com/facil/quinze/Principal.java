package br.com.facil.quinze;

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

public class Principal {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		Principal principal = new Principal();
		principal.analise15_25();
		
	}
	
	public void analise15_25() throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		int contLinha = 0;
		int contMenorDez = 0;
		int totalMenorDez = 0;
		URL combinacoes1525 = Principal.class.getClassLoader().getResource("combinacoes\\15_25.csv");
		if (Objects.nonNull(combinacoes1525)) {
			Path caminho = Paths.get(combinacoes1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				cont++;
				contMenorDez = 0;
				int[] linha = new int[linhaCombinacoes.length];
				for (int i = 0; i < linhaCombinacoes.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
				}
				
				if (linha[0] > NumeroEnum.NOVE.getValor()) {
					contLinha++;
				}
				
				for (int i = 0; i < linha.length; i++) {
					if (linha[i] < NumeroEnum.DEZ.getValor()) {
						contMenorDez++;
					}
				}
				
				if (contMenorDez == NumeroEnum.UM.getValor()) {
					totalMenorDez++;
				}
			}
		}
		
		System.out.println("Total de Linhas: " + cont);
		System.out.println("Linha > 9: " + contLinha);
		System.out.println("Um Numero menor que DEZ: " + totalMenorDez);
	}
	
	public void melhorar1525() throws URISyntaxException, IOException, LotoException {
		
		URL combinacoes1525 = Principal.class.getClassLoader().getResource("combinacoes\\15_25.csv");
		if (Objects.nonNull(combinacoes1525)) {
			Path caminho = Paths.get(combinacoes1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				
			}
		}
		
	}

}
