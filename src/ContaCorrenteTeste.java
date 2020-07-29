import org.junit.Test;

import junit.framework.TestCase;

public class ContaCorrenteTeste extends TestCase {
    
    @Test
    public void testeSacar() {
        ContaCorrente contaCorrente = new ContaCorrente("12345", 100.0);
        contaCorrente.sacar(50.0);
        double saldoCalculado = contaCorrente.saldo;
        double saldoEsperado = -50.0;
        double tolerancia = 0.0001;
        assertEquals(saldoEsperado, saldoCalculado, tolerancia);
    }
}