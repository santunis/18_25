package br.com.facil.dezoito.principal;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.opencsv.CSVReader;

import br.com.facil.dezoito.Principal;
import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.pares.RNP07;

public class Resultado {
	
	/**
	 * Metodo responsavel pelos resultados dos jogos.
	 * 
	 * @return
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws LotoException
	 */
	@SuppressWarnings("deprecation")
	public List<String> resultadoJogos() throws URISyntaxException, IOException, LotoException {
		List<String> listaResultado = new ArrayList<String>();
		URL resultado = Resultado.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] saida;
			while (Objects.nonNull((saida = csvReader.readNext()))) {
				String lista = null;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
						+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
						+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				listaResultado.add(lista);
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		return listaResultado;
	}
	
	/**
	 * Metodo responsavel pelos resultados dos jogos.
	 * 
	 * @return
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws LotoException
	 */
	@SuppressWarnings("deprecation")
	public List<String> resultadoJogosFechamento15_25_QUATORZE() throws URISyntaxException, IOException, LotoException {
		List<String> listaResultado = new ArrayList<String>();
		URL resultado = Resultado.class.getClassLoader().getResource("dezoito\\fechamento\\Fechamento15_25_QUATORZE.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			String[] saida;
			while (Objects.nonNull((saida = csvReader.readNext()))) {
				String lista = null;
				lista = saida[0] + "," + saida[1] + "," + saida[2] + "," + saida[3] + "," + saida[4] + ","
						+ saida[5] + "," + saida[6] + "," + saida[7] + "," + saida[8] + "," + saida[9] + ","
						+ saida[10] + "," + saida[11] + "," + saida[12] + "," + saida[13] + "," + saida[14];
				listaResultado.add(lista);
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		return listaResultado;
	}
	
	/**
	 * Metodo responsavel por saber a quantidade de resultados RNP07.
	 * 
	 * @return List<String>
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws LotoException
	 */
	@SuppressWarnings("deprecation")
	public static List<String> resultadoRNP07() throws URISyntaxException, IOException, LotoException {
		List<String> listaResultadoRNP07 = new ArrayList<String>();
		RNP07 rnp07 = new RNP07();
		URL resultado = Resultado.class.getClassLoader().getResource("resultado.csv");
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
					listaResultadoRNP07.add(lista);
				}
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		return listaResultadoRNP07;
	}
	
	/**
	 * Metodo responsavel por calcular a quantidade de jogos que fez TREZE pontos e que se enquadra na regra RNP07.
	 * 
	 * @throws URISyntaxException
	 * @throws IOException
	 * @throws LotoException
	 */
	@SuppressWarnings("deprecation")
	public static List<String> acertosTREZERNP07() throws URISyntaxException, IOException, LotoException {
		List<String> listaTREZE = new ArrayList<String>();
		RNP07 rnp07 = new RNP07();
		URL combinacoes = Principal.class.getClassLoader().getResource("dezoito\\resultado\\ResultadoAcertoTREZE.csv");
		if (Objects.nonNull(combinacoes)) {
			Path caminho = Paths.get(combinacoes.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			
			String[] linhaCombinacoes;
			while (Objects.nonNull((linhaCombinacoes = csvReader.readNext()))) {
				
				int[] linha = new int[linhaCombinacoes.length];
				for (int i = 0; i < linhaCombinacoes.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaCombinacoes[i]));
				}
				
				String linhaTREZE = null;
				if (rnp07.aplicar(linha)) {
					linhaTREZE = linha[0] + "," + linha[1] + "," + linha[2] + "," + linha[3] + ","
							+ linha[4] + "," + linha[5] + "," + linha[6] + "," + linha[7] + ","
							+ linha[8] + "," + linha[9] + "," + linha[10] + "," + linha[11] + ","
							+ linha[12] + "," + linha[13] + "," + linha[14];
					listaTREZE.add(linhaTREZE);
				}
			}
		} else {
			System.out.println("### Arquivo nao encontrado... ###");
		}
		
		return listaTREZE;
	}
	
	@SuppressWarnings("deprecation")
	public static boolean jaSaiu(String[] combinacao) throws URISyntaxException, IOException, LotoException {
		int contJogo = 0;
		boolean retorno = false;
		int[] combinacaoInteiro = new int[combinacao.length];
		for (int i = 0; i < combinacao.length; i++) {
			combinacaoInteiro[i] = Integer.parseInt(String.valueOf(combinacao[i]));
		}
		
		URL resultado = Principal.class.getClassLoader().getResource("resultado.csv");
		if (Objects.nonNull(resultado)) {
			Path caminho = Paths.get(resultado.toURI());
			CSVReader csvReader = new CSVReader(new FileReader(caminho.toFile()), ',');
			
			String[] linhaResultado;
			while (Objects.nonNull((linhaResultado = csvReader.readNext()))) {
				int[] linha = new int[linhaResultado.length];
				for (int i = 0; i < linhaResultado.length; i++) {
					linha[i] = Integer.parseInt(String.valueOf(linhaResultado[i]));
				}
				
				contJogo = 0;
				for (int i = 0; i < linha.length; i++) {
					for (int j = 0; j < combinacaoInteiro.length; j++) {
						if (linha[i] == combinacaoInteiro[j]) {
							contJogo++;
						}
					}
				}
				
				if (contJogo == NumeroEnum.QUINZE.getValor()) {
					retorno = true;
					break;
				}
			}
		} else {
			System.out.println("### resultado.csv - Arquivo nao encontrado... ###");
		}
		
		return retorno;
	}

}
