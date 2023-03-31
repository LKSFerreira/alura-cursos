package javaPilha;

public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			System.err.println(ex.getCause() + " " + ex.getLocalizedMessage() + " " + ex.getCause());

		}

		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");

		metodo2();
		try {

		} catch (ArithmeticException | NullPointerException ex) {
			System.err.println(ex.getMessage());

		}

		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		Conta conta = new Conta();
		try {
			conta.depositar();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Fim do metodo2");
	}
}
