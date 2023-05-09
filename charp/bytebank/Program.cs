using bytebank.Model.Contas;
using bytebank.Model.Usuarios;

ContaCorrente contaDoLucas = new ContaCorrente(863, "863146", new Cliente("Lucas Ferreira", "123.456.789-10", "Desenvolvedor"));
contaDoLucas.SetSaldo(0);

contaDoLucas.Depositar(500);
Console.WriteLine($"Saldo da conta do Lucas: {contaDoLucas.GetSaldo()}");

bool sacou = contaDoLucas.Sacar(100);
Console.WriteLine($"Saldo da conta do Lucas: {contaDoLucas.GetSaldo()}");

ContaCorrente contaDaVanderleia = new ContaCorrente(368, "465789", new Cliente("Vanderleia Gomes", "019.876.543-21", "Técnica em Enfermagem"));
Console.WriteLine($"Saldo da conta da Vanderleia: {contaDaVanderleia.GetSaldo()}");

contaDoLucas.Transferir(2100, contaDaVanderleia);
Console.WriteLine($"Saldo da conta do Lucas: {contaDoLucas.GetSaldo()}");
Console.WriteLine($"Saldo da conta da Vanderleia: {contaDaVanderleia.GetSaldo()}");

contaDoLucas.Transferir(100, contaDaVanderleia);
Console.WriteLine($"Saldo da conta do Lucas: {contaDoLucas.GetSaldo()}");
Console.WriteLine($"Saldo da conta da Vanderleia: {contaDaVanderleia.GetSaldo()}");

contaDoLucas.GetConta();
contaDaVanderleia.GetConta();

Console.WriteLine($"Total de contas corrente: {ContaCorrente.totalDeContasCorrente}");
Console.WriteLine($"Total de clientes: {Cliente.totalDeCliente}");

