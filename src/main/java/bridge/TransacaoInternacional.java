package bridge;

public abstract class TransacaoInternacional {

    protected FormaDePagamento formaDePagamento;

    protected float valorTransacao;

    public TransacaoInternacional(float valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void setValorTransacao(float valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public abstract float calcularTransacao();
}
