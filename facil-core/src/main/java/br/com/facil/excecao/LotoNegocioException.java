package br.com.facil.excecao;

/**
 * 
 * @author Santunis.Oliveira
 *
 */
public class LotoNegocioException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construtor.
	 *
	 * @param mensagem
	 */
	public LotoNegocioException(String mensagem) {
		super(mensagem);
	}

	/**
	 * Construtor.
	 *
	 * @param excecao
	 * @param mensagem
	 */
	public LotoNegocioException(Throwable excecao, String mensagem) {
		super(mensagem, excecao);
	}

}
