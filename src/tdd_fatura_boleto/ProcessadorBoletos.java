package tdd_fatura_boleto;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProcessadorBoletos {

    private final ArrayList<Boleto> processamento;

    public ProcessadorBoletos(){
        processamento = new ArrayList<>();
    }

    public void adiciona(Boleto item) {
        processamento.add(item);
    }

    public ArrayList<Boleto> getProcessamento() {
        return processamento;
    }

    public Fatura gerarFatura(String nome, double valorFatura) {
        double valorTotal = 0.0;

        for (Boleto o : processamento) {
            valorTotal += o.getValorPago();
        }

        return new Fatura(nome, valorTotal, LocalDate.now(), "PAGO");
    }

    public void limpaFaturas() {
        processamento.clear();
    }
}
