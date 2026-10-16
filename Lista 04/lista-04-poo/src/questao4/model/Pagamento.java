package questao4.model;

public abstract class Pagamento {

    private String descricao;

    public Pagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Cada forma de pagamento implementa sua propria regra
    public abstract double processar(double valor);

    //Metodo concreto reaproveitado por todas as subclasses
    protected void exibirRecibo(String forma, double valor, double total) {
        System.out.println("[" + forma + "] " + descricao);
        System.out.printf("  Valor original: R$ %.2f%n", valor);
        System.out.printf("  Valor final:    R$ %.2f%n", total);
    }

}
