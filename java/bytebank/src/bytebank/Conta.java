package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
}
