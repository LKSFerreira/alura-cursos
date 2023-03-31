package bytebankHerdado;

public class TesteSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(124);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(1234);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		sistemaInterno.autenticar(gerente);
		sistemaInterno.autenticar(administrador);
	}

}
