package bytebankHerdadoImposto;

public class Main {

	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.depositar(100);

		ContaPoupanca contaPoupanca = new ContaPoupanca(222, 222);
		contaPoupanca.depositar(100.0);
		
		SeguroVida seguroVida = new SeguroVida();
		
		seguroVida.setValorSeguroVida(1000);
		
		CalculaImposto calculaImposto = new CalculaImposto();
		
		calculaImposto.calcularImposto(seguroVida);
		calculaImposto.calcularImposto(contaCorrente);
		
		System.out.println("Total de imposto a pagar: " + calculaImposto.getTotalValorImposto());
				
		System.out.println("O valor do seguro de vida é de " + seguroVida.getValorSeguroVida());
		System.out.println("O valor do imposto do seguro de vida: " + seguroVida.getValorImposto());
		System.out.println("---------------------------------");
		System.out.println("Imposto Conta Corrente: " + contaCorrente.getValorImposto()); 
		System.out.println("Saldo Conta Correte: " + contaCorrente.getSaldo());
		System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());

	}

}
