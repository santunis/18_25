package br.com.facil.regras;

import java.io.IOException;
import java.net.URISyntaxException;

import br.com.facil.excecao.LotoException;

public interface RegraNegocio<F, T> {

	T aplicar(F entrada) throws LotoException;
	
	T verificar(F entrada) throws LotoException, URISyntaxException, IOException;

}
