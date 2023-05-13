using bytebank_exception.Contas;
using bytebank_exception.Funcionarios;
using bytebank_exception.Parceiros;
using bytebank_exception.SistemaInterno;
using bytebank_exception.Usuarios;
using bytebank_exception.Util;
using bytebank_exception.Utilitario;

#region
/*
Auxiliar lucas = new Auxiliar("Lucas Ferreira", "123.456.789-10");
lucas.AumentarSalario();
lucas.MostrarFuncionario();

Console.WriteLine($"=====================================");

Designer sofia = new Designer("Sofia Ferreira", "789.456.789-12");
sofia.AumentarSalario();
sofia.MostrarFuncionario();

Console.WriteLine($"=====================================");

Diretor vanderleia = new Diretor("Vanderleia Gomes", "456.456.789-11");
vanderleia.AumentarSalario();
vanderleia.Usuario = "vanny";
vanderleia.Senha = "123";
vanderleia.MostrarFuncionario();

Console.WriteLine($"=====================================");

GerenteDeContas isabelly = new GerenteDeContas("Isabelly Sofia", "789.456.789-12");
isabelly.AumentarSalario();
isabelly.Usuario = "isa";
isabelly.Senha = "456";
isabelly.MostrarFuncionario();

Console.WriteLine($"=====================================");

GerenciadorDeBonificacao gerenciador = new GerenciadorDeBonificacao();
gerenciador.RegistrarBonificacoes(lucas);
gerenciador.RegistrarBonificacoes(vanderleia);
gerenciador.RegistrarBonificacoes(isabelly);
gerenciador.RegistrarBonificacoes(sofia);

Console.WriteLine($"Total de bonificações do mês: {gerenciador.TotalDeBonificacao.ToString("C")}");
Console.WriteLine($"Total de funcionários: {Funcionario.TotalDeFuncionarios}");

Console.WriteLine($"=====================================");

ParceiroComercial alura = new ParceiroComercial();
alura.Usuario = "alura";
alura.Senha = "Top_01_Brasil";

EntraNoSistemaInterno();


void EntraNoSistemaInterno()
{
    SistemaInterno sistemaInterno = new SistemaInterno();

    sistemaInterno.Logar(vanderleia, "vanny", "123");
    sistemaInterno.Logar(isabelly, "isa", "123");
    sistemaInterno.Logar(alura, "alura", "Top_01_Brasil");
}
*/
#endregion

#region
/*
try
{
    Cliente clienteLucas = new Cliente("Lucas Ferreira", "123.456.789-10", "Desenvolvedor", new DateTime(1991, 04, 27));
    Console.WriteLine($"Titular: {clienteLucas}");
    Conta contaLucas = new ContaCorrente(7, 123456, clienteLucas);
    Console.WriteLine($"Conta: {contaLucas}");

    Console.WriteLine($"=====================================");

    Cliente clienteIsabelly = new Cliente("Isabelly Sofia", "789.456.789-12", "Estudante", new DateTime(2021, 04, 29));
    Console.WriteLine($"Titular: {clienteIsabelly}");
    Conta contaIsabelly = new ContaCorrente(2, 456789, clienteIsabelly);
    Console.WriteLine($"Conta: {contaIsabelly}");

    Console.WriteLine($"=====================================");

    contaLucas.Sacar(50);
    Console.WriteLine($"Saldo: {contaLucas.Saldo.ToString("C")}");

    contaLucas.Sacar(150);
    Console.WriteLine($"Saldo: {contaLucas.Saldo.ToString("C")}");
}
catch (Exception ex)
{
    Console.ForegroundColor = ConsoleColor.Red;
    Console.WriteLine($"{ex.Message}");
    Console.WriteLine($"Quantidade de saques bloqueados: {ContaCorrente.QuantidadeSaquesBloqueados}");
    Console.WriteLine($"Quantidade de transferebcias bloqueadas: {ContaCorrente.QuantidadeTransferenciasBloqueadas}");
    Console.ResetColor();

    Console.WriteLine("Informações da Inner Exception (exceção interna):");
    Console.WriteLine(ex.InnerException.Message);
    Console.WriteLine(ex.InnerException.StackTrace);
}
finally
{
    Console.WriteLine($"Obrigado por utilizar nossos serviços!");
}
*/
#endregion

LeitorDeArquivo leitor = new LeitorDeArquivo("contas.txt");
try
{
    Console.WriteLine($"Arquivo: {leitor.Arquivo}");
    leitor.LerProximaLinha();
    leitor.LerProximaLinha();
    leitor.LerProximaLinha();
}
catch (IOException)
{
    Console.WriteLine($"Leitura de arquivo interrompida.");
}
catch (Exception ex)
{
    Console.WriteLine($"Erro genérico: {ex.Message}");
}
finally
{
    leitor.Fechar();
}

