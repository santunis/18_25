package br.com.facil.dezoito.regras.rnp08;

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

import br.com.facil.dezoito.regras.RetirarNumerosJaSaiu;
import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class RetirarNumerosRNP08JaSaiu {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\regras\\RetirarNumerosRNP08JaSaiu.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);

		int cont = 0;
		URL resultado = RetirarNumerosJaSaiu.class.getClassLoader().getResource("dezoito\\regras\\GerarRNP08.csv");
		if (Objects.nonNull(resultado)) {

			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				cont++;
				int[] linha1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				
				String lista = null;
				if (!verificarResultado(linha1525)) {
	    			lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + "," + linha1525[3] + "," + linha1525[4] + "," + 
	    					linha1525[5] + "," + linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + "," + linha1525[9] + "," + 
	    					linha1525[10] + "," + linha1525[11] + "," + linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
	    			
	    			gravarArq.printf("%s%n", lista);
				}

				System.out.println(cont);
			}
			
			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		System.out.println("FIM");
	}
	
	@SuppressWarnings({ "deprecation" })
	public static boolean verificarResultado(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {

		boolean retorno = false;
		int cont = 0;
		URL resultado = RetirarNumerosJaSaiu.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {

				cont = 0;
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linha.length; j++) {
						if (linha1525[i] == linha[j]) {
							cont++;
						}
					}
				}

				if (cont == NumeroEnum.QUINZE.getValor()) {
					retorno = true;
				}
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		return retorno;
	}

	
}
