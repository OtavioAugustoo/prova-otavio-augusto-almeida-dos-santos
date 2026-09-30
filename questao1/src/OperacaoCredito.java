import java.util.List;

//roduto abstracao o procedimento de concessão só conhece esta interface
public interface OperacaoCredito {

    String getModalidade();

    String getCliente();

    double calcularJurosPrimeiroMes();

    List<String> getDocumentosExigidos();
}
