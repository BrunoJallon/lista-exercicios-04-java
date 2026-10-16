package questao4.model;

public class Pix extends Pagamento {

    private static final double DESCONTO = 0.02;
    private String chave;

    public Pix(String descricao, String chave) {
        super(descricao);
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public double processar(double valor) {
        double total = valor - valor * DESCONTO;
        exibirRecibo("Pix", valor, total);
        System.out.println("  Desconto de 2% | chave: " + chave);
        return total;
    }

}
