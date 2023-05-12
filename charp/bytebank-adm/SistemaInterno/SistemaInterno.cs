using bytebank_adm.Interfaces;

namespace bytebank_adm.SistemaInterno
{
    public class SistemaInterno
    {
        public bool Logar(IAutenticavel autenticavel, string usuario, string senha)
        {
            bool usuarioAutenticado = autenticavel.Autenticar(usuario, senha);

            if (usuarioAutenticado)
            {
                System.Console.WriteLine("Bem vindo ao sistema!");
                return true;
            }
            else
            {
                System.Console.WriteLine("Senha incorreta!");
                return false;
            }
        }
    }
}