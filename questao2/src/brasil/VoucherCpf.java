package brasil;

import artefatos.Reserva;
import artefatos.Voucher;

class VoucherCpf implements Voucher {

    @Override
    public String descrever(Reserva reserva) {
        return String.format("Voucher padrão Brasil|Hóspede: %s |CPF: %s |%d noite(s)",
                reserva.getHospede(), reserva.getDocumentoHospede(), reserva.getNoites());
    }
}
