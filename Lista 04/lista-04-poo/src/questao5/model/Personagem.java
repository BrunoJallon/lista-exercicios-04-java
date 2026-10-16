package questao5.model;

public abstract class Personagem {

    private String nome;
    private int vida;
    private int vidaMaxima;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        vida = Math.max(0, vida - dano);
        System.out.println("   " + nome + " recebe " + dano + " de dano (vida: " + vida + "/" + vidaMaxima + ")");
        if (!estaVivo()) {
            System.out.println("   " + nome + " foi derrotado!");
        }
    }

    //Cada tipo de personagem ataca de um jeito diferente
    public abstract void atacar(Personagem alvo);

    @Override
    public String toString() {
        return nome + " (" + getClass().getSimpleName() + ") - vida: " + vida + "/" + vidaMaxima;
    }

}
