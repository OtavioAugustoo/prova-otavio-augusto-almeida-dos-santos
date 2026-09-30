package artefatos;

//fabrica abstrata cada implementação cria a família de artefatos de UM país,

public interface FabricaArtefatosReserva {

    ComprovanteFiscal criarComprovanteFiscal();

    Pagamento criarPagamento();

    Voucher criarVoucher();
}
