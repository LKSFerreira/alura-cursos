using bytebank_exception.Interfaces;
namespace bytebank_exception.Parceiros;
public class ParceiroComercial : IAutenticavel
{
    public string Senha { get; set; }
    public string Usuario { get; set; }
}