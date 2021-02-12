package br.com.facil.dezoito;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import br.com.facil.dezoito.principal.Fechamento;
import br.com.facil.dezoito.principal.Resultado;
import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;

public class PrincipalFechamento {

	public static void main(String[] args) throws URISyntaxException, IOException, LotoException {
		
		int contPrimo = 0;
		for (int i = 900; i < NumeroEnum.MIL.getValor(); i++) {
			if (ehPrimo(i)) {
				contPrimo++;
			}
		}
		System.out.println("Primos: " + contPrimo);

//		Resultado resultado = new Resultado();
//		List<String> listaFechamento = resultado.resultadoJogosFechamento15_25_QUATORZE();
//		System.out.println("Fechamento15_25_QUATORZE: " + listaFechamento.size());
//		
//		List<String> listaResultado = resultado.resultadoJogos();
//		System.out.println("Resultado: " + listaResultado.size());
//		Fechamento fechamento = new Fechamento();
//		for (String linha : listaResultado) {
//			String[] linha1525 = linha.split(",");
//			int[] jogo = new int[linha1525.length];
//			for (int i = 0; i < linha1525.length; i++) {
//				jogo[i] = Integer.parseInt(String.valueOf(linha1525[i]));
//			}
//			List<Integer> listaPrimos = fechamento.analiseFechamento1525_Quatorze(listaFechamento, jogo);
//			System.out.println("QTD Primos: " + listaPrimos.size());
//			
//		}

		System.out.println("Fim");

	}
	
	private static boolean ehPrimo(int numero) {
	    for (int j = 2; j < numero; j++) {
	        if (numero % j == 0)
	            return false;   
	    }
	    return true;
	}

}
