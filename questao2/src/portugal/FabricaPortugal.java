package portugal;

import artefatos.ComprovanteFiscal;
import artefatos.FabricaArtefatosReserva;
import artefatos.Pagamento;
import artefatos.Voucher;

//fabrica concreta cria apenas artefatos de portugal
public class FabricaPortugal implements FabricaArtefatosReserva {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new FaturaIva();
    }

    @Override
    public Pagamento criarPagamento() {
        return new MbWay();
    }

    @Override
    public Voucher criarVoucher() {
        return new VoucherNif();
    }
}
