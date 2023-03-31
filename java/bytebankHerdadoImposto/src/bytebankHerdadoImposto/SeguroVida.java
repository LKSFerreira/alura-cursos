package bytebankHerdadoImposto;

public class SeguroVida implements Tributavel {

	private double valorSeguroVida;
	
	public void setValorSeguroVida(double valorSeguroVida) {
		this.valorSeguroVida = valorSeguroVida;
	}
	
	public double getValorSeguroVida() {
		return valorSeguroVida;
	}

	@Override
	public double getValorImposto() {
		double aliquota = 0.1;
		return valorSeguroVida * aliquota;
	}

}
