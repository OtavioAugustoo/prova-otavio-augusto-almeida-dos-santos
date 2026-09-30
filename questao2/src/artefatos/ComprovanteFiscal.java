package artefatos;

//abstrato comprovante fiscal da reserva
public interface ComprovanteFiscal {

    double calcularImposto(double valor);

    String descrever(Reserva reserva);
}
