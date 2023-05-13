using bytebank_exception.Interfaces;
namespace bytebank_exception.Funcionarios;
public class Auxiliar : Funcionario, IBonificacao
{
    public Auxiliar(string nome, string cpf) : base(nome, cpf, 2000) { }
    public override void AumentarSalario() => this.Salario *= 1.1;
    public override double Bonificar() => this.Salario *= 1.2;

}