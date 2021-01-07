package br.com.facil.dezoito.resultado;

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

public class Resultado1825 {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

//		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\loto\\loto-core\\src\\main\\resources\\dezoito\\resultado\\resultado\\1825SAIU-1.csv");
//		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		int cont = 1;
		URL resultado = Resultado1825.class.getClassLoader().getResource("hoje.csv");
		if (Objects.nonNull(resultado)) {
			
			Path caminho = Paths.get(resultado.toURI());
            CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
            String[] linha;
            while (Objects.nonNull((linha = csvReader.readNext()))) {
            	
            	int[] linhaResultado = new int[linha.length];
            	for (int i = 0; i < linha.length; i++) {
            		linhaResultado[i] = Integer.parseInt(String.valueOf(linha[i]));
        		}
            	
            	String lista = null;
            	int qtd = combinacoes1825(linhaResultado);
            	if (qtd > NumeroEnum.ZERO.getValor()) {
//            		System.out.println(
//            		lista = linhaResultado[0]+","+linhaResultado[1]+","+linhaResultado[2]+","+linhaResultado[3]+","+linhaResultado[4]+","+
//            				linhaResultado[5]+","+linhaResultado[6]+","+linhaResultado[7]+","+linhaResultado[8]+","+linhaResultado[9]+","+
//            				linhaResultado[10]+","+linhaResultado[11]+","+linhaResultado[12]+","+linhaResultado[13]+","+linhaResultado[14] + " - " + qtd
//            		);
////            		gravarArqSaiu.printf("%s%n", lista);
//            		System.out.println("SAIU - " + cont + " - " + qtd);
            	}
            	
            	cont++;
            }
            
//            arqSaiu.close();
//            gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings({ "deprecation" })
	public static int combinacoes1825(int[] linhaResultado) throws URISyntaxException, NumberFormatException, IOException {
		
		int retorno = 0;
		int contJogo = 0;
		int contLinha = 0;
		URL combinacoes1825 = Resultado1825.class.getClassLoader().getResource("18_25.csv");
		if (Objects.nonNull(combinacoes1825)) {
			
			Path caminho = Paths.get(combinacoes1825.toURI());
            CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
            String[] linhaCombinacoes1825;
            while (Objects.nonNull((linhaCombinacoes1825 = csvReader.readNext()))) {
            	
            	contJogo = 0;
            	contLinha++;
            	int[] linha1825 = new int[linhaCombinacoes1825.length];
            	for (int i = 0; i < linhaCombinacoes1825.length; i++) {
            		linha1825[i] = Integer.parseInt(String.valueOf(linhaCombinacoes1825[i]));
        		}
            	
            	for (int i = 0; i < linhaResultado.length; i++) {
            		for (int j = 0; j < linha1825.length; j++) {
            			if (linhaResultado[i] == linha1825[j]) {
            				contJogo++;
            			}
            		}
            	}
            	
            	String lista = null;
            	if (contJogo == NumeroEnum.QUINZE.getValor()) {
            		System.out.println(contLinha 
//            				+ " - " +
//            				linha1825[0]+","+linha1825[1]+","+linha1825[2]+","+linha1825[3]+","+linha1825[4]+","+
//            				linha1825[5]+","+linha1825[6]+","+linha1825[7]+","+linha1825[8]+","+linha1825[9]+","+
//            				linha1825[10]+","+linha1825[11]+","+linha1825[12]+","+linha1825[13]+","+linha1825[14]+","+
//            				linha1825[15]+","+linha1825[16]+","+linha1825[17]
            		);
//            		gravarArqSaiu.printf("%s%n", lista);
            		
            		retorno++;
            	}
            }
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		return retorno;
	}


}