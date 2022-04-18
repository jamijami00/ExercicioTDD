package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tdd_fatura_boleto.Boleto;
import tdd_fatura_boleto.ProcessadorBoletos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ProcessadorBoletosTest {

    @Test
    public void testAdicionarBoleto(){

        ProcessadorBoletos pb = new ProcessadorBoletos();
        Boleto b1 = new Boleto(1,"BOLETO", LocalDate.now(),500.00);

        pb.adiciona(b1);

        Assertions.assertFalse(pb.getProcessamento().isEmpty());
    }

}
