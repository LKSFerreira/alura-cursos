package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteLeitura {

	
	public static void main(String[] args) throws IOException {
		
		InputStream fileInputStream = new FileInputStream("alura.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String linhaDoArquivo = bufferedReader.readLine();
		
		while (linhaDoArquivo != null) {
			System.out.println(linhaDoArquivo);
			linhaDoArquivo = bufferedReader.readLine();
		}
		
		bufferedReader.close();
	}

}
