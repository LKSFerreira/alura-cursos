package bytebankHerdado;

public class SistemaInterno {
	private int senha = 1234;

	public void autenticar(Autenticavel funcionarioAutenticavel) {
		boolean isAutenticado = funcionarioAutenticavel.autenticar(this.senha);

		if (isAutenticado) {
			System.out.println("Autenticado com sucesso");
		} else {
			System.out.println("Falha na autenticação");
		}
	}
}
