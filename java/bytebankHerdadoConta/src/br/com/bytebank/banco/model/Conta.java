package br.com.bytebank.banco.model;

import br.com.bytebank.banco.exception.SacaException;

/**
 * Classe conta que representa abstratamente uma conta
 * 
 * @author Lucas Ferreira
 *
 */
public abstract class Conta implements Comparable<Conta> {

	private static int totalDeContas;

	protected double saldo;
	private int agencia;
	private int numeroDaConta;
	private Cliente titular;

	/**
	 * Não intancia um objeto com agencia ou número da conta negativo;
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		if (agencia < 0) {
			throw new IllegalArgumentException("O número da agência não pode ser negativo");
		}
		if (numero < 0) {
			throw new IllegalArgumentException("O número da conta não pode ser negativo");
		}
		this.agencia = agencia;
		this.numeroDaConta = numero;
		this.saldo = 10;
		totalDeContas++;
		// System.out.println("Conta criada com sucesso");
	}

	public abstract void depositar(double valor);

	/**
	 * Faz o tratamento de erro lançando uma exceção
	 * 
	 * @param valor
	 * @throws SacaException
	 */
	public void sacar(double valor) throws SacaException {
		if (this.saldo < valor) {
			throw new SacaException("Saldo insuficiente: " + getSaldo());
		}
		this.saldo -= valor;
	}

	public void transferir(double valor, Conta conta) throws SacaException {
		this.sacar(valor);
		conta.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	@Override
	public int compareTo(Conta outraConta) {
		return Double.compare(this.saldo, outraConta.saldo);
	}

	@Override
	public boolean equals(Object obj) {

		Conta outraConta = (Conta) obj;

		if (this.agencia != outraConta.agencia) {
			return false;
		}

		if (this.numeroDaConta != outraConta.numeroDaConta) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return "|Titular: " + this.getTitular().getNome() + "| Agencia: " + this.agencia + " | Número da conta: "
				+ this.numeroDaConta;
	}

}
