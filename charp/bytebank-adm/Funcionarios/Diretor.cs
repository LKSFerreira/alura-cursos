namespace bytebank_adm.Funcionarios
{
    public class Diretor : Funcionario
    {


        override public double GetBonificacao()
        {
            return Salario;
        }

        public override double PremioSemestral()
        {
            return base.PremioSemestral() + this.Salario; ;
        }


    }
}