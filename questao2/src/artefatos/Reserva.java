package artefatos;

public class Reserva {

    private final String hospede;
    private final String documentoHospede;
    private final String hotel;
    private final int noites;
    private final double valorDiaria;

    public Reserva(String hospede, String documentoHospede, String hotel, int noites, double valorDiaria) {
        this.hospede = hospede;
        this.documentoHospede = documentoHospede;
        this.hotel = hotel;
        this.noites = noites;
        this.valorDiaria = valorDiaria;
    }

    public String getHospede() {
        return hospede;
    }

    public String getDocumentoHospede() {
        return documentoHospede;
    }

    public String getHotel() {
        return hotel;
    }

    public int getNoites() {
        return noites;
    }

    public double getValorTotal() {
        return noites * valorDiaria;
    }
}
