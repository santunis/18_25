package br.com.facil.combinacoes;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.Combinacoes;
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
import br.com.facil.resultado.Principal;

public class Combinacoes1525 {
	
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
		combinacoes1525.gerar1525();
//		
//		combinacoes1525.gerar1525RNP02();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP02();
//		
//		combinacoes1525.gerar1525RNP03();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP03();
//		
//		combinacoes1525.gerar1525RNP04();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP04();
//		
//		combinacoes1525.gerar1525RNP05();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP05();
//		
//		combinacoes1525.gerar1525RNP06();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP06();
//		
//		combinacoes1525.gerar1525RNP07();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP07();
//		
//		combinacoes1525.gerar1525RNP08();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP08();
//		
//		combinacoes1525.gerar1525RNP09();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP09();
//		
//		combinacoes1525.gerar1525RNP10();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP10();
//		
//		combinacoes1525.gerar1525RNP11();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP11();
//		
//		combinacoes1525.gerar1525RNP12();
//		combinacoes1525.resultadoNumerosMenorQueDezRNP12();
		
//		combinacoes1525.resultadoParesImparesFechamento11();
//		combinacoes1525.resultadoNumerosMenorQueDez();
		
//		combinacoes1525.juntar89_1416();
		
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 = 3268760
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1525() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivo1525 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-3.csv");
		PrintWriter gravarArquivo1525 = new PrintWriter(arquivo1525);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		while (comb1.hasNext()) {
			cont++;
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
			gravarArquivo1525.printf("%s%n", lista);
			lista1525.add(lista);
		}
		arquivo1525.close();
		gravarArquivo1525.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25: " + cont);
		return lista1525;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp02
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP02() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP02 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02.csv");
		PrintWriter gravarArquivoRNP02 = new PrintWriter(arquivoRNP02);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP02 rnp02 = new RNP02();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp02.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP02.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP02.close();
		gravarArquivoRNP02.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP02: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP02() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP02\\15_25-RNP02.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP02] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP02: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp03
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP03() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP03 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03.csv");
		PrintWriter gravarArquivoRNP03 = new PrintWriter(arquivoRNP03);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP03 rnp03 = new RNP03();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp03.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP03.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP03.close();
		gravarArquivoRNP03.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP03() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP03\\15_25-RNP03.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP03] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP03: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp04
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP04() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP04 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04.csv");
		PrintWriter gravarArquivoRNP04 = new PrintWriter(arquivoRNP04);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP04 rnp04 = new RNP04();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp04.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP04.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP04.close();
		gravarArquivoRNP04.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP04() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP04\\15_25-RNP04.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP04] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP04: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp05
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP05() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP05 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05.csv");
		PrintWriter gravarArquivoRNP05 = new PrintWriter(arquivoRNP05);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP05 rnp05 = new RNP05();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp05.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP05.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP05.close();
		gravarArquivoRNP05.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP05() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP05\\15_25-RNP05.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP05] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP05: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp06
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP06() throws URISyntaxException, IOException, LotoException  {
		FileWriter arquivoRNP06 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06.csv");
		PrintWriter gravarArquivoRNP06 = new PrintWriter(arquivoRNP06);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP06 rnp06 = new RNP06();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp06.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP06.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP06.close();
		gravarArquivoRNP06.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP06() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP06\\15_25-RNP06.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP06] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP06: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp07
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP07() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP07 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07.csv");
		PrintWriter gravarArquivoRNP07 = new PrintWriter(arquivoRNP07);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP07 rnp07 = new RNP07();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp07.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP07.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP07.close();
		gravarArquivoRNP07.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP07() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP07\\15_25-RNP07.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP07] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP07: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp08
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP08() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP08 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08.csv");
		PrintWriter gravarArquivoRNP08 = new PrintWriter(arquivoRNP08);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP08 rnp08 = new RNP08();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp08.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP08.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP08.close();
		gravarArquivoRNP08.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP08() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP08\\15_25-RNP08.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP08] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP08: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp09
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP09() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP09 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09.csv");
		PrintWriter gravarArquivoRNP09 = new PrintWriter(arquivoRNP09);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP09 rnp09 = new RNP09();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp09.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP09.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP09.close();
		gravarArquivoRNP09.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP09() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP09\\15_25-RNP09.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP09] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP09: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp10
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP10() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP10 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10.csv");
		PrintWriter gravarArquivoRNP10 = new PrintWriter(arquivoRNP10);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP10 rnp10 = new RNP10();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp10.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP10.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP10.close();
		gravarArquivoRNP10.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP10: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP10() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP10\\15_25-RNP10.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP10] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP10: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp11
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP11() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP11 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11.csv");
		PrintWriter gravarArquivoRNP11 = new PrintWriter(arquivoRNP11);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP11 rnp11 = new RNP11();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp11.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP11.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP11.close();
		gravarArquivoRNP11.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP11: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP11() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP11\\15_25-RNP11.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP11] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP11: " + cont);
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
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1525 com a regra negocial rnp12
	 * @return
	 * @throws LotoException
	 */
	public List<String> gerar1525RNP12() throws URISyntaxException, IOException, LotoException {
		FileWriter arquivoRNP12 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12.csv");
		PrintWriter gravarArquivoRNP12 = new PrintWriter(arquivoRNP12);
		int cont = 0;
		List<String> lista1525 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 15);
		RNP12 rnp12 = new RNP12();
		while (comb1.hasNext()) {
			String lista = null;
			saida = comb1.next();
			if (rnp12.aplicar(saida)) {
				cont++;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
						saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
						saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				gravarArquivoRNP12.printf("%s%n", lista);
				lista1525.add(lista);
			}
		}
		arquivoRNP12.close();
		gravarArquivoRNP12.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP12: " + cont);
		return lista1525;
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDezRNP12() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivoZERO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_ZERO.csv");
		PrintWriter gravarArquivoZERO = new PrintWriter(arquivoZERO);
		FileWriter arquivoUM = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_UM.csv");
		PrintWriter gravarArquivoUM = new PrintWriter(arquivoUM);
		FileWriter arquivoDOIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_DOIS.csv");
		PrintWriter gravarArquivoDOIS = new PrintWriter(arquivoDOIS);
		FileWriter arquivoTRES = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_TRES.csv");
		PrintWriter gravarArquivoTRES = new PrintWriter(arquivoTRES);
		FileWriter arquivoQUATRO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_QUATRO.csv");
		PrintWriter gravarArquivoQUATRO = new PrintWriter(arquivoQUATRO);
		FileWriter arquivoCINCO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_CINCO.csv");
		PrintWriter gravarArquivoCINCO = new PrintWriter(arquivoCINCO);
		FileWriter arquivoSEIS = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_SEIS.csv");
		PrintWriter gravarArquivoSEIS = new PrintWriter(arquivoSEIS);
		FileWriter arquivoSETE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_SETE.csv");
		PrintWriter gravarArquivoSETE = new PrintWriter(arquivoSETE);
		FileWriter arquivoOITO = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_OITO.csv");
		PrintWriter gravarArquivoOITO = new PrintWriter(arquivoOITO);
		FileWriter arquivoNOVE = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12_NOVE.csv");
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
		URL resultado1525 = Combinacoes1525.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-RNP12\\15_25-RNP12.csv");
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
			System.out.println("### [resultadoNumerosMenorQueDezRNP12] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 15_25-RNP12: " + cont);
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
	public void resultadoParesImparesFechamento11() throws URISyntaxException, IOException, LotoException  {
		
		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO11.csv");
		int contTotalLinhaArquivo = 0;
		RNP02 rnp02 = new RNP02();
		List<String[]> listaRNP02 = new ArrayList<String[]>();
		RNP03 rnp03 = new RNP03();
		List<String[]> listaRNP03 = new ArrayList<String[]>();
		RNP04 rnp04 = new RNP04();
		List<String[]> listaRNP04 = new ArrayList<String[]>();
		RNP05 rnp05 = new RNP05();
		List<String[]> listaRNP05 = new ArrayList<String[]>();
		RNP06 rnp06 = new RNP06();
		List<String[]> listaRNP06 = new ArrayList<String[]>();
		RNP07 rnp07 = new RNP07();
		List<String[]> listaRNP07 = new ArrayList<String[]>();
		RNP08 rnp08 = new RNP08();
		List<String[]> listaRNP08 = new ArrayList<String[]>();
		RNP09 rnp09 = new RNP09();
		List<String[]> listaRNP09 = new ArrayList<String[]>();
		RNP10 rnp10 = new RNP10();
		List<String[]> listaRNP10 = new ArrayList<String[]>();
		RNP11 rnp11 = new RNP11();
		List<String[]> listaRNP11 = new ArrayList<String[]>();
		RNP12 rnp12 = new RNP12();
		List<String[]> listaRNP12 = new ArrayList<String[]>();

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
					listaRNP02.add(linha15);
				} else if (rnp03.aplicar(linha)) {
					cont03++;
					listaRNP03.add(linha15);
				} else if (rnp04.aplicar(linha)) {
					cont04++;
					listaRNP04.add(linha15);
				} else if (rnp05.aplicar(linha)) {
					cont05++;
					listaRNP05.add(linha15);
				} else if (rnp06.aplicar(linha)) {
					cont06++;
					listaRNP06.add(linha15);
				} else if (rnp07.aplicar(linha)) {
					cont07++;
					listaRNP07.add(linha15);
				} else if (rnp08.aplicar(linha)) {
					cont08++;
					listaRNP08.add(linha15);
				} else if (rnp09.aplicar(linha)) {
					cont09++;
					listaRNP09.add(linha15);
				} else if (rnp10.aplicar(linha)) {
					cont10++;
					listaRNP10.add(linha15);
				} else if (rnp11.aplicar(linha)) {
					cont11++;
					listaRNP11.add(linha15);
				} else if (rnp12.aplicar(linha)) {
					cont12++;
					listaRNP12.add(linha15);
				} else {
					System.out.println("#### FUDEU... ####");
				}
				
				if (linha[0] > NumeroEnum.NOVE.getValor()) {
					contLinha++;
				}
				
			}
			
			System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + contTotalLinhaArquivo);
			System.out.println("TOTAL RNP02: " + cont02);
			for (String[] saida : listaRNP02) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP03: " + cont03);
			for (String[] saida : listaRNP03) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP04: " + cont04);
			for (String[] saida : listaRNP04) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP05: " + cont05);
			for (String[] saida : listaRNP05) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP06: " + cont06);
			for (String[] saida : listaRNP06) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP07: " + cont07);
			for (String[] saida : listaRNP07) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP08: " + cont08);
			for (String[] saida : listaRNP08) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP09: " + cont09);
			for (String[] saida : listaRNP09) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP10: " + cont10);
			for (String[] saida : listaRNP10) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP11: " + cont11);
			for (String[] saida : listaRNP11) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL RNP12: " + cont12);
			for (String[] saida : listaRNP12) {
    			System.out.println(
					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
			}
			System.out.println("TOTAL >9: " + contLinha);
			
			
		} else {
			System.out.println("#### [resultadoParesImpares] - Arquivo nao encontrado... ####");
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoNumerosMenorQueDez() throws URISyntaxException, IOException, LotoException {
		
		int cont = 0;
		int contlinha = 0;
		int zero = 0;
		List<String[]> listaZero = new ArrayList<String[]>();
		int um = 0;
		List<String[]> listaUm = new ArrayList<String[]>();
		int dois = 0;
		List<String[]> listaDois = new ArrayList<String[]>();
		int tres = 0;
		List<String[]> listaTres = new ArrayList<String[]>();
		int quatro = 0;
		List<String[]> listaQuatro = new ArrayList<String[]>();
		int cinco = 0;
		List<String[]> listaCinco = new ArrayList<String[]>();
		int seis = 0;
		List<String[]> listaSeis = new ArrayList<String[]>();
		int sete = 0;
		List<String[]> listaSete = new ArrayList<String[]>();
		int oito = 0;
		List<String[]> listaOito = new ArrayList<String[]>();
		int nove = 0;
		List<String[]> listaNove = new ArrayList<String[]>();
		URL resultado1525 = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO11.csv");
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
					listaZero.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.UM.getValor()) {
					um++;
					listaUm.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.DOIS.getValor()) {
					dois++;
					listaDois.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.TRES.getValor()) {
					tres++;
					listaTres.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.QUATRO.getValor()) {
					quatro++;
					listaQuatro.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.CINCO.getValor()) {
					cinco++;
					listaCinco.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.SEIS.getValor()) {
					seis++;
					listaSeis.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.SETE.getValor()) {
					sete++;
					listaSete.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.OITO.getValor()) {
					oito++;
					listaOito.add(linhaResultado1525);
				} else if (contlinha == NumeroEnum.NOVE.getValor()) {
					nove++;
					listaNove.add(linhaResultado1525);
				}
			}
		} else {
			System.out.println("### [resultadoNumerosMenorQueDez] - Arquivo nao encontrado... ###");
		}

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO: " + cont);
		System.out.println("ZERO: " + zero);
		for (String[] saida : listaZero) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("UM: " + um);
		for (String[] saida : listaUm) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("DOIS: " + dois);
		for (String[] saida : listaDois) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("TRES: " + tres);
		for (String[] saida : listaTres) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("QUATRO: " + quatro);
		for (String[] saida : listaQuatro) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("CINCO: " + cinco);
		for (String[] saida : listaCinco) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("SEIS: " + seis);
		for (String[] saida : listaSeis) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("SETE: " + sete);
		for (String[] saida : listaSete) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("OITO: " + oito);
		for (String[] saida : listaOito) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		System.out.println("NOVE: " + nove);
		for (String[] saida : listaNove) {
			System.out.println(
				saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
				saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
				saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
			);
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public void resultadoParesImparesFechamento12() throws URISyntaxException, IOException, LotoException  {
		
		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO12.csv");
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
	
	@SuppressWarnings("deprecation")
	public void resultadoParesImparesFechamento13() throws URISyntaxException, IOException, LotoException  {
		
		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO13.csv");
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
	
	@SuppressWarnings("deprecation")
	public void resultadoParesImparesFechamento14() throws URISyntaxException, IOException, LotoException  {
		
		URL resultadoOrdenado = Principal.class.getClassLoader().getResource("combinacoes\\15_25\\15_25-FECHAMENTO14.csv");
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
	
	@SuppressWarnings({ "deprecation" })
	public static boolean verificarResultado(int[] linha1525) throws URISyntaxException, NumberFormatException, IOException {

		boolean retorno = false;
		int cont = 0;
		URL resultado = Combinacoes1525.class.getClassLoader().getResource("resultado.csv");
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
	
	public void juntar89_1416() throws URISyntaxException, IOException, LotoException {
		
		FileWriter arquivo = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\15_25\\89_1416.csv");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		List<String> lista89 = gerar89();
		List<String> lista1416 = gerar1416();
		List<String> listaCompleta = new ArrayList<String>();
		
		for (String lista : lista89) {
			for (String listaDois : lista1416) {
				listaCompleta.add(lista + "," + listaDois);
			}
		}
		
		for (String listaNova : listaCompleta) {
			System.out.println(listaNova);
			gravarArquivo.printf("%s%n", listaNova);
		}
		
		arquivo.close();
		gravarArquivo.close();
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 89 = 9
	 * 
	 * @return List<String>
	 */
	public List<String> gerar89() throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivo89 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\8_9\\8_9.csv");
//		PrintWriter gravarArquivo89 = new PrintWriter(arquivo89);
		int cont = 0;
		List<String> lista89 = new ArrayList<String>();
		int[] str = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 8);
		while (comb1.hasNext()) {
			cont++;
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7];
//			gravarArquivo89.printf("%s%n", lista);
			lista89.add(lista);
		}
//		arquivo89.close();
//		gravarArquivo89.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 8_9: " + cont);
		return lista89;
	}
	
	/**
	 * Metodo responsavel por gerar as combinacoes 1416 = 120
	 * 
	 * @return List<String>
	 */
	public List<String> gerar1416() throws URISyntaxException, IOException, LotoException {
//		FileWriter arquivo1416 = new FileWriter("D:\\projetos_github\\lotofacil\\18_25\\facil-core\\src\\main\\resources\\combinacoes\\14_16\\14_16.csv");
//		PrintWriter gravarArquivo1416 = new PrintWriter(arquivo1416);
		int cont = 0;
		List<String> lista1416 = new ArrayList<String>();
		int[] str = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
		int[] saida;
		Combinacoes comb1 = new Combinacoes(str, 14);
		while (comb1.hasNext()) {
			cont++;
			String lista = null;
			saida = comb1.next();
			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13];
//			gravarArquivo1416.printf("%s%n", lista);
			lista1416.add(lista);
		}
//		arquivo1416.close();
//		gravarArquivo1416.close();
		System.out.println("TOTAL DE LINHAS NO ARQUIVO 14_16: " + cont);
		return lista1416;
	}

}
