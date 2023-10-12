package bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraTest {

    @Test
    void deveRetornarLibraNoPix() {
        FormaDePagamento formaDePagamento = new Pix();
        Libra libra = new Libra(1000.0f);
        libra.setFormaDePagamento(formaDePagamento);
        assertEquals(550.0f, libra.calcularTransacao(), 0.01f);
    }

    @Test
    void deveRetornarLibraNoCartao() {
        FormaDePagamento formaDePagamento = new Cartao();
        Libra libra = new Libra(1000.0f);
        libra.setFormaDePagamento(formaDePagamento);
        assertEquals(575.0f, libra.calcularTransacao(), 0.01f);
    }

    @Test
    void deveRetornarLibraNaTransferencia() {
        FormaDePagamento formaDePagamento = new Transferencia();
        Libra libra = new Libra(1000.0f);
        libra.setFormaDePagamento(formaDePagamento);
        assertEquals(625.0f, libra.calcularTransacao(), 0.01f);
    }

}