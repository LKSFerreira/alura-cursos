package br.com.alura.java.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws Exception {
//		Cliente cliente = new Cliente();
//		cliente.setNome("Lucas Ferreira");
//		cliente.setCpf("12345678900");
//		cliente.setProfissao("Programador");
//
//		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin"));

//		objectOutputStream.writeObject(cliente);
//		objectOutputStream.close();

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteLido = (Cliente) objectInputStream.readObject();
		objectInputStream.close();
		
		System.out.println(clienteLido.getNome());
	}

}

class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
