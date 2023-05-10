using bytebank_adm.Funcionarios;
using bytebank_adm.Utilitario;

Funcionario lucas = new Funcionario();
lucas.Nome = "Lucas Ferreira";
lucas.Cpf = "123.456.789-10";
lucas.Salario = 2000;

Diretor vanderleia = new Diretor();
vanderleia.Nome = "Vanderleia Gomes";
vanderleia.Cpf = "456.456.789-11";
vanderleia.Salario = 5000;

GerenciadorDeBonificacao gerenciador = new GerenciadorDeBonificacao();
gerenciador.Registrar(lucas);
gerenciador.Registrar(vanderleia);

Console.WriteLine($"Total de bonificações do mês: {gerenciador.TotalDeBonificacao.ToString("C")}");

