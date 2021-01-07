package br.com.facil.regras.sequencia;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.RegraNegocio;

/**
 * RN04: Regra Negocial para retirar todas as sequencias de combinacoes entre os
 * numeros de 16 a 20.
 * 
 * @author Santunis.Oliveira
 *
 */
public class RNS1620 implements RegraNegocio<String[], Boolean> {

	int[] regraCinco = { 16, 17, 18, 19, 20 };

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
