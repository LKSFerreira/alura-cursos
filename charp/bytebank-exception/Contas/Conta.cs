using bytebank_exception.Usuarios;
namespace bytebank_exception.Contas;
public abstract class Conta
{
    public static int TotalDeContasCriadas { get; private set; }
    public static float TaxaOperacao { get; private set; }
    public Cliente Titular { get; set; }
    public int Agencia { get; private set; }
    public int NumeroConta { get; private set; }

    private int ValidarAgencia(int numeroAgencia)
    {
        if (numeroAgencia <= 0)
        {
            throw new ArgumentException("Número de agência menor ou igual a zero!", nameof(numeroAgencia));
        }
        return numeroAgencia;
    }

    private int ValidarConta(int numeroConta)
    {
        if (numeroConta <= 0)
        {
            throw new ArgumentException("Número de conta menor ou igual a zero!", nameof(numeroConta));
        }
        return numeroConta;
    }

    public double Saldo { get; protected set; }

    public Conta(int numeroAgencia, int numeroConta, Cliente titular)
    {
        this.Agencia = ValidarAgencia(numeroAgencia);
        this.NumeroConta = ValidarConta(numeroConta);

        TaxaOperacao = 30 / TotalDeContasCriadas;
        /* Comentado para testar o tratamento de exceções
        if (numero_agencia <= 0)
        {
            throw new ArgumentException("Número de agência menor ou igual a zero!", nameof(numero_agencia));
        }
        
        
        try
        {
            TaxaOperacao = 30 / TotalDeContasCriadas;
        }
        catch (DivideByZeroException)
        {
            Console.WriteLine("Ocorreu um erro! Não é possível fazer uma divisão por zero!");
        }          
        */

        TotalDeContasCriadas++;
    }

    public bool Depositar(double valor)
    {
        if (!ValidarDeposito(valor))
        {
            return false;
        }
        this.Saldo += valor;
        return true;
    }

    protected bool ValidarDeposito(double valor)
    {
        return (valor <= 0) ? false : true;
    }

    protected abstract bool Sacar(double valor);

    protected bool ValidarSaque(double valor)
    {
        return (valor > this.Saldo && valor <= 0) ? false : true;
    }

    public bool Transferir(double valor, Conta destino)
    {
        if (Sacar(valor) && destino.Depositar(valor))
        {
            return true;
        }
        return false;
    }



    public override string ToString()
    {
        // return $"\nNome: {Nome,-20}| CPF: {Cpf,-20}| Profissão: {Profissao,-20}| Data de Nascimento: {DataNascimento.ToShortDateString()}";
        return $"Agência: {this.Agencia,-10}| Número da Conta: {this.NumeroConta,-10}| Saldo: {this.Saldo.ToString("C")}";
    }
}