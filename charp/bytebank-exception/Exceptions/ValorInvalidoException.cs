namespace bytebank_exception.Exceptions;

public class ValorInvalidoException : Exception
{
    public ValorInvalidoException() { }
    public ValorInvalidoException(string message) : base(message) { }

    public ValorInvalidoException(double valor, string operacao)
    : this($"Tentativa de {operacao} no valor de {valor.ToString("C")}") { }
}
