package br.com.bytebank.banco.model;

public class GuardadorDeReferencias {

	private Object[] conta;
	private int posicao;

	public GuardadorDeReferencias() {
		this.conta = new Conta[1];
		this.posicao = 0;
	}
	
	public void adicionar(Object conta) {
		this.conta[posicao] = conta;
		this.posicao++;
	}
	
	public int quantidadeElementos() {
		return this.posicao;
	}
	
	public Object getReferencia(int posicao) {
		return conta[posicao];
	}
}
