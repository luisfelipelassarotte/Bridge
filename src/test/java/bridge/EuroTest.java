package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EuroTest {

    @Test
    void deveRetornarEuroNoPix() {
        FormaDePagamento formaDePagamento = new Pix();
        Euro euro = new Euro(1000.0f);
        euro.setFormaDePagamento(formaDePagamento);
        assertEquals(275.0f, euro.calcularTransacao(), 0.01f);
    }

    @Test
    void deveRetornarEuroNoCartao() {
        FormaDePagamento formaDePagamento = new Cartao();
        Euro euro = new Euro(1000.0f);
        euro.setFormaDePagamento(formaDePagamento);
        assertEquals(287.5f, euro.calcularTransacao(), 0.01f);
    }

    @Test
    void deveRetornarEuroNaTransferencia() {
        FormaDePagamento formaDePagamento = new Transferencia();
        Euro euro = new Euro(1000.0f);
        euro.setFormaDePagamento(formaDePagamento);
        assertEquals(312.5f, euro.calcularTransacao(), 0.01f);
    }


}