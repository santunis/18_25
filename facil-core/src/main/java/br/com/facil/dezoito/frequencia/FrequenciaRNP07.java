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
import br.com.facil.regras.pares.RNP07;

public class FrequenciaRNP07 {


	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

//		FileWriter arq = new FileWriter("D:\\projetos_loto\\loto\\loto-core\\src\\main\\resources\\quinze\\regras\\rnp07\\foco\\Numeros1825quemaissaiu.csv");
//		PrintWriter gravarArq = new PrintWriter(arq);

		RNP07 rnp07 = new RNP07();
		int cont = 0;
		int saiu = 0;
		int naosaiu = 0;
		URL resultado = FrequenciaRNP07.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				cont++;
				saiu = 0;
				
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				
				if (rnp07.aplicar(linha)) {
					saiu++;
				}
				
				if (saiu == NumeroEnum.UM.getValor()) {
					System.out.println("Linha" + cont + ": " + naosaiu);
					naosaiu = 0;
				} else {
					naosaiu++;
				}
			}
//            arq.close();
//            gravarArq.close();
		} else {
			System.out.println("### [resultado.csv] - Arquivo nao encontrado... ###");
		}
		System.out.println("Linha" + cont + ":");
	}
}
