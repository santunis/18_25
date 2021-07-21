package br.com.facil.rest.resposta;

public enum MensagemEnum {

	MSG_0001("0001"), 
	MSG_0002("0002"), 
	MSG_0003("0003"), 
	MSG_0004("0004"), 
	MSG_0005("0005");

	private String codigo;

	MensagemEnum(String codigo) {
		this.codigo = codigo;
	}

}
