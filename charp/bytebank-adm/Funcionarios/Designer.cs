namespace bytebank_adm.Funcionarios
{
    public class Designer : Funcionario
    {
        public Designer(string nome, string cpf) : base(nome, cpf, 3000) { }
        public override void AumentarSalario() => this.Salario *= 1.11;
        public override double Bonificar() => this.Salario *= 1.17;
    }
}