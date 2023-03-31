package bytebankHerdado;

public class ControleBonificacao {
	private double soma;
	
	public double getSoma() {
		return this.soma;
	}
	
	public void registrarBonificacao(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
	}
}
