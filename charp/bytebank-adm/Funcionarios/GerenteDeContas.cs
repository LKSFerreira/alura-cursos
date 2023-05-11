namespace bytebank_adm.Funcionarios
{
    public class GerenteDeContas : Funcionario
    {
        public GerenteDeContas(string nome, string cpf) : base(nome, cpf, 4000)
        {
        }

        public override void AumentarSalario()
        {
            this.Salario *= 1.05;
        }

        public override double GetBonificacao()
        {
            return this.Salario *= 1.25;
        }
    }
}