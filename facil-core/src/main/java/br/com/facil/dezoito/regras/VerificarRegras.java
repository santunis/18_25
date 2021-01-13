package br.com.facil.dezoito.regras;

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

public class VerificarRegras {
	


	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
//		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\regras\\VerificarRegras.csv");
//		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);

//		int cont = 0;
		URL resultado = VerificarRegras.class.getClassLoader().getResource("resultado\\ResultadoRNP07.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {

				int[] linha1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				verificarResultado(linha1525);
//				System.out.println(cont++);
			}
			
//			arqSaiu.close();
//			gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}

	@SuppressWarnings({ "deprecation" })
	public static void verificarResultado(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int contLinha = 0;
		URL combinacoes = VerificarRegras.class.getClassLoader().getResource("regras\\GerarRNP07.csv");
		if (Objects.nonNull(combinacoes)) {
			
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {

				contJogo = 0;
				contLinha++;
				int[] linha = new int[linhaCombinacoes.length];
				for (int i = 0; i < linhaCombinacoes.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linha.length; j++) {
						if (linha1525[i] == linha[j]) {
							contJogo++;
						}
					}
				}

				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					if (contLinha < NumeroEnum.CEM_MIL.getValor()) {
						System.out.println(contLinha);
					}
					return;
//					gravarArqSaiu.printf("%s%n", contLinha);
				}
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}


}
