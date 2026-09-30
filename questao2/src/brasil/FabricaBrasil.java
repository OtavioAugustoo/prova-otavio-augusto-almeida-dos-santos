package brasil;

import artefatos.ComprovanteFiscal;
import artefatos.FabricaArtefatosReserva;
import artefatos.Pagamento;
import artefatos.Voucher;

//fabrica concreta cria apenas artefatos do Brasil
public class FabricaBrasil implements FabricaArtefatosReserva {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new NfseIss();
    }

    @Override
    public Pagamento criarPagamento() {
        return new Pix();
    }

    @Override
    public Voucher criarVoucher() {
        return new VoucherCpf();
    }
}
