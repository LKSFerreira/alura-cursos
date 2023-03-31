package bytebankHerdadoImposto;

public class CalculaImposto {
	
	private double totalValorImposto;
	
	public double getTotalValorImposto() {
		return totalValorImposto;
	}
	
	public void calcularImposto(Tributavel tributo) {
		this.totalValorImposto += tributo.getValorImposto();
	}
	
}
