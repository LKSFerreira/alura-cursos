package br.com.bytebank.banco.test;

// import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.GuardadorDeContas;

public class TesteArrayList {

	public static void main(String[] args) {

		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

		ContaCorrente contaCorrente = new ContaCorrente(1, 123);
		
		guardadorDeContas.adicionar(contaCorrente);
		
		System.out.println("Quantidade de elementos no array: " + guardadorDeContas.quantidadeElementos());
		
		Conta contaCorrente2 = new ContaCorrente(2, 456);
		
		guardadorDeContas.adicionar(contaCorrente2);
		
		System.out.println("Quantidade de elementos no array: " + guardadorDeContas.quantidadeElementos());
		
		Object referencia = guardadorDeContas.getReferencia(1);
		
		System.out.println(guardadorDeContas.getReferencia(1));
		
		System.out.println(((Conta) referencia).getNumeroDaConta());
		
		// Object contaCorrent3 = new ContaCorrente(3, 789);
		// Object contaCorrent4 = new ContaCorrente(4, 147);
		// Object contaCorrent5 = new ContaCorrente(5, 258);
		// Object contaCorrent6 = new ContaCorrente(6, 369);
		
		
	}

}
