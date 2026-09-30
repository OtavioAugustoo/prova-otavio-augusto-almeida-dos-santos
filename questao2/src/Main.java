import artefatos.ConfirmacaoReserva;
import artefatos.Reserva;
import brasil.FabricaBrasil;
import portugal.FabricaPortugal;

public class Main {

    public static void main(String[] args) {
        Reserva reservaBrasil = new Reserva("Otavio Augusto Almeida dos Santos", "123.456.789-00", "Hotel Rio de Janeiro", 3, 450.00);
        ConfirmacaoReserva confirmacaoBrasil = new ConfirmacaoReserva(new FabricaBrasil());
        confirmacaoBrasil.confirmar(reservaBrasil);

        Reserva reservaPortugal = new Reserva("Leandro Escobar", "234567890", "Hotel Lisboa", 2, 120.00);
        ConfirmacaoReserva confirmacaoPortugal = new ConfirmacaoReserva(new FabricaPortugal());
        confirmacaoPortugal.confirmar(reservaPortugal);
    }
}
