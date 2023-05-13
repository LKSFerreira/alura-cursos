namespace bytebank_exception.Usuarios;
public class Cliente
{
    public string Nome { get; private set; }
    public string Cpf { get; private set; }
    public string Profissao { get; private set; }
    public DateTime DataNascimento { get; private set; }

    public Cliente(string nome, string cpf, string profissao, DateTime data_nascimento)
    {
        this.Nome = nome;
        this.Cpf = cpf;
        this.Profissao = profissao;
        this.DataNascimento = data_nascimento;
    }

    public override string ToString()
    {
        return $"\nNome: {Nome,-20}| CPF: {Cpf,-20}| Profissão: {Profissao,-20}| Data de Nascimento: {DataNascimento.ToShortDateString()}";
    }
}

