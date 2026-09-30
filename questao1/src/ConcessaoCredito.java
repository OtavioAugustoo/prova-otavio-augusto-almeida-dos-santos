import java.util.Locale;

public abstract class ConcessaoCredito {

    // Metodo fábrica
    protected abstract OperacaoCredito criarOperacao(String cliente, double valorSolicitado);

    public final OperacaoCredito conceder(String cliente, double valorSolicitado) {
        OperacaoCredito operacao = criarOperacao(cliente, valorSolicitado);
        double juros = operacao.calcularJurosPrimeiroMes();
        imprimirResumo(operacao, juros);
        return operacao;
    }
    private void imprimirResumo(OperacaoCredito operacao, double juros) {
        System.out.println("== Resumo da Concessão ===");
        System.out.println("nodalidade: " + operacao.getModalidade());
        System.out.println("cliente: " + operacao.getCliente());
        System.out.println(String.format(Locale.of("pt", "BR"),
                "juros do primeiro mês: R$ %,.2f", juros));
        System.out.println("documentos exigidos: " + String.join(", ", operacao.getDocumentosExigidos()));
        System.out.println();
    }
}
