namespace bytebank_adm.Funcionarios
{
    public class Funcionario
    {
        public string Nome { get; set; }
        public string Cpf { get; set; }
        public double Salario { get; set; }

        public virtual double GetBonificacao()
        {
            return Salario * 0.10;
        }

        public virtual double PremioSemestral()
        {
            double bonusDe20Porcento = .2;
            return this.Salario * bonusDe20Porcento;
        }


    }
}