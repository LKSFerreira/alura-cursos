package bytebank;

public class TestaConta {

	public static void main(String[] args) {
		Conta contaLucas = new Conta();
		
		contaLucas.saldo = 400;
		System.out.println(contaLucas.saldo);
		
		contaLucas.saldo += 100;
		System.out.println(contaLucas.saldo);
		
		Conta contaIsabelly = new Conta();
		
		contaIsabelly.saldo += 1000;
		System.out.println("Conta Isabelly " + contaIsabelly.saldo);
		
		System.out.println("Conta Lucas " + contaLucas.saldo);
		
		System.out.println("Após transferência");
		contaIsabelly.tranferir(500, contaLucas);
		
		System.out.println("Conta Isabelly " + contaIsabelly.saldo);
		
		System.out.println("Conta Lucas " + contaLucas.saldo);
		
	}
}
