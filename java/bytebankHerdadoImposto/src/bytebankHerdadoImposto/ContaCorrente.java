package bytebankHerdadoImposto;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean sacar(double valor) {
		double taxaTransferencia = 0.2;
		return super.sacar(valor + taxaTransferencia);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		double aliquota = 0.1;
		return super.saldo*aliquota;
	}

}
