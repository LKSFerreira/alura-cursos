package bytebankComposto;

public class Main {

	public static void main(String[] args) {
//		Conta contaDoLucas = new Conta(2704, 29042021);
		Conta contaDoLucas = new Conta();
		contaDoLucas.setTitular(new Cliente());
		contaDoLucas.getTitular().setNome("Lucas Ferreira");
		System.out.println(contaDoLucas.getTitular().getNome());
		System.out.println("Saldo da conta do Lucas" + contaDoLucas.getSaldo());
		
//		Conta contaDaIsabelly = new Conta(2904, 27041991);
		
		System.out.println(Conta.getTotalDeContas());
	}
}
