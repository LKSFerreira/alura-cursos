package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	
	public static void main(String[] args) throws IOException {
		

		FileWriter fileWriter = new FileWriter("alura3.txt");		
//		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
//		fileWriter.write("Com ela muitos sistemas vão criar");
//		fileWriter.write(System.lineSeparator());
//		fileWriter.write("De desktops a aplicações web,");
//		fileWriter.close();
		
		
		bufferedWriter.write("Mas com classe eu vou jogar");
		bufferedWriter.newLine();
		bufferedWriter.write("Um bytecode vou codar");
		bufferedWriter.close();
		
		
	}

}
