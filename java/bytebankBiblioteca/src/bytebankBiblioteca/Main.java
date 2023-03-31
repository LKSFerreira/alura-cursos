package bytebankBiblioteca;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class Main {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(222, 123);
		System.out.println(conta.getSaldo());
	}

}
