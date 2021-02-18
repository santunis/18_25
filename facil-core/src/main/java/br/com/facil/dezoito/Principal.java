package br.com.facil.dezoito;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import br.com.facil.combinacoes.Combinacoes2025;
import br.com.facil.combinacoes.Resultado;
import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class Principal {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		int cont = 1;
		List<String[]> listaPerfeita = new ArrayList<String[]>();
		// Combinacoes 1525
//		Combinacoes1525 combinacoes1525 = new Combinacoes1525();
//		List<String> listaCombinacoes1525 = combinacoes1525.gerar1525RNP07();
//		System.out.println("Combinacoes 1525 RNP07: " + listaCombinacoes1525.size());
		
		Resultado resultado = new Resultado();
		List<String> listaCombinacoes1525 = resultado.resultadoJogos();
		System.out.println("Resultado: " + listaCombinacoes1525.size());
		
		// Combinacoes 2025
		Combinacoes2025 combinacoes2025 = new Combinacoes2025();
		List<String> listaCombinacoes2025 = combinacoes2025.gerar2025();
		
		for (String lista15 : listaCombinacoes1525) {
			String[] linha15 = lista15.split(",");
			int[] linha1525 = new int[linha15.length];
			for (int i = 0; i < linha15.length; i++) {
				linha1525[i] = Integer.parseInt(String.valueOf(linha15[i]));
			}
			List<String[]> listaTop = comparar1525_2025(linha1525, listaCombinacoes2025, listaPerfeita);
			if (listaTop.size() > NumeroEnum.ZERO.getValor()) {
				listaPerfeita.addAll(listaTop);
			}
			System.out.println(cont);
			System.out.println("Lista Perfeita: " + listaPerfeita.size());
			cont++;
		}
		System.out.println("Minha Lista: " + listaPerfeita.size());
	}
	
	public static List<String[]> comparar1525_2025(int[] linha15, List<String> listaCombinacoes2025, List<String[]> listaPerfeita) {
		
		int contJogo = 0;
		List<String[]> listaTop = new ArrayList<String[]>();
		for (String lista20 : listaCombinacoes2025) {
			contJogo = 0;
			String[] linha20 = lista20.split(",");
			int[] linha2025 = new int[linha20.length];
			for (int i = 0; i < linha20.length; i++) {
				linha2025[i] = Integer.parseInt(String.valueOf(linha20[i]));
			}
			
			for (int i = 0; i < linha15.length; i++) {
				for (int j = 0; j < linha2025.length; j++) {
					if (linha15[i] == linha2025[j]) {
						contJogo++;
					}
				}
			}
			
			if (contJogo == NumeroEnum.QUINZE.getValor() && listaPerfeita.size() == NumeroEnum.ZERO.getValor()) {
				listaTop.add(linha20);
			}
			
			if (contJogo == NumeroEnum.QUINZE.getValor() && listaPerfeita.size() > NumeroEnum.ZERO.getValor()) {
				int retorno = comparar(linha2025, listaPerfeita);
				if (retorno == NumeroEnum.ZERO.getValor()) {
					listaTop.add(linha20);
				}
			}
		}
		System.out.println("Lista Top: " + listaTop.size());
		return listaTop;
	}
	
	public static int comparar(int[] linha2025, List<String[]> listaPerfeita) {
		int contador = 0;
		int retorno = 0;
		for (String[] linhaPerfeita : listaPerfeita) {
			contador = 0;
			int[] linhaPerfeitaInt = new int[linhaPerfeita.length];
			for (int i = 0; i < linhaPerfeita.length; i++) {
				linhaPerfeitaInt[i] = Integer.parseInt(String.valueOf(linhaPerfeita[i]));
			}
			for (int i = 0; i < linhaPerfeitaInt.length; i++) {
				for (int j = 0; j < linha2025.length; j++) {
					if (linhaPerfeitaInt[i] == linha2025[j]) {
						contador++;
					}
				}
			}
			if (contador == NumeroEnum.VINTE.getValor()) {
				retorno++;
				break;
			}
		}
		return retorno;
	}
}
