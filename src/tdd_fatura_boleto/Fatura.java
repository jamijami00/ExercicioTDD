package tdd_fatura_boleto;

import java.util.Date;

public class Fatura {

    private String nomeCliente;
    private double valorTotal;
    private Date data;

    Fatura (String nomeCliente, double valorTotal, Date data){
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
