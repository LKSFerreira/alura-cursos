namespace bytebank_adm.Funcionarios
{
    public class GerenteDeContas : FuncionarioAutenticavel
    {
        public GerenteDeContas(string nome, string cpf) : base(nome, cpf, 4000) { }
        public override void AumentarSalario() => this.Salario *= 1.05;
        public override double Bonificar() => this.Salario *= 1.25;
    }
}