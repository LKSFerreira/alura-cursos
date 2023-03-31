package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	
	public static void main(String[] args) throws IOException {
		
		OutputStream outputStream = new FileOutputStream("alura3.txt");
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		
		String linhaDoArquivo = "Com ela muitos sistemas vão criar";
		bufferedWriter.write(linhaDoArquivo); bufferedWriter.newLine();
		linhaDoArquivo = "De desktops a aplicações web,";
		bufferedWriter.write(linhaDoArquivo); bufferedWriter.newLine();
		linhaDoArquivo = "Java é a escolha que sempre nos serve.";
		bufferedWriter.write(linhaDoArquivo);
		bufferedWriter.close();
		
	}

}
