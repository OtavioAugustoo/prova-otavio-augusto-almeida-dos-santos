// Criador concreto
public class ConcessaoCreditoPessoal extends ConcessaoCredito {

    @Override
    protected OperacaoCredito criarOperacao(String cliente, double valorSolicitado) {
        return new CreditoPessoal(cliente, valorSolicitado);
    }
}
