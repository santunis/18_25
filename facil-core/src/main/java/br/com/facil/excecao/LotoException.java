package br.com.facil.excecao;

/**
 * 
 * @author Santunis.Oliveira
 *
 */
public class LotoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construtor.
	 *
	 * @param mensagem
	 */
	public LotoException(String mensagem) {
		super(mensagem);
	}

	/**
	 * Construtor.
	 *
	 * @param excecao
	 * @param mensagem
	 */
	public LotoException(Throwable excecao, String mensagem) {
		super(mensagem, excecao);
	}

}
