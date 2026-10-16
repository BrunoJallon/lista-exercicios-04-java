package questao5.model;

public class Guerreiro extends Personagem {

    private int forca;

    public Guerreiro(String nome, int vida, int forca) {
        super(nome, vida);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public void atacar(Personagem alvo) {
        //Com menos da metade da vida o guerreiro entra em furia e dobra o dano
        if (getVida() < getVidaMaxima() / 2) {
            System.out.println(getNome() + " entra em FURIA e golpeia " + alvo.getNome() + " com a espada!");
            alvo.receberDano(forca * 2);
        } else {
            System.out.println(getNome() + " golpeia " + alvo.getNome() + " com a espada.");
            alvo.receberDano(forca);
        }
    }

}
