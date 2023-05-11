
using bytebank_adm.Funcionarios;

namespace bytebank_adm.Utilitario
{
    public class GerenciadorDeBonificacao
    {
        public double TotalDeBonificacao { get; private set; }
        public double TotalDePremioSemestral { get; private set; }

        public void RegistrarBonificacoes(Funcionario funcionario)
        {
            TotalDeBonificacao += funcionario.GetBonificacao();
            TotalDePremioSemestral += funcionario.PremioSemestral();
        }

    }
}