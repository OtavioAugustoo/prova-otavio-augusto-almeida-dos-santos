// Criador concreto
public class ConcessaoCreditoImobiliario extends ConcessaoCredito {

    @Override
    protected OperacaoCredito criarOperacao(String cliente, double valorSolicitado) {
        return new CreditoImobiliario(cliente, valorSolicitado);
    }
}
