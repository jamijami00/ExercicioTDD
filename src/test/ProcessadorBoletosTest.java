package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tdd_fatura_boleto.Boleto;
import tdd_fatura_boleto.Fatura;
import tdd_fatura_boleto.ProcessadorBoletos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProcessadorBoletosTest {

    @Test
    public void testAdicionarBoleto(){

        ProcessadorBoletos pb = new ProcessadorBoletos();
        Boleto b1 = new Boleto(1,"BOLETO", LocalDate.now(),500.00);

        pb.adiciona(b1);

        assertFalse(pb.getProcessamento().isEmpty());
    }

    @Test
    public void testGerarFatura(){
        ProcessadorBoletos pb = new ProcessadorBoletos();
        Boleto b1 = new Boleto(1,"BOLETO", LocalDate.now(),500.00);
        pb.adiciona(b1);
        Boleto b2 = new Boleto(2,"BOLETO", LocalDate.now(),400.00);
        pb.adiciona(b2);
        Boleto b3 = new Boleto(3,"BOLETO", LocalDate.now(),600.00);
        pb.adiciona(b3);
        Fatura f1 = pb.gerarFatura("João", 1500.00);

        assertEquals("PAGO", f1.getStatus());
    }

}
