using bytebank_exception.Usuarios;

namespace bytebank_exception.Contas;
public class ContaCorrente : Conta
{
    public ContaCorrente(int agencia, int numeroConta, Cliente titular) : base(agencia, numeroConta, titular) { }

    public override bool Sacar(double valor)
    {
        if (!PodeSacar(valor))
        {
            return false;
        }

        this.Saldo -= valor + TaxaOperacao;
        return true;
    }
}
