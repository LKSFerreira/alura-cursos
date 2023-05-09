using bytebank.Model.Usuarios;

namespace bytebank.Model.Contas
{
    public class ContaCorrente
    {
        public static int totalDeContasCorrente { get; private set; }
        private int numeroAgencia;
        private string conta;
        public Cliente titular;
        private double saldo;

        public ContaCorrente(int numeroAgencia, string conta, Cliente titular)
        {
            this.numeroAgencia = numeroAgencia;
            this.conta = conta;
            this.titular = titular;
            this.saldo = 0;
            totalDeContasCorrente++;
        }

        public bool Depositar(double valor)
        {
            bool podeDepositar = valor > 0;

            if (podeDepositar)
            {
                this.saldo += valor;
                return podeDepositar;
            }
            return podeDepositar;
        }

        public bool Sacar(double valor)
        {
            bool podeSacar = valor > 0 && valor <= this.saldo;

            if (podeSacar)
            {
                this.saldo -= valor;
                return true;
            }
            return false;
        }

        public bool Transferir(double valor, ContaCorrente contaDestino)
        {
            bool podeTransferir = valor > 0 && valor <= this.saldo;

            if (podeTransferir)
            {
                this.saldo -= valor;
                contaDestino.Depositar(valor);
                return true;
            }
            return false;
        }

        public void GetConta()
        {
            Console.WriteLine($"--------------------------");
            Console.WriteLine($"Dados da conta:");
            Console.WriteLine($"Conta: {this.conta}");
            Console.WriteLine($"Agência: {this.numeroAgencia}");
            Console.WriteLine($"Titular: {this.titular.nome}");
            Console.WriteLine($"CPF: {this.titular.cpf}");
            Console.WriteLine($"Profissão: {this.titular.profissao}");
            Console.WriteLine($"Saldo: {this.saldo}");
            Console.WriteLine($"--------------------------");
        }

        public double GetSaldo()
        {
            return this.saldo;
        }

        public void SetSaldo(double saldo)
        {
            if (saldo > 0)
            {
                this.saldo = saldo;
            }
        }

    }
}