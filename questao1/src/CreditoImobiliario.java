import java.util.List;

//Produto concretRF03
public class CreditoImobiliario implements OperacaoCredito {

    private static final double TAXA_JUROS = 0.008;

    private final String cliente;
    private final double valorSolicitado;

    public CreditoImobiliario(String cliente, double valorSolicitado) {
        this.cliente = cliente;
        this.valorSolicitado = valorSolicitado;
    }

    @Override
    public String getModalidade() {
        return "Crédito Imobiliário";
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
        return List.of("Matrícula do imóvel", "Comprovante de renda");
    }
}
