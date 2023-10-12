package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DolarTest {

    @Test
    void deveRetornarEuroNoPix() {
        FormaDePagamento formaDePagamento = new Pix();
        Dolar dolar = new Dolar(1000.0f);
        dolar.setFormaDePagamento(formaDePagamento);
        assertEquals(220.0f, dolar.calcularTransacao(), 0.01f);
    }

    @Test
    void deveRetornarEuroNoCartao() {
        FormaDePagamento formaDePagamento = new Cartao();
        Dolar dolar = new Dolar(1000.0f);
        dolar.setFormaDePagamento(formaDePagamento);
        assertEquals(230.0f, dolar.calcularTransacao(), 0.01f);
    }

    @Test
    void deveRetornarEuroNaTransferencia() {
        FormaDePagamento formaDePagamento = new Transferencia();
        Dolar dolar = new Dolar(1000.0f);
        dolar.setFormaDePagamento(formaDePagamento);
        assertEquals(250.0f, dolar.calcularTransacao(), 0.01f);
    }

}