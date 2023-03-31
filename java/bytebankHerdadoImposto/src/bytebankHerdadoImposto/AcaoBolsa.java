package bytebankHerdadoImposto;

public class AcaoBolsa implements Tributavel{
	
	double valorBolsa;
	
	@Override
	public double getValorImposto() {
		double aliquota = 0.1;
		return valorBolsa*aliquota;
	}
	
}
