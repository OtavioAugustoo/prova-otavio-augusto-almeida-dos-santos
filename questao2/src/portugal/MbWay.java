package portugal;

import artefatos.Pagamento;
import artefatos.Reserva;

class MbWay implements Pagamento {

    @Override
    public String processar(Reserva reserva) {
        return String.format("MB WAY de Euro %.2f processado com sucesso", reserva.getValorTotal());
    }
}
