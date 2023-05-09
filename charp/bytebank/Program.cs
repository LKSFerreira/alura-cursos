using bytebank;

ContaCorrente contaDoLucas = new ContaCorrente();
contaDoLucas.numeroAgencia = 863;
contaDoLucas.conta = "863146";
contaDoLucas.titular = "Bruno";
contaDoLucas.saldo = 100;

contaDoLucas.Depositar(500);
Console.WriteLine($"Saldo da conta do Bruno: {contaDoLucas.saldo}");

bool sacou = contaDoLucas.Sacar(800);
Console.WriteLine($"Saque realizado com sucesso? {sacou}");
Console.WriteLine($"Saldo da conta do Bruno: {contaDoLucas.saldo}");