package portugal;

import artefatos.ComprovanteFiscal;
import artefatos.Reserva;

// Visivel apenas no pacote só a FabricaPortugal consegue instanciá-la 
class FaturaIva implements ComprovanteFiscal {

    private static final double ALIQUOTA_IVA = 0.06;

    @Override
    public double calcularImposto(double valor) {
        return valor * ALIQUOTA_IVA;
    }

    @Override
    public String descrever(Reserva reserva) {
        double valor = reserva.getValorTotal();
        return String.format("Fatura | valor Euro %.2f | IVA 6%% = Euro %.2f", valor, calcularImposto(valor));
    }
}
