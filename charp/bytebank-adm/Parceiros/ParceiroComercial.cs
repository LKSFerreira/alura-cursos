using bytebank_adm.Interfaces;

namespace bytebank_adm.Parceiros
{
    public class ParceiroComercial : IAutenticavel
    {
        public string Senha { get; set; }
        public string Usuario { get; set; }
    }
}