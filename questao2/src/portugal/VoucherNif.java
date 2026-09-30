package portugal;

import artefatos.Reserva;
import artefatos.Voucher;

class VoucherNif implements Voucher {

    @Override
    public String descrever(Reserva reserva) {
        return String.format("Voucher padrão Portugal | Hóspede: %s | NIF: %s | %d noite(s)",
                reserva.getHospede(), reserva.getDocumentoHospede(), reserva.getNoites());
    }
}
