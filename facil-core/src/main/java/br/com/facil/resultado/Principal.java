package br.com.facil.resultado;

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

import br.com.facil.enumerador.NumeroEnum;
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

public class Principal {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		Principal principal = new Principal();
		principal.resultadoParesImpares();
		
		// gerar resultado RNP06
//		principal.resultadoRNP05();
//		principal.resultadoNumerosMenorQueDezRNP05();
		
		// gerar resultado RNP06
//		principal.resultadoRNP06();
//		principal.resultadoNumerosMenorQueDezRNP06();
		
		// gerar resultado RNP07
//		principal.resultadoRNP07();
//		principal.resultadoNumerosMenorQueDezRNP07();
		
		// gerar resultado RNP08
//		principal.resultadoRNP08();
//		principal.resultadoNumerosMenorQueDezRNP08();
		
		// gerar resultado RNP09
//		principal.resultadoRNP09();
//		principal.resultadoNumerosMenorQueDezRNP09();
		
		// gerar resultado numeros menor que dez
//		principal.resultadoNumerosMenorQueDez();
		
		
		
		
		// gerar resultado fechamento quatorze
//		FileWriter arquivo = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\resultado\\GerarNumerosRNP08MenorQueDez_CINCO.csv");
//		PrintWriter gravarArquivo = new PrintWriter(arquivo);
//		URL combinacoes = Principal.class.getClassLoader().getResource("dezoito\\regras\\GerarNumerosRNP08MenorQueDez_CINCO.csv");
//		if (Objects.nonNull(combinacoes)) {
//			Path caminho = Paths.get(combinacoes.toURI());
//			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
//			String[] linha;
//			while (Objects.nonNull((linha = csvReader.readNext()))) {
//				int[] jogo = new int[linha.length];
//				for (int i = 0; i < linha.length; i++) {
//					jogo[i] = Integer.parseInt(String.valueOf(linha[i]));
//				}
//				principal.jaSaiu(jogo, gravarArquivo);
//			}
//			arquivo.close();
//			gravarArquivo.close();
//		}
//		
		principal.gerarArquivoARFF();
		
//		principal.resultadofechamentoQUATORZE();
//		
//		principal.analise15_25();
//		
//		principal.analisarRepetidosNoConcurso();
//		
//		// gerar apostas ganhadoras.
//		principal.analiseResultadoGanhador();

		System.out.println("PRINCIPAL - FIM");
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoParesImpares() throws URISyntaxException, IOException, LotoException  {
		
		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("resultado.csv");
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
		
		int contLinha = 0;

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
				
				if (linha[0] > NumeroEnum.NOVE.getValor()) {
					contLinha++;
				}
				
			}
			
			System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
			System.out.println("TOTAL RNP02: " + cont02);
			System.out.println("TOTAL RNP03: " + cont03);
			System.out.println("TOTAL RNP04: " + cont04);
			System.out.println("TOTAL RNP05: " + cont05);
			System.out.println("TOTAL RNP06: " + cont06);
			System.out.println("TOTAL RNP07: " + cont07);
			System.out.println("TOTAL RNP08: " + cont08);
			System.out.println("TOTAL RNP09: " + cont09);
			System.out.println("TOTAL RNP10: " + cont10);
			System.out.println("TOTAL RNP11: " + cont11);
			System.out.println("TOTAL RNP12: " + cont12);
			System.out.println("TOTAL >9: " + contLinha);
			
		} else {
			System.out.println("#### [resultadoParesImpares] - Arquivo nao encontrado... ####");
		}
		
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public void resultadoRNP05() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoRNP05.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		RNP05 rnp05 = new RNP05();
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				String lista = null;
				int[] saida = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					saida[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				
				if (rnp05.aplicar(saida)) {
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					gravarArquivo.printf("%s%n", lista);
					cont++;
				}
			}

			arquivo.close();
			gravarArquivo.close();
		} else {
			System.out.println("### [resultadoRNP05] - Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public void resultadoRNP06() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoRNP06.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		RNP06 rnp06 = new RNP06();
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				String lista = null;
				int[] saida = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					saida[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				
				if (rnp06.aplicar(saida)) {
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					gravarArquivo.printf("%s%n", lista);
					cont++;
				}
			}

			arquivo.close();
			gravarArquivo.close();
		} else {
			System.out.println("### [resultadoRNP06] - Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public void resultadoRNP07() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoRNP07.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		RNP07 rnp07 = new RNP07();
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				String lista = null;
				int[] saida = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					saida[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				
				if (rnp07.aplicar(saida)) {
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					gravarArquivo.printf("%s%n", lista);
					cont++;
				}
			}

			arquivo.close();
			gravarArquivo.close();
		} else {
			System.out.println("### [resultadoRNP07] - Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public void resultadoRNP08() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoRNP08.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		RNP08 rnp08 = new RNP08();
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				String lista = null;
				int[] saida = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					saida[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				
				if (rnp08.aplicar(saida)) {
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					gravarArquivo.printf("%s%n", lista);
					cont++;
				}
			}

			arquivo.close();
			gravarArquivo.close();
		} else {
			System.out.println("### [resultadoRNP08] - Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings({ "deprecation", "unused" })
	public void resultadoRNP09() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoRNP09.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		RNP09 rnp09 = new RNP09();
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linha;
			while (Objects.nonNull((linha = csvReader.readNext()))) {
				String lista = null;
				int[] saida = new int[linha.length];
				for (int i = 0; i < linha.length; i++) {
					saida[i] = Integer.parseInt(String.valueOf(linha[i]));
				}
				
				if (rnp09.aplicar(saida)) {
					lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
							+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
							+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
					gravarArquivo.printf("%s%n", lista);
					cont++;
				}
			}

			arquivo.close();
			gravarArquivo.close();
		} else {
			System.out.println("### [resultadoRNP09] - Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDez() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoNumerosMenorQueDez_NOVE.csv");
		PrintWriter gravarArquivoNOVE = new PrintWriter(arquivoNOVE);
		
		int cont = 0;
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
		URL resultado1525 = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
					}
				}

				if (contlinha == NumeroEnum.ZERO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoZERO.printf("%s%n", lista);
					zero++;
				} else if (contlinha == NumeroEnum.UM.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoUM.printf("%s%n", lista);
					um++;
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoDOIS.printf("%s%n", lista);
					dois++;
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoTRES.printf("%s%n", lista);
					tres++;
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoQUATRO.printf("%s%n", lista);
					quatro++;
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoCINCO.printf("%s%n", lista);
					cinco++;
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSEIS.printf("%s%n", lista);
					seis++;
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoSETE.printf("%s%n", lista);
					sete++;
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoOITO.printf("%s%n", lista);
					oito++;
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					String lista = null;
					lista = linha1525[0] + "," + linha1525[1] + "," + linha1525[2] + ","
							+ linha1525[3] + "," + linha1525[4] + "," + linha1525[5] + ","
							+ linha1525[6] + "," + linha1525[7] + "," + linha1525[8] + ","
							+ linha1525[9] + "," + linha1525[10] + "," + linha1525[11] + ","
							+ linha1525[12] + "," + linha1525[13] + "," + linha1525[14];
					gravarArquivoNOVE.printf("%s%n", lista);
					nove++;
				}

			}
			
			arquivoZERO.close();
			gravarArquivoZERO.close();
			arquivoUM.close();
			gravarArquivoUM.close();
			arquivoDOIS.close();
			gravarArquivoDOIS.close();
			arquivoTRES.close();
			gravarArquivoTRES.close();
			arquivoQUATRO.close();
			gravarArquivoQUATRO.close();
			arquivoCINCO.close();
			gravarArquivoCINCO.close();
			arquivoSEIS.close();
			gravarArquivoSEIS.close();
			arquivoSETE.close();
			gravarArquivoSETE.close();
			arquivoOITO.close();
			gravarArquivoOITO.close();
			arquivoNOVE.close();
			gravarArquivoNOVE.close();
		} else {
			System.out.println("### [resultadoNumerosMenorQueDez] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + cont);
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
		
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP05() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
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
		URL resultado1525 = Principal.class.getClassLoader().getResource("resultado\\ResultadoRNP05.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
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
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO RNP05: " + cont);
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
		
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP06() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
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
		URL resultado1525 = Principal.class.getClassLoader().getResource("resultado\\ResultadoRNP06.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
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
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP06] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO RNP06: " + cont);
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
		
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP07() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
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
		URL resultado1525 = Principal.class.getClassLoader().getResource("resultado\\ResultadoRNP07.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
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
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP07] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO RNP07: " + cont);
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
		
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP08() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
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
		URL resultado1525 = Principal.class.getClassLoader().getResource("resultado\\ResultadoRNP08.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
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
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP08] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO RNP08: " + cont);
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
		
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP09() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
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
		URL resultado1525 = Principal.class.getClassLoader().getResource("resultado\\ResultadoRNP09.csv");
		if (Objects.nonNull(resultado1525)) {
			Path caminho = Paths.get(resultado1525.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado1525;
			while (Objects.nonNull((linhaResultado1525 = csvReader.readNext()))) {

				cont++;
				contlinha = 0;
				int[] linha1525 = new int[linhaResultado1525.length];
				for (int i = 0; i < linhaResultado1525.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado1525[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					if (linha1525[i] < NumeroEnum.DEZ.getValor()) {
						contlinha++;
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
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDezRNP09] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO RNP09: " + cont);
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
		
	}
	
	@SuppressWarnings("deprecation")
	public void jaSaiu(int[] jogo, PrintWriter gravarArquivo) throws URISyntaxException, IOException, LotoException {
		
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;
		URL combinacoes = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.ONZE.getValor()) {
					contonze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.DOZE.getValor()) {
					contdoze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.TREZE.getValor()) {
					conttreze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.QUATORZE.getValor()) {
					contquatorze++;
				}

				if (comparaNumeros(linhaCombinacoes, jogo) == NumeroEnum.QUINZE.getValor()) {
					contquinze++;
				}
			}
			
			String lista = null;
			lista = jogo[0]+","+jogo[1]+","+jogo[2]+","+jogo[3]+","+jogo[4]+","+
								jogo[5]+","+jogo[6]+","+jogo[7]+","+jogo[8]+","+jogo[9]+","+
								jogo[10]+","+jogo[11]+","+jogo[12]+","+jogo[13]+","+jogo[14]+","+
								contonze+","+contdoze+","+conttreze+","+contquatorze+","+contquinze;
			gravarArquivo.printf("%s%n", lista);
		} else {
			System.out.println("### [jaSaiu] - Arquivo nao encontrado... ###");
		}
	}
	
	public static int comparaNumeros(String[] linhaCombinacoes, int[] jogo) {

		int retorno = 0;
		int contJogo = 0;
		int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
		for (int i = 0; i < linhaCombinacoes.length; i++) {
			linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
		}

		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
				if (jogo[i] == linhaCombinacoesInteiro[j]) {
					contJogo++;
				}
			}
		}

		if (contJogo == NumeroEnum.ONZE.getValor()) {
			retorno = NumeroEnum.ONZE.getValor();
		}

		if (contJogo == NumeroEnum.DOZE.getValor()) {
			retorno = NumeroEnum.DOZE.getValor();
		}

		if (contJogo == NumeroEnum.TREZE.getValor()) {
			retorno = NumeroEnum.TREZE.getValor();
		}

		if (contJogo == NumeroEnum.QUATORZE.getValor()) {
			retorno = NumeroEnum.QUATORZE.getValor();
		}

		if (contJogo == NumeroEnum.QUINZE.getValor()) {
			retorno = NumeroEnum.QUINZE.getValor();
		}

		return retorno;
	}
	
	@SuppressWarnings("deprecation")
	public void gerarArquivoARFF() throws URISyntaxException, IOException, LotoException {
		FileWriter arqSaiu = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\fechamento1525-14\\resultado.arff");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		gravarArq.printf("@RELATION resultado%n");
		gravarArq.printf("%n@ATTRIBUTE valor	integer");
		gravarArq.printf("%n@ATTRIBUTE class 	{sim,nao}%n");
		gravarArq.printf("%n@DATA%n");
		int cont = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				cont++;
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				compararArquivoARFF(linha, gravarArq);
				System.out.println("Linha Resultado: " + cont);
			}
			System.out.println("FIM...");
			arqSaiu.close();
			gravarArq.close();
		}
	}
	
	@SuppressWarnings("deprecation")
	public void compararArquivoARFF(int[] linha, PrintWriter gravarArq) throws URISyntaxException, IOException, LotoException {
		int cont = 0;
		int contJogo = 0;
		URL fechamento = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO14.csv");
		if (Objects.nonNull(fechamento)) {
			Path caminho = Paths.get(fechamento.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaFechamento;
			while (Objects.nonNull((linhaFechamento = csvReader.readNext()))) {
				cont++;
				contJogo = 0;
				int[] linhaNova = new int[linhaFechamento.length];
				for (int i = 0; i < linhaFechamento.length; i++) {
					linhaNova[i] = Integer.parseInt(String.valueOf(linhaFechamento[i]));
				}
				
				for (int i = 0; i < linha.length; i++) {
					for (int j = 0; j < linhaNova.length; j++) {
						if (linha[i] == linhaNova[j]) {
							contJogo++;
						}
					}
				}
				
				if (contJogo == NumeroEnum.ONZE.getValor()) {
					gravarArq.printf("%s%n", cont + ",saiu");
				} else {
					gravarArq.printf("%s%n", cont + ",nao");
				}
			}
		}
		System.out.println("TOTAL DE LINHAS DO FECHAMENTO: " + cont);
	}
	
	@SuppressWarnings("deprecation")
	public void resultadofechamentoQUATORZE() throws URISyntaxException, IOException, LotoException {


		int cont = 0;
		int contonze = 0;
		int contdoze = 0;
		int conttreze = 0;
		int contquatorze = 0;
		int contquinze = 0;

//		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\hoje\\conc2140.csv");
//		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		URL combinacoes = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO14.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				cont++;
				
				int[] linha = new int[linhaCombinacoes.length];
				for (int i = 0; i < linhaCombinacoes.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
				}
				
				int retorno = comparaNumeros(linha);
//				String lista = null;
				if (retorno == NumeroEnum.ONZE.getValor()) {
					System.out.println(cont);
//					lista = linha[0]+","+linha[1]+","+linha[2]+","+linha[3]+","+linha[4]+","+
//							linha[5]+","+linha[6]+","+linha[7]+","+linha[8]+","+linha[9]+","+
//							linha[10]+","+linha[11]+","+linha[12]+","+linha[13]+","+linha[14];
//					gravarArq.printf("%s%n",  cont);
					contonze++;
				}

				if (retorno == NumeroEnum.DOZE.getValor()) {
					contdoze++;
				}

				if (retorno == NumeroEnum.TREZE.getValor()) {
					conttreze++;
				}

				if (retorno == NumeroEnum.QUATORZE.getValor()) {
					contquatorze++;
				}

				if (retorno == NumeroEnum.QUINZE.getValor()) {
					contquinze++;
				}
			}

			System.out.println("ONZE: " + contonze);
			System.out.println("DOZE: " + contdoze);
			System.out.println("TREZE: " + conttreze);
			System.out.println("QUATROZE: " + contquatorze);
			System.out.println("QUINZE: " + contquinze);
			System.out.println("TOTAL: " + cont);

//			arqSaiu.close();
//			gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	
	}
	
	public static int comparaNumeros(int[] linha) {

		int retorno = 0;
		int contJogo = 0;
		int[] jogo = { 2,4,5,6,8,11,12,14,15,16,18,19,21,24,25 };
		
		for (int i = 0; i < jogo.length; i++) {
			for (int j = 0; j < linha.length; j++) {
				if (jogo[i] == linha[j]) {
					contJogo++;
				}
			}
		}

		if (contJogo == NumeroEnum.ONZE.getValor()) {
			retorno = NumeroEnum.ONZE.getValor();
		}

		if (contJogo == NumeroEnum.DOZE.getValor()) {
			retorno = NumeroEnum.DOZE.getValor();
		}

		if (contJogo == NumeroEnum.TREZE.getValor()) {
			retorno = NumeroEnum.TREZE.getValor();
		}

		if (contJogo == NumeroEnum.QUATORZE.getValor()) {
			retorno = NumeroEnum.QUATORZE.getValor();
		}

		if (contJogo == NumeroEnum.QUINZE.getValor()) {
			retorno = NumeroEnum.QUINZE.getValor();
		}

		return retorno;
	}
	
	@SuppressWarnings("deprecation")
	public void analisarRepetidosNoConcurso() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\hoje\\conc2140_PRIMO.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		URL comparaUM = Principal.class.getClassLoader().getResource("dezoito\\resultado\\hoje\\conc2140.csv");
		if (Objects.nonNull(comparaUM)) {
			Path caminho = Paths.get(comparaUM.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCompara;
			while (Objects.nonNull((linhaCompara = csvReader.readNext()))) {
				int[] linha = new int[linhaCompara.length];
				for (int i = 0; i < linhaCompara.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaCompara[i]));
				}

//				if (combinacoes1825(linha)) {
					if (ehPrimo(linha[0])) {
						System.out.println(linha[0]);
						gravarArq.printf("%s%n", linha[0]);
					}
//				}
			}
			
			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo UM nao encontrado... ###");
		}
	}
	
	@SuppressWarnings("deprecation")
	public static boolean combinacoes1825(int[] linha) throws URISyntaxException, NumberFormatException, IOException {

		boolean retorno = false;
		URL comparaDOIS = Principal.class.getClassLoader().getResource("dezoito\\resultado\\hoje\\conc2141.csv");
		if (Objects.nonNull(comparaDOIS)) {
			Path caminho = Paths.get(comparaDOIS.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');

			String[] linhaCompara;
			while (Objects.nonNull((linhaCompara = csvReader.readNext()))) {

				int[] linhaComparaDOIS = new int[linhaCompara.length];
				for (int i = 0; i < linhaCompara.length; i++) {
					linhaComparaDOIS[i] = Integer.parseInt(String.valueOf(linhaCompara[i]));
				}

				for (int i = 0; i < linha.length; i++) {
					for (int j = 0; j < linhaComparaDOIS.length; j++) {
						if (linha[i] == linhaComparaDOIS[j]) {
							retorno = true;
						}
					}
				}
			}
		} else {
			System.out.println("### Arquivo DOIS nao encontrado... ###");
		}

		return retorno;
	}
	
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
	public void analiseResultadoGanhador() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		int onze = 0;
		int doze = 0;
		int treze = 0;
		int quatorze = 0;
		int quinze = 0;
		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\resultado\\ResultadoGanhador.csv");
		PrintWriter gravarArq = new PrintWriter(arqSaiu);
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				onze = 0;
				doze = 0;
				treze = 0;
				quatorze = 0;
				quinze = 0;
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				analiseResultadoGanhadorComparar(gravarArq, linha, onze, doze, treze, quatorze, quinze);
				
				System.out.println(cont++);
			}
			
			arqSaiu.close();
			gravarArq.close();
		} else {
			System.out.println("### Arquivo UM nao encontrado... ###");
		}
	}
	
	@SuppressWarnings("deprecation")
	public void analiseResultadoGanhadorComparar(PrintWriter gravarArq, int[] linha, int onze, int doze, int treze, int quatorze, int quinze) throws URISyntaxException, IOException, LotoException {

		int contador = 0;
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] linhaResultado;
			String lista = null;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				contador = 0;
				int[] linha1525 = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha1525[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}

				for (int i = 0; i < linha1525.length; i++) {
					for (int j = 0; j < linha.length; j++) {
						if (linha1525[i] == linha[j]) {
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
			
			lista = linha[0]+","+linha[1]+","+linha[2]+","+linha[3]+","+linha[4]+","+
					linha[5]+","+linha[6]+","+linha[7]+","+linha[8]+","+linha[9]+","+
					linha[10]+","+linha[11]+","+linha[12]+","+linha[13]+","+linha[14]+","+
					onze+","+doze+","+treze+","+quatorze+","+quinze;
			gravarArq.printf("%s%n", lista);
		} else {
			System.out.println("### Arquivo DOIS nao encontrado... ###");
		}

	}
	
	
	private static boolean ehPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}
	
}
