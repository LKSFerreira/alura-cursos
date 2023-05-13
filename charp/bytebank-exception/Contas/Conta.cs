using bytebank_exception.Usuarios;
namespace bytebank_exception.Contas;
public class Conta
{
    public static int TotalDeContasCriadas { get; private set; }
    public static float TaxaOperacao { get; private set; }
    public Cliente Titular { get; set; }
    public int NumeroConta
    {
        get { return NumeroConta; }

        private set
        {
            if (value > 0)
            {
                NumeroConta = value;
            }
        }
    }
    public int Agencia
    {
        get { return Agencia; }
        private set
        {
            if (value > 0)
            {
                Agencia = value;
            }
        }
    }
    public double Saldo { get; private set; }
    public bool Depositar(double valor)
    {
        if (valor <= 0)
        {
            return false;
        }
        this.Saldo += valor;
        return true;
    }
    public bool Sacar(double valor)
    {
        if (valor <= this.Saldo && valor > 0)
        {
            return false;
        }

        this.Saldo -= valor;
        return true;
    }
    public bool Transferir(double valor, Conta destino)
    {
        if (Sacar(valor) && destino.Depositar(valor))
        {
            return true;
        }
        return false;
    }
    public Conta(int numero_agencia, int numero_conta)
    {
        this.Agencia = numero_agencia;
        this.NumeroConta = numero_conta;

        if (numero_agencia <= 0)
        {
            throw new ArgumentException("Número de agência menor ou igual a zero!", nameof(numero_agencia));
        }

        /*
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

}