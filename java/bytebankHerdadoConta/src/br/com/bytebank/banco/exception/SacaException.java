package br.com.bytebank.banco.exception;

/**
 * 
 * @author Lucas Ferreira
 * @version 1.0.0
 */
public class SacaException extends Exception {
	
	/**
	 * Sobe a mensagem de exceção para super
	 * 
	 * @param mensagem
	 */
	public SacaException(String mensagem) {
		super(mensagem);
	}
}
