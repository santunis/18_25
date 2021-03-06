package br.com.facil.dezoito.resultado.hoje;

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

public class Analise {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		URL resultado1525 = Analise.class.getClassLoader().getResource("dezoito\\resultado\\hoje\\ResultadoNumerosMenorQueDez_CINCO.csv");
		
		int contnumeroUm = 0;
		int numeroUm = 0;
		int contlinha = 0;
		int zero = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {
				
				contnumeroUm = 0;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}
				
				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
						if (linha1525[0] == NumeroEnum.UM.getValor()) {
							contnumeroUm++;
						}
					}
				}
				
				if (contlinha == NumeroEnum.ZERO.getValor()) {
					zero++;
				} else if (contlinha == NumeroEnum.UM.getValor()) {
					um++;
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					nove++;
				}
				
				if (contnumeroUm > NumeroEnum.ZERO.getValor()) {
					numeroUm++;
				}
				
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		System.out.println("ZERO: " + zero);
		System.out.println("UM: " + um);
		System.out.println("DOIS: " + dois);
		System.out.println("TRES: " + tres);
		System.out.println("QUATRO: " + quatro);
		System.out.println("CINCO: " + cinco);
		System.out.println("SEIS: " + seis);
		System.out.println("SETE: " + sete);
		System.out.println("OITO: " + oito);
		System.out.println("NOVE: " + nove);
		System.out.println("Numero UM: " + numeroUm);
	}
}
