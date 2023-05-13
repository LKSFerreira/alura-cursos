using bytebank_exception.Funcionarios;
namespace bytebank_exception.Utilitario;
public class GerenciadorDeBonificacao
{
    public double TotalDeBonificacao { get; private set; }
    public void RegistrarBonificacoes(Funcionario funcionario)
    {
        TotalDeBonificacao += funcionario.Bonificar();
    }
}
