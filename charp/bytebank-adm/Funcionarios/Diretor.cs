namespace bytebank_adm.Funcionarios
{
    public class Diretor : Funcionario
    {
        public Diretor(string nome, string cpf) : base(nome, cpf, 5000)
        {
        }

        override public double GetBonificacao()
        {
            return this.Salario *= 1.5;
        }

        public override void AumentarSalario()
        {
            this.Salario *= 1.15;
        }
    }
}