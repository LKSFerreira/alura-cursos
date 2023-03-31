package br.com.alura.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {
		String string = "Lucas da Silva Ferreira";
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("nome.bin"));
		objectOutputStream.writeObject(string);
		objectOutputStream.close();
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("nome.bin"));
	
		System.out.println(objectInputStream.readObject());
		objectInputStream.close();
	}

}
