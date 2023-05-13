namespace bytebank_exception.Usuarios;
public class Cliente
{
    public string Nome { get; private set; }
    public int Cpf { get; private set; }
    public string Profissao { get; private set; }
    public DateTime DataNascimento { get; private set; }
}