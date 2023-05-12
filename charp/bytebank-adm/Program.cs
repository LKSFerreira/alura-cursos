using bytebank_adm.Funcionarios;
using bytebank_adm.Parceiros;
using bytebank_adm.SistemaInterno;
using bytebank_adm.Utilitario;

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
