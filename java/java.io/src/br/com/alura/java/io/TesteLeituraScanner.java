package br.com.alura.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linhaContas = scanner.nextLine();
//			System.out.println(linhaContas);
			
			Scanner linhaScanner = new Scanner(linhaContas);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numeroConta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			String stringFormatada = String.format(new Locale("pt", "BR"), "%s - %04d-%07d %15s: %.2f",
													tipoConta, agencia, numeroConta, titular, saldo);
			
			System.out.println(stringFormatada);
			
			linhaScanner.close();
		}
		
		scanner.close();

	}

}
