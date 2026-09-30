// Criador concreto
public class ConcessaoCreditoConsignado extends ConcessaoCredito {

    @Override
    protected OperacaoCredito criarOperacao(String cliente, double valorSolicitado) {
        return new CreditoConsignado(cliente, valorSolicitado);
    }
}
