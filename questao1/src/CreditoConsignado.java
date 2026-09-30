import java.util.List;

//produto concreto RF02
public class CreditoConsignado implements OperacaoCredito {

    private static final double TAXA_JUROS = 0.018;

    private final String cliente;
    private final double valorSolicitado;

    public CreditoConsignado(String cliente, double valorSolicitado) {
        this.cliente = cliente;
        this.valorSolicitado = valorSolicitado;
    }

    @Override
    public String getModalidade() {
        return "Crédito Consignado";
    }

    @Override
    public String getCliente() {
        return cliente;
    }

    @Override
    public double calcularJurosPrimeiroMes() {
        return valorSolicitado * TAXA_JUROS;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Contracheque ou extrato de benefício");
    }
}
