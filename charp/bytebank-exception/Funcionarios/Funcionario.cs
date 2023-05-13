using bytebank_exception.Interfaces;
namespace bytebank_exception.Funcionarios;
public abstract class Funcionario : IBonificacao
{
    public static int TotalDeFuncionarios { get; private set; }
    public string Nome { get; private set; }
    public string Cpf { get; private set; }
    public double Salario { get; protected set; }
    protected Funcionario(string nome, string cpf, double salario)
    {
        this.Nome = nome;
        this.Cpf = cpf;
        this.Salario = salario;
        TotalDeFuncionarios++;
    }
    public abstract void AumentarSalario();
    public void MostrarFuncionario()
    {
        Console.WriteLine($"Nome: {this.Nome}");
        Console.WriteLine($"CPF: {this.Cpf}");
        Console.WriteLine($"Salário: {this.Salario.ToString("C")}");
    }
    public abstract double Bonificar();
}
