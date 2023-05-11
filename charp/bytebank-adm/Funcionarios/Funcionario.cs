namespace bytebank_adm.Funcionarios
{
    public abstract class Funcionario
    {
        public static int TotalDeFuncionarios { get; private set; }
        public string Nome { get; private set; }
        public string Cpf { get; private set; }
        public double Salario { get; protected set; }

        public Funcionario(string nome, string cpf, double salario)
        {
            this.Nome = nome;
            this.Cpf = cpf;
            this.Salario = salario;
            TotalDeFuncionarios++;
        }

        public abstract double GetBonificacao();

        public abstract void AumentarSalario();

        public void MostrarFuncionario()
        {
            System.Console.WriteLine($"Nome: {this.Nome}");
            System.Console.WriteLine($"CPF: {this.Cpf}");
            System.Console.WriteLine($"Salário: {this.Salario.ToString("C")}");
            // System.Console.WriteLine($"Bonificação: {this.GetBonificacao().ToString("C")}");
            // System.Console.WriteLine($"Prêmio semestral: {this.PremioSemestral().ToString("C")}");
        }

    }
}