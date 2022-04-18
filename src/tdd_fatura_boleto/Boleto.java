package tdd_fatura_boleto;

import java.time.LocalDate;

public class Boleto {

    private int codigo;
    private String tipo;
    private LocalDate data;
    private double valorPago;

    public Boleto(int codigo, String tipo, LocalDate data, double valorPago) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.data = data;
        this.valorPago = valorPago;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
}
