package br.com.bytebank.banco.model;

public class GuardadorDeContas {

	private Conta[] conta;
	private int posicao;

	public GuardadorDeContas() {
		this.conta = new Conta[10];
		this.posicao = 0;
	}
	
	public void adicionar(Conta conta) {
		this.conta[posicao] = conta;
		this.posicao++;
	}
	
	public int quantidadeElementos() {
		return this.posicao;
	}
	
	public Conta getReferencia(int posicao) {
		return conta[posicao];
	}
}
