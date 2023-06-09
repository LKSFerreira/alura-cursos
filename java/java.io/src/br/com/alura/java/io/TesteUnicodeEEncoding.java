package br.com.alura.java.io;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws IOException {
		String s = "çé";
		System.out.println(s.codePointAt(1));

		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);

		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);

		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + ", US_ASCII, ");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);

	}

}
