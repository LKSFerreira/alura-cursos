namespace bytebank_exception.Exceptions;

public class SaldoInsuficienteException : Exception
{
    public SaldoInsuficienteException() { }
    public SaldoInsuficienteException(string mensagem) : base(mensagem) { }

    public SaldoInsuficienteException(double saldo, double valorSaque)
    : this($"Tentativa de saque no valor de {valorSaque.ToString("C")} em uma conta com saldo de {saldo.ToString("C")}") { }

}
