package bridge;

public class Cartao  implements FormaDePagamento {
    public float percentualTaxaTransacao() {
        return 0.15f;
    }
}
