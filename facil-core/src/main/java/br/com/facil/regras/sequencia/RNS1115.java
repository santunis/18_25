package br.com.facil.regras.sequencia;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.RegraNegocio;

/**
 * RN03: 
 * Regra Negocial para retirar todas as sequencias de combinacoes entre os
 * numeros de 11 a 15.
 * 
 * @author Santunis.Oliveira
 *
 */
public class RNS1115 implements RegraNegocio<String[], Boolean> {

	int[] regraCinco = { 11, 12, 13, 14, 15 };

	public Boolean aplicar(String[] entrada) throws LotoException {
		
		boolean retorno = false;
		int contRegra = 0;
		
		int[] linhaEntrada = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			linhaEntrada[i] = Integer.parseInt(String.valueOf(entrada[i]));
		}
		
		for (int i = 0; i < regraCinco.length; i++) {
			for (int j = 0; j < linhaEntrada.length; j++) {
				if (regraCinco[i] == linhaEntrada[j]) {
					contRegra++;
				}
			}
		}
		
		if (contRegra == NumeroEnum.CINCO.getValor()) {
			retorno = true;
		}

		return retorno;
	}

	public Boolean verificar(String[] entrada) throws LotoException, URISyntaxException, IOException {
		return null;
	}

}
