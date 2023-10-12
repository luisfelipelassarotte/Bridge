package bridge;

public class Libra  extends TransacaoInternacional {
    public Libra(float valorTransacao) {
        super(valorTransacao);
    }

    public float calcularTransacao() {
        return (this.valorTransacao / 2) * (1 + this.formaDePagamento.percentualTaxaTransacao());
    }
}
