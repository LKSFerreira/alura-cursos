package br.com.alura.java.io;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	
	public static void main(String[] args) throws IOException {
		
		long inicioTempo = System.currentTimeMillis();
		
		PrintStream printStream = new PrintStream("alura3.txt");	
		printStream.println("Com ela muitos sistemas vão criar");
		printStream.println();
		printStream.println("De desktops a aplicações web,");
		printStream.close();
		
		PrintWriter printWriter = new PrintWriter("alura3.txt");
		printWriter.println("Mas com classe eu vou jogar");
		printWriter.println();
		printWriter.print("Um bytecode ");
		printWriter.println("vou codar");
		printWriter.close();
		
		long fimTempo = System.currentTimeMillis();
		
		System.err.println("Tempo total: " + (fimTempo-inicioTempo) + " em milisegundos");
		
	}

}
