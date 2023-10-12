package bridge;

public class Dolar extends TransacaoInternacional {
    public Dolar(float valorTransacao) {
        super(valorTransacao);
    }

    public float calcularTransacao() {
        return (this.valorTransacao / 5) * (1 + this.formaDePagamento.percentualTaxaTransacao());
    }
}
