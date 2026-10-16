package questao5.model;

public class Mago extends Personagem {

    private static final int CUSTO_MAGIA = 30;
    private int inteligencia;
    private int mana;

    public Mago(String nome, int vida, int inteligencia, int mana) {
        super(nome, vida);
        this.inteligencia = inteligencia;
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public void atacar(Personagem alvo) {
        //Gasta mana para lancar magia; sem mana, ataca com o cajado
        if (mana >= CUSTO_MAGIA) {
            mana -= CUSTO_MAGIA;
            System.out.println(getNome() + " lanca uma BOLA DE FOGO em " + alvo.getNome() + "! (mana: " + mana + ")");
            alvo.receberDano(inteligencia * 3);
        } else {
            System.out.println(getNome() + " esta sem mana e bate em " + alvo.getNome() + " com o cajado.");
            alvo.receberDano(5);
        }
    }

}
