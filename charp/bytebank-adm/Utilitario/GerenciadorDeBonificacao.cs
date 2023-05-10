
using bytebank_adm.Funcionarios;

namespace bytebank_adm.Utilitario
{
    public class GerenciadorDeBonificacao
    {
        public double TotalDeBonificacao { get; private set; }

        public void Registrar(Funcionario funcionario)
        {
            TotalDeBonificacao += funcionario.GetBonificacao();
        }
        public void Registrar(Diretor diretor)
        {
            TotalDeBonificacao += diretor.GetBonificacao();
        }


    }
}