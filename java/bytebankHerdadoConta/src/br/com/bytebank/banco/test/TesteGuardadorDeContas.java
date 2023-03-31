package br.com.bytebank.banco.test;

// import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {

		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

		ContaCorrente contaCorrente = new ContaCorrente(1, 123);
		
		guardadorDeContas.adicionar(contaCorrente);
		
		System.out.println("Quantidade de elementos no array: " + guardadorDeContas.quantidadeElementos());
		
		Conta contaCorrente2 = new ContaCorrente(2, 456);
		
		guardadorDeContas.adicionar(contaCorrente2);
		
		System.out.println("Quantidade de elementos no array: " + guardadorDeContas.quantidadeElementos());
		
		Conta referencia = guardadorDeContas.getReferencia(1);
		
		System.out.println(guardadorDeContas.getReferencia(1));
		
		System.out.println(referencia.getNumeroDaConta());
		
	}

}
