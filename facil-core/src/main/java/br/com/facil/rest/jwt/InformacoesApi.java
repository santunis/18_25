package br.com.facil.rest.jwt;

import java.io.Serializable;

public class InformacoesApi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String aplicacao;

	public InformacoesApi(String aplicacao, String versao) {
		this.aplicacao = aplicacao;
	}
	
	public InformacoesApi(String aplicacao) {
		this.aplicacao = aplicacao;
	}

	public String getAplicacao() {
		return this.aplicacao;
	}

}
