package br.com.facil.rest.resposta;

import java.io.Serializable;

public class FacilMensagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mensagem;
	private String codigo;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
