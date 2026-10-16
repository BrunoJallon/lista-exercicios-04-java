import questao4.model.*;

void main() {

    //Array do tipo da classe abstrata guardando objetos das subclasses
    Pagamento[] pagamentos = {
            new CartaoCredito("Notebook", 10),
            new Boleto("Curso de Java", 3),
            new Pix("Livro de POO", "aluno@ifpb.edu.br")
    };

    double valor = 1000;
    double totalGeral = 0;

    //Polimorfismo: a mesma chamada executa a regra de cada subclasse
    for (Pagamento pagamento : pagamentos) {
        totalGeral += pagamento.processar(valor);
        System.out.println();
    }

    System.out.printf("Total processado: R$ %.2f%n", totalGeral);

}
