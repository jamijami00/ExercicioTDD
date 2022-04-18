package tdd_fatura_boleto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class ProcessadorBoletos {

    private ArrayList processamento;

    public ProcessadorBoletos(){
        processamento = new ArrayList<Boleto>();
    }

    public void adiciona(Boleto item) {
        processamento.add(item);
    }

    public ArrayList<Boleto> getProcessamento() {
        return processamento;
    }

    public Fatura gerarFatura(String nome, double valorFatura) {
        double valorTotal = 0.0;

        for (Iterator i = processamento.iterator(); i.hasNext();){
            Boleto item = (Boleto) i.next();
            valorTotal += item.getValorPago();
        }

        return new Fatura(nome, valorTotal, LocalDate.now(), "PAGO");
    }

    public void limpaFaturas() {
        processamento.clear();
    }
}
