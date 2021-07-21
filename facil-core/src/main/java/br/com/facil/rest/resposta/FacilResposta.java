package br.com.facil.rest.resposta;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class FacilResposta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<FacilMensagem> mensagens;
	private Object resultado;
	private FacilMensagem erro;

	public List<FacilMensagem> getMensagens() {
		return mensagens;
	}

	public Object getResultado() {
		return resultado;
	}

	public FacilMensagem getErro() {
		return erro;
	}

	private FacilResposta(Builder builder) {
		this.mensagens = null;
		this.mensagens = builder.mensagens;
		this.resultado = builder.resultado;
		this.erro = builder.erro;
	}

	public static class Builder {
		private List<FacilMensagem> mensagens = null;
		private Object resultado;
		private FacilMensagem erro;

		public FacilResposta build() {
			return new FacilResposta(this);
		}

		public Builder resultado(Object objeto) {
			this.resultado = objeto;

			return this;
		}

		public Builder mensagem(String mensagem) {
			if (this.mensagens == null) {
				this.mensagens = new ArrayList();
			}

			FacilMensagem msg = new FacilMensagem();
			msg.setMensagem(mensagem);

			this.mensagens.add(msg);
			return this;
		}

		public Builder mensagem(String codigo, String mensagem) {
			if (this.mensagens == null) {
				this.mensagens = new ArrayList();
			}

			FacilMensagem msg = new FacilMensagem();
			msg.setCodigo(codigo);
			msg.setMensagem(mensagem);

			this.mensagens.add(msg);
			return this;
		}

		public Builder mensagem(FacilMensagem msg) {
			if (this.mensagens == null) {
				this.mensagens = new ArrayList();
			}

			this.mensagens.add(msg);
			return this;
		}

		public Builder erro(FacilMensagem erro) {
			this.erro = erro;
			return this;
		}
	}

}
