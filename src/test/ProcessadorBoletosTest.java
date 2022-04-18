package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tdd_fatura_boleto.Boleto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ProcessadorBoletosTest {

    private ProcessadorBoletos pb = new ProcessadorBoletos();
    private ArrayList<Boleto> processamento;

    @Test
    public void testAdicionarBoleto(){

        pb.adiciona(1, LocalDate.now(), "BOLETO", 500.00);
        Assertions.assertFalse(processamento.isEmpty());
    }

}
