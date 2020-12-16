package br.com.facil.regras.pares;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.RegraNegocio;

public class RNP08 implements RegraNegocio<String[], Boolean> {

	public Boolean aplicar(String[] entrada) throws LotoException {

		boolean retorno = false;
		int contLinha = 0;

		int[] linha = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			linha[i] = Integer.parseInt(String.valueOf(entrada[i]));
		}

		for (int i = 0; i < linha.length; i++) {
			if (linha[i] % NumeroEnum.DOIS.getValor() == NumeroEnum.ZERO.getValor()) {
				contLinha++;
			}
		}

		if (contLinha == NumeroEnum.OITO.getValor()) {
			retorno = true;
		}

		return retorno;
	}

	public Boolean verificar(String[] entrada) throws LotoException, URISyntaxException, IOException {
		return null;
	}

}
