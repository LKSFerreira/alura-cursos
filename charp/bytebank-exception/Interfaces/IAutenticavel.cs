namespace bytebank_exception.Interfaces;
public interface IAutenticavel
{
    protected string Senha { get; set; }
    protected string Usuario { get; set; }
    public bool Autenticar(string usuario, string senha) => this.Usuario == usuario && this.Senha == senha;
}