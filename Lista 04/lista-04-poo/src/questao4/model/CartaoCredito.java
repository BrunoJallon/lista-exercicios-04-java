package questao4.model;

public class CartaoCredito extends Pagamento {

    private static final double TAXA = 0.05;
    private int parcelas;

    public CartaoCredito(String descricao, int parcelas) {
        super(descricao);
        this.parcelas = parcelas;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public double processar(double valor) {
        double total = valor + valor * TAXA;
        exibirRecibo("Cartao de Credito", valor, total);
        System.out.printf("  Taxa de 5%% | %dx de R$ %.2f%n", parcelas, total / parcelas);
        return total;
    }

}
