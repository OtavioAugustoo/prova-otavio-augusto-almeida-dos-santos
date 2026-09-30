package brasil;

import artefatos.Pagamento;
import artefatos.Reserva;

class Pix implements Pagamento {

    @Override
    public String processar(Reserva reserva) {
        return String.format("Pix de R$ %.2f processado com sucesso", reserva.getValorTotal());
    }
}
