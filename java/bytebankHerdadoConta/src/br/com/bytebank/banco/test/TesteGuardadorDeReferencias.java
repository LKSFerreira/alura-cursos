package br.com.bytebank.banco.test;

import java.util.ArrayList;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TesteGuardadorDeReferencias {

	public static void main(String[] args) {

		ArrayList<Conta> listaDeContas = new ArrayList<>();

		ContaCorrente contaCorrente = new ContaCorrente(1, 123);
		
		listaDeContas.add(contaCorrente);
		
		System.out.println("Quantidade de elementos no array: " + listaDeContas.size());
		
		Conta contaCorrente2 = new ContaCorrente(2, 456);
		
		listaDeContas.add(contaCorrente2);
		
		System.out.println("Quantidade de elementos no array: " + listaDeContas.size());
		
		Conta referencia = listaDeContas.get(1);
		
		System.out.println(listaDeContas.get(1));
		
		System.out.println(referencia.getNumeroDaConta());
		
		Conta contaCorrent3 = new ContaCorrente(3, 789);
		Conta contaCorrent4 = new ContaCorrente(4, 147);
		Conta contaCorrent5 = new ContaCorrente(5, 258);
		Conta contaCorrent6 = new ContaCorrente(6, 369);
		
		listaDeContas.add(contaCorrent3);
		listaDeContas.add(contaCorrent4);
		listaDeContas.add(contaCorrent5);
		listaDeContas.add(contaCorrent6);
		
		Object contaCorrent7 = new ContaCorrente(5,  258);
		
		boolean contemConta = listaDeContas.contains(contaCorrent7);
		System.out.println(contemConta);
		
		for (Object objetoReferencia : listaDeContas) {
			System.out.println(objetoReferencia);
		}
		
	}

}
