import java.util.List;


public class CreditoPessoal implements OperacaoCredito {

    private static final double TAXA_JUROS = 0.035;

    private final String cliente;
    private final double valorSolicitado;

    public CreditoPessoal(String cliente, double valorSolicitado) {
        this.cliente = cliente;
        this.valorSolicitado = valorSolicitado;
    }

    @Override
    public String getModalidade() {
        return "Crédito Pessoal";
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
        return List.of("Documento de identidade", "Comprovante de renda");
    }
}
