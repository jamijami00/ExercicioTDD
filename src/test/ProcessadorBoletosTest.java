package test;

import org.junit.jupiter.api.Test;
import tdd_fatura_boleto.Boleto;
import tdd_fatura_boleto.Fatura;
import tdd_fatura_boleto.ProcessadorBoletos;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorBoletosTest {
    private static final String BOLETO = "BOLETO";


    @Test
    public void testAdicionarBoleto(){

        ProcessadorBoletos pb = new ProcessadorBoletos();
        Boleto b1 = new Boleto(1,BOLETO, LocalDate.now(),500.00);

        pb.adiciona(b1);

        assertFalse(pb.getProcessamento().isEmpty());
    }

    @Test
    public void testGerarFatura(){
        ProcessadorBoletos pb = new ProcessadorBoletos();

        //Iteração 1
        Boleto a1 = new Boleto(1,BOLETO, LocalDate.now(),500.00);
        pb.adiciona(a1);
        Boleto a2 = new Boleto(2,BOLETO, LocalDate.now(),400.00);
        pb.adiciona(a2);
        Boleto a3 = new Boleto(3,BOLETO, LocalDate.now(),600.00);
        pb.adiciona(a3);
        Fatura f1 = pb.gerarFatura("João", 1500.00);

        assertEquals("PAGO", f1.getStatus());
        pb.limpaFaturas();

        //Iteração 2
        Boleto b1 = new Boleto(1, BOLETO, LocalDate.now(), 1000.00);
        Boleto b2 = new Boleto(2, BOLETO, LocalDate.now(), 500.00);
        Boleto b3 = new Boleto(3, BOLETO, LocalDate.now(), 250.00);

        pb.adiciona(b1);
        pb.adiciona(b2);
        pb.adiciona(b3);

        Fatura f2 = pb.gerarFatura("Marcos", 1500.00);
        assertEquals(1750.00, f2.getValorTotal());
        pb.limpaFaturas();

        //Iteração 3
        Boleto c1 = new Boleto(1, BOLETO, LocalDate.now(),500.00);
        Boleto c2 = new Boleto(1, BOLETO, LocalDate.now(),400.00);

        pb.adiciona(c1);
        pb.adiciona(c2);

        Fatura f3 = pb.gerarFatura("Carlos", 2000.00);
        assertNull(f3.getStatus());
        pb.limpaFaturas();
    }

}
