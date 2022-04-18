package tdd_fatura_boleto;

import java.time.LocalDate;

public class Fatura {

    private String nomeCliente;
    private double valorTotal;
    private LocalDate data;
    private String status;

    public Fatura(String nomeCliente, double valorTotal, LocalDate data, String status) {
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.data = data;
        this.status = status;
    }

    Fatura (String nomeCliente, double valorTotal, LocalDate data){
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
