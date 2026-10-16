package questao5.model;

public class Arqueiro extends Personagem {

    private int destreza;
    private int flechas;
    private int disparos;

    public Arqueiro(String nome, int vida, int destreza, int flechas) {
        super(nome, vida);
        this.destreza = destreza;
        this.flechas = flechas;
    }

    public int getFlechas() {
        return flechas;
    }

    @Override
    public void atacar(Personagem alvo) {
        //Sem flechas, o arqueiro so consegue dar um soco
        if (flechas == 0) {
            System.out.println(getNome() + " esta sem flechas e soca " + alvo.getNome() + ".");
            alvo.receberDano(3);
            return;
        }
        flechas--;
        disparos++;
        //A cada terceira flecha acerta um tiro certeiro
        if (disparos % 3 == 0) {
            System.out.println(getNome() + " acerta um TIRO CERTEIRO em " + alvo.getNome() + "! (flechas: " + flechas + ")");
            alvo.receberDano(destreza * 3);
        } else {
            System.out.println(getNome() + " dispara uma flecha em " + alvo.getNome() + ". (flechas: " + flechas + ")");
            alvo.receberDano(destreza);
        }
    }

}
