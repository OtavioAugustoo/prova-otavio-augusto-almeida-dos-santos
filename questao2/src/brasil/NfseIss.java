package brasil;

import artefatos.ComprovanteFiscal;
import artefatos.Reserva;

class NfseIss implements ComprovanteFiscal {

    private static final double ALIQUOTA_ISS = 0.05;

    @Override
    public double calcularImposto(double valor) {
        return valor * ALIQUOTA_ISS;
    }

    @Override
    public String descrever(Reserva reserva) {
        double valor = reserva.getValorTotal();
        return String.format("NFS-e|valor R$ %.2f | ISS 5%% = R$ %.2f", valor, calcularImposto(valor));
    }
}
