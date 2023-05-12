using bytebank_adm.Interfaces;

namespace bytebank_adm.Funcionarios
{
    public abstract class FuncionarioAutenticavel : Funcionario, IAutenticavel
    {
        protected FuncionarioAutenticavel(string nome, string cpf, double salario) : base(nome, cpf, salario) { }

        public string Senha { get; set; }
        public string Usuario { get; set; }
    }
}