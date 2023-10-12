package bridge;

public class Euro  extends TransacaoInternacional {
    public Euro(float valorTransacao) {
        super(valorTransacao);
    }

    public float calcularTransacao() {
        return (this.valorTransacao / 4) * (1 + this.formaDePagamento.percentualTaxaTransacao());
    }
}
