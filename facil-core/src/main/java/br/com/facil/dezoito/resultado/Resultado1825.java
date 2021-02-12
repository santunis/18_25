package br.com.facil.dezoito.resultado;

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

public class Resultado1825 {

	@SuppressWarnings({ "deprecation" })
	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {

		FileWriter arqSaiu = new FileWriter("D:\\projetos_loto\\18_25\\facil-core\\src\\main\\resources\\dezoito\\resultado\\1825NUMEROSLINHA.csv");
		PrintWriter gravarArqSaiu = new PrintWriter(arqSaiu);
		
		int cont = 0;
		URL resultado = Resultado1825.class.getClassLoader().getResource("resultado.csv");
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
            	
            	List<Integer> qtd = combinacoes1825(linha);
            	StringBuilder lista = new StringBuilder();
            	for (int t : qtd) {
            		lista.append(t+",");
            	}

            	gravarArqSaiu.printf("%s%n", lista);
            	System.out.println(cont);
            }
            
            arqSaiu.close();
            gravarArqSaiu.close();
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
	}
	
	@SuppressWarnings({ "deprecation" })
	public static List<Integer> combinacoes1825(int[] linha) throws URISyntaxException, NumberFormatException, IOException {

		int contJogo = 0;
		int contLinha = 0;
		List<Integer> listaPerfeita = new ArrayList<Integer>();
		URL combinacoes1825 = Resultado1825.class.getClassLoader().getResource("combinacoes\\18_25.csv");
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
            	
            	for (int i = 0; i < linha.length; i++) {
            		for (int j = 0; j < linha1825.length; j++) {
            			if (linha[i] == linha1825[j]) {
            				contJogo++;
            			}
            		}
            	}
            	
            	if (contJogo == NumeroEnum.QUINZE.getValor()) {
            		listaPerfeita.add(contLinha);
            	}
            }
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		return listaPerfeita;
	}


}
