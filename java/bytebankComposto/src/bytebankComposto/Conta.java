package bytebankComposto;

public class Conta {
	private static int totalDeContas;
	private double saldo = 100;
	private int agencia;
	private int numero;
	private Cliente titular;
	
//	public Conta(int agencia, int numero) {
//		this.agencia = agencia;
//		this.numero = numero;
//		this.saldo = 10;
//		totalDeContas++;
//		System.out.println("Conta criada com sucesso");
//	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean tranferir(double valor, Conta conta) {
		if (this.sacar(valor)){
			conta.depositar(valor);
			return true;
		}
		return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
	
}
