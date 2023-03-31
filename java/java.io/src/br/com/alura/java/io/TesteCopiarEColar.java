package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarEColar {

	public static void main(String[] args) throws IOException {

		InputStream inputStream = System.in;// new FileInputStream("alura.txt");
		Reader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);

		OutputStream outputStream = System.out; // new FileOutputStream("alura2.txt");
		Writer writer= new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		String linhaDoArquivo = bufferedReader.readLine();

		while (linhaDoArquivo != null && !linhaDoArquivo.isEmpty()) {
			bufferedWriter.write(linhaDoArquivo);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			linhaDoArquivo = bufferedReader.readLine();
		}

		bufferedReader.close();
		bufferedWriter.close();
	}

}
