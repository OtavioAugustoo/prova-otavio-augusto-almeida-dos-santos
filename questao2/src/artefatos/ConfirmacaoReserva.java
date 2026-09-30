package artefatos;

//Cliente do abstract factory só conhece as interfaces, nunca as classes concretas

public class ConfirmacaoReserva {

    private final FabricaArtefatosReserva fabrica;

    public ConfirmacaoReserva(FabricaArtefatosReserva fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(Reserva reserva) {
        ComprovanteFiscal comprovante = fabrica.criarComprovanteFiscal();
        Pagamento pagamento = fabrica.criarPagamento();
        Voucher voucher = fabrica.criarVoucher();

        // relatorio com a descrição dos três artefatos gerados
        System.out.println("===Reserva confirmada: "+reserva.getHotel()+"=====");
        System.out.println("Comprovante fiscal: " + comprovante.descrever(reserva));
        System.out.println("Pagamento: " + pagamento.processar(reserva));
        System.out.println("Voucher: " + voucher.descrever(reserva));
        System.out.println();
    }
}
