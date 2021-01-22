package br.com.facil.regras.pares;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.facil.enumerador.NumeroEnum;
import br.com.facil.excecao.LotoException;
import br.com.facil.regras.RegraNegocio;

public class RNP08 implements RegraNegocio<int[], Boolean> {

	public Boolean aplicar(int[] entrada) throws LotoException {

		boolean retorno = false;
		int contLinha = 0;

		for (int i = 0; i < entrada.length; i++) {
			if (entrada[i] % NumeroEnum.DOIS.getValor() == NumeroEnum.ZERO.getValor()) {
				contLinha++;
			}
		}

		if (contLinha == NumeroEnum.OITO.getValor()) {
			retorno = true;
		}

		return retorno;
	}

	public Boolean verificar(int[] entrada) throws LotoException, URISyntaxException, IOException {
		return null;
	}

}
