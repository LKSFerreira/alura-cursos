package bytebankHerdado;

public class Administrador extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		return 0;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

}
