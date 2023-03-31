package br.com.bytebank.banco.model;

import br.com.bytebank.banco.exception.SacaException;

public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	public void sacar(double valor) throws SacaException {
		double taxaTransferencia = 0.2;
		super.sacar(valor + taxaTransferencia);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta Corrente => " + super.toString();
	}

}
