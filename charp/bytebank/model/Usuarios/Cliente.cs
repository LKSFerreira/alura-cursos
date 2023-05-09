namespace bytebank.Model.Usuarios
{
    public class Cliente
    {
        public int totalDeCliente { get; private set; }
        public string nome;
        public string cpf;
        public string profissao;

        public Cliente(string nome, string cpf, string profissao)
        {
            this.nome = nome;
            this.cpf = cpf;
            this.profissao = profissao;
            totalDeCliente++;
        }

    }
}