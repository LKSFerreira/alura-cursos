namespace bytebank_adm.Funcionarios
{
    public class Auxiliar : Funcionario
    {
        public Auxiliar(string nome, string cpf) : base(nome, cpf, 2000)
        {
        }

        public override void AumentarSalario()
        {
            this.Salario *= 1.1;
        }

        public override double GetBonificacao()
        {
            return this.Salario *= 1.2;
        }
    }
}