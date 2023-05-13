using bytebank_exception.Exceptions;
using bytebank_exception.Usuarios;
namespace bytebank_exception.Contas;
public abstract class Conta
{
    public static int TotalDeContasCriadas { get; private set; }
    public static float TaxaOperacao { get; private set; }
    public Cliente Titular { get; set; }
    public int Agencia { get; private set; }
    public int NumeroConta { get; private set; }
    public double Saldo { get; protected set; }

    public Conta(int numeroAgencia, int numeroConta, Cliente titular)
    {
        this.Agencia = ValidarAgencia(numeroAgencia);
        this.NumeroConta = ValidarConta(numeroConta);
        this.Saldo = 100;

        TotalDeContasCriadas++;

        ValidarTaxaOperacao();

    }
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
    private void ValidarTaxaOperacao()
    {
        try
        {
            TaxaOperacao = 30 / TotalDeContasCriadas;
        }
        catch (DivideByZeroException)
        {
            Console.ForegroundColor = ConsoleColor.Red;
            Console.Error.WriteLine($"Não é possível dividir a taxa de operação por zero!");
            Console.ResetColor();
        }
    }


    public bool Depositar(double valor)
    {
        if (!PodeDeposito(valor))
        {
            return false;
        }
        this.Saldo += valor;
        return true;
    }

    protected bool PodeDeposito(double valor)
    {
        return (valor <= 0) ? false : true;
    }

    public abstract bool Sacar(double valor);

    protected bool PodeSacar(double valor)
    {
        //return (this.Saldo < valor || valor < 0) ? throw new SaldoInsuficienteException("Operação Negada. Saldo insuficiente!") : true;
        return valor switch
        {
            _ when this.Saldo < valor => throw new SaldoInsuficienteException("Operação Negada. Saldo insuficiente!"),
            _ when valor <= 0 => throw new ValorInvalidoException("Operação Negada. Valor Inválido!"),
            _ => true
        };
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
        return $"Agência: {this.Agencia,-10}| Número da Conta: {this.NumeroConta,-8}| Saldo: {this.Saldo.ToString("C")}";
    }
}