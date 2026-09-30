
public class Main {

    public static void main(String[] args) {
        ConcessaoCredito[] concessoes = {
                new ConcessaoCreditoPessoal(),
                new ConcessaoCreditoConsignado(),
                new ConcessaoCreditoImobiliario()
        };
        String[] clientes = { "Ana Souza", "Bruno Lima", "Carla Mendes" };
        double[] valores = { 10_000.00, 20_000.00, 300_000.00 };

        for (int i = 0; i < concessoes.length; i++) {
            concessoes[i].conceder(clientes[i], valores[i]);
        }
    }
}
