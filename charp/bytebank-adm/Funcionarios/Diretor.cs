using bytebank_adm.SistemaInterno;

namespace bytebank_adm.Funcionarios
{
    public class Diretor : FuncionarioAutenticavel
    {
        public Diretor(string nome, string cpf) : base(nome, cpf, 5000) { }
        public override void AumentarSalario() => this.Salario *= 1.15;
        public override double Bonificar() => this.Salario *= 1.5;
    }
}