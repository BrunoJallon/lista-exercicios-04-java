package questao4.model;

public class Boleto extends Pagamento {

    private static final double TAXA_FIXA = 3.50;
    private int diasVencimento;

    public Boleto(String descricao, int diasVencimento) {
        super(descricao);
        this.diasVencimento = diasVencimento;
    }

    public int getDiasVencimento() {
        return diasVencimento;
    }

    public void setDiasVencimento(int diasVencimento) {
        this.diasVencimento = diasVencimento;
    }

    @Override
    public double processar(double valor) {
        double total = valor + TAXA_FIXA;
        exibirRecibo("Boleto", valor, total);
        System.out.printf("  Taxa fixa de R$ %.2f | vence em %d dias%n", TAXA_FIXA, diasVencimento);
        return total;
    }

}
