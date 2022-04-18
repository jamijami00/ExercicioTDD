package tdd_fatura_boleto;

import java.util.ArrayList;

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
}
