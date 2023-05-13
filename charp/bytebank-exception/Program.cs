﻿using bytebank_exception.Contas;
using bytebank_exception.Funcionarios;
using bytebank_exception.Parceiros;
using bytebank_exception.SistemaInterno;
using bytebank_exception.Usuarios;
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

try
{
    Cliente clienteLucas = new Cliente("Lucas Ferreira", "123.456.789-10", "Desenvolvedor", new DateTime(1991, 04, 27));
    Console.WriteLine($"Titular: {clienteLucas}");

    Conta contaLucas = new ContaCorrente(7, 123456, clienteLucas);
    Console.WriteLine($"Conta: {contaLucas}");

}
catch (ArgumentException ex)
{
    Console.ForegroundColor = ConsoleColor.Red;
    Console.WriteLine($"{ex.Message}");
    Console.ResetColor();
}
