package bytebankHerdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();

		gerente.setNome("Lucas Ferreira");
		gerente.setCpf("223355646-9");
		gerente.setSalario(3000.00);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());

	}
}
