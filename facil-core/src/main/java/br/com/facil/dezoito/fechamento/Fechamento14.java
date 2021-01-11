package br.com.facil.dezoito.fechamento;

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

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;


public class Fechamento14 {
	
	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException  {
		
//		FileWriter arq = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\fechamento\\jogo\\Fechamento20-rnp07.csv");
//		PrintWriter gravarArq = new PrintWriter(arq);
		
		URL combinacoes = Fechamento14.class.getClassLoader().getResource("dezoito\\fechamento\\GerarFechamento21_08012021.csv");
		List<String[]> listaNumeros = new ArrayList<String[]>();
		int contCombinacoes = 0;
		int contFechamento = 0;
		
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
            CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
            
            String[] linhaCombinacoes;
            while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
            	if (contCombinacoes == NumeroEnum.ZERO.getValor()) {
            		listaNumeros.add(linhaCombinacoes);
            	}
            	
            	if (comparaNumeros(listaNumeros, linhaCombinacoes)) {
            		listaNumeros.add(linhaCombinacoes);
            	}
            	
            	contCombinacoes++;
            	System.out.println(contCombinacoes);
            }
            
            for (String[] saida : listaNumeros) {
            	String lista = null;
    			
    			lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
    					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
    					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
    			
//    			gravarArq.printf("%s%n", lista);
    			
    			contFechamento++;
    			System.out.println(contFechamento + " - " + 
    					saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + "," + 
    					saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + "," + 
    					saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14]
    			);
            }
            
            System.out.println("Numero de Combinacoes: " + contCombinacoes);
            System.out.println("Numero  de Fechamentos: " + contFechamento);
            
//            arq.close();
//            gravarArq.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}
	
	public static boolean comparaNumeros(List<String[]> listaNumeros, String[] linhaCombinacoes) {
		
		boolean retorno = false;
		int[] linhaCombinacoesInteiro = new int[linhaCombinacoes.length];
    	for (int i = 0; i < linhaCombinacoes.length; i++) {
    		linhaCombinacoesInteiro[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
		}
    	
    	for (String[] linha : listaNumeros) {
    		int contJogo = 0;
    		int[] linhaInteiro = new int[linha.length];
        	for (int i = 0; i < linha.length; i++) {
        		linhaInteiro[i] = Integer.parseInt(String.valueOf(linha[i]));
    		}
    		
    		for (int i = 0; i < linhaInteiro.length; i++) {
        		for (int j = 0; j < linhaCombinacoesInteiro.length; j++) {
        			if (linhaInteiro[i] == linhaCombinacoesInteiro[j]) {
        				contJogo++;
        			}
        		}
        	}
    		
    		if (contJogo < NumeroEnum.ONZE.getValor()) {
    			retorno = true;
    		} else {
    			retorno = false;
    			break;
    		}
		}
    	
    	return retorno;
	}
}
