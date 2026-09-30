package artefatos;

//abstrato processamento do pagamento da reserva
public interface Pagamento {

    String processar(Reserva reserva);
}
